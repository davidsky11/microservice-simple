package com.kvlt.cloud.feign;

import com.kvlt.config.FooConfiguration2;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * FeignClient
 *
 * @author KVLT
 * @date 2017-12-07.
 */
@FeignClient(name = "xxxx", url = "http://localhost:8761/", configuration = FooConfiguration2.class, fallback = HystrixClientFallback2.class)
public interface UserFeignClient2 {

    @RequestLine("GET /eureka/apps/{serviceName}")
//    @GetMapping(value = "/eureka/apps/{serviceName}")
    public String findServiceInfoEurekaByServiceName(@Param("serviceName") String serviceName);

}
