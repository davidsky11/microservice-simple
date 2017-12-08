package com.kvlt.cloud.feign;

import com.kvlt.cloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * HystrixClientFallbackFactory
 *
 * @author KVLT
 * @date 2017-12-08.
 */
@Component
public class HystrixClientFallbackFactory implements FallbackFactory<UserFeignClient2> {

    @Override
    public UserFeignClient2 create(Throwable cause) {
        return new HystrixClientWithFallBackFactory() {

            @Override
            public User findById(Long id) {
                User user = new User();
                user.setId(0L);
                user.setUsername("loser");
                return user;
            }
        };
    }

}
