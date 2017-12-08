package com.kvlt.cloud.controller;

import com.kvlt.cloud.feign.UserFeignClient2;
import com.kvlt.cloud.feign.UserFeignClient;
import com.kvlt.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * MovieController
 *
 * @author KVLT
 * @date 2017-11-29.
 */
@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @Autowired
    private UserFeignClient2 userFeignClient2;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }

    @GetMapping("/{serviceName}")
    public String findServiceInfoEurekaByServiceName(@PathVariable("serviceName") String serviceName) {
        return this.userFeignClient2.findServiceInfoEurekaByServiceName(serviceName);
    }

}
