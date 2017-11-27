package com.kvlt.cloud.controller;

import com.kvlt.cloud.entity.User;
import com.kvlt.cloud.reposistory.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        System.out.println("id ------ " + id);
        return this.userRepository.findOne(id);
    }

    @GetMapping("/eureka-instane")
    public String serviceUrl() {
        InstanceInfo info = this.eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER", false);
        return info.getHomePageUrl();
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance instance = this.discoveryClient.getLocalServiceInstance();
        return instance;
    }

}
