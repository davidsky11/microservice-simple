package com.kvlt.cloud.controller;

import com.kvlt.cloud.entity.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * UserController
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@RestController
public class UserController {

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        System.out.println("id ------ " + id);
        User user = new User();
        user.setId(id);
        user.setUsername("UserName_" + id);
        user.setAge(Short.parseShort("2"));
        user.setBalance(new BigDecimal(88));
        return user;
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

    @PostMapping("/user")
    public User postUser(@RequestBody User user) {
        return user;
    }
}
