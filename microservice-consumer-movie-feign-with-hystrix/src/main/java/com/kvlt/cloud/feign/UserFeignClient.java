package com.kvlt.cloud.feign;

import com.kvlt.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * UserFeignClient
 *
 * @author KVLT
 * @date 2017-12-06.
 */
@FeignClient(name = "microservice-provider-user", fallback = HystrixClientFallback.class)
public interface UserFeignClient {

    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);  // 两个坑： 1.@GetMapping不支持，2.@PathVariable需要设置value

}
