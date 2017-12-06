package com.kvlt.cloud.configuration;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Provider2Configuration
 *
 * @author KVLT
 * @date 2017-11-27.
 */
@Configuration
@RibbonClient(name = "microservice2", configuration = RoundRobinRuleConfig.class)
public class Provider2Configuration {
}
