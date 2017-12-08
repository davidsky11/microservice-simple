package com.kvlt.cloud.controller;

import com.kvlt.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * MovieController
 *
 * @author KVLT
 * @date 2017-11-29.
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        // VIP  virtual IP      HAProxy   HeartBeat
        return this.restTemplate.getForObject("http://microservice-provider-user/simple/" + id, User.class);
    }

    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("microservice-provider-user");
        System.out.println(serviceInstance.getHost() + ":" + serviceInstance.getPort() + ":" + serviceInstance.getServiceId());

        return "1";
}

    @GetMapping("list-all")
    public List<User> listAll() {
        // wrong
        /*List<User> list1 = this.restTemplate.getForObject("http://microservice-provider-user/list-all", List.class);
        for (User user : list1) {
            System.out.println(user.getId());
        }*/

        // right 方法1
        /*User[] users = this.restTemplate.getForObject("http://microservice-provider-user/list-all", User[].class);
        List<User> list = Arrays.asList(users);*/

        // right 方法2
        ResponseEntity<List<User>> result = this.restTemplate.exchange("http://microservice-provider-user/list-all",
                HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<List<User>>() {});
        List<User> list1 = result.getBody();

        return list1;
    }

}
