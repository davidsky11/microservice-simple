package com.kvlt.cloud.configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;

/**
 * RoundRobinRuleConfig
 *
 * @author KVLT
 * @date 2017-11-27.
 */
//@Configuration
public class RoundRobinRuleConfig {

    @Bean
    public IRule roundRobinRule() {
        return new RoundRobinRule();
    }

}
