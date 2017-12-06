package com.kvlt.cloud.configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * RandomRuleConfig
 * 随机算法
 * @author KVLT
 * @date 2017-11-27.
 */
//@Configuration
public class RandomRuleConfig {

    @Bean
    public IRule randomRule() {
        return new RandomRule();
    }

}
