package com.kvlt.cloud.configuration;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * ProviderConfiguration
 *
 * @author KVLT
 * @date 2017-11-27.
 */
@Configuration
@RibbonClient(name = "microservice", configuration = RandomRuleConfig.class)
public class ProviderConfiguration {

}
