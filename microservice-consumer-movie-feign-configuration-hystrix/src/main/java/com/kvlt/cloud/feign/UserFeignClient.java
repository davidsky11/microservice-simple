package com.kvlt.cloud.feign;

import com.kvlt.cloud.entity.User;
import com.kvlt.config.FooConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * UserFeignClient
 *
 * @author KVLT
 * @date 2017-12-06.
 */
@FeignClient(name = "microservice-provider-user", configuration = FooConfiguration.class, fallback = HystrixClientFallback.class)
public interface UserFeignClient {

    @RequestLine("GET /simple/{id}")
    public User findById(@Param("id") Long id);

}
