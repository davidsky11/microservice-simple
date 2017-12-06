package com.kvlt.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TestConfiguration
 * 自定义配置
 * @author KVLT
 * @date 2017-11-29.
 */
@Configuration
public class TestConfiguration {

//    @Autowired
//    IClientConfig config;

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

}
