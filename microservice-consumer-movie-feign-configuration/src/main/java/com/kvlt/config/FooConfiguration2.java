package com.kvlt.config;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TestConfiguration
 * 自定义配置
 * @author KVLT
 * @date 2017-11-29.
 */
@Configuration
public class FooConfiguration2 {

    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password123");
    }

}
