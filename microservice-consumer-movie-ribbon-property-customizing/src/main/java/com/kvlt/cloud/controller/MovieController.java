package com.kvlt.cloud.controller;

import com.kvlt.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
}
