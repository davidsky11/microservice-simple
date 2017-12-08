package com.kvlt.cloud.feign;

import org.springframework.stereotype.Component;

/**
 * HystrixClientFallback
 *
 * @author KVLT
 * @date 2017-12-08.
 */
@Component
public class HystrixClientFallback2 implements UserFeignClient2 {

    @Override
    public String findServiceInfoEurekaByServiceName(String serviceName) {
        return "fallback";
    }
}
