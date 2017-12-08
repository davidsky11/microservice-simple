package com.kvlt.cloud.feign;

import com.kvlt.cloud.entity.User;
import org.springframework.stereotype.Component;

/**
 * HystrixClientFallback
 *
 * @author KVLT
 * @date 2017-12-08.
 */
@Component
public class HystrixClientFallback implements UserFeignClient {

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }

}
