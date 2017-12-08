package com.kvlt.cloud.feign;

import com.kvlt.cloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * HystrixClientFallbackFactory
 *
 * @author KVLT
 * @date 2017-12-08.
 */
@Component
public class HystrixClientFallbackFactory implements FallbackFactory<UserFeignClient2> {

    private static Logger logger = LoggerFactory.getLogger(HystrixClientFallbackFactory.class);

    @Override
    public UserFeignClient2 create(Throwable cause) {
        logger.info(String.format("fallback: reason was: " + cause.getMessage()));
        return new UserFeignClientWithFallBackFactory() {

            @Override
            public User findById(Long id) {
                User user = new User();
                user.setId(-1L);
                user.setUsername("loser");
                return user;
            }
        };
    }

}
