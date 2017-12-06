package com.kvlt.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TestConfiguration
 * 自定义配置
 * @author KVLT
 * @date 2017-11-29.
 */
@Configuration
public class FooConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
