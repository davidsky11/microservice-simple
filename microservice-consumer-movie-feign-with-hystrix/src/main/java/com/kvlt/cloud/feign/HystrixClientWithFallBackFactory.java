package com.kvlt.cloud.feign;

import com.kvlt.cloud.entity.User;

/**
 * HystrixClientWithFallBackFactory
 *
 * @author KVLT
 * @date 2017-12-08.
 */
public abstract class HystrixClientWithFallBackFactory implements UserFeignClient2 {

    public abstract User findById(Long id);

}
