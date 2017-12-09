package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/**
 * MicroserviceDiscoveryEurekaApplication
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@SpringBootApplication
@EnableZuulProxy  // 组合注解  包含 @EnableCircuitBreaker @EnableDiscoveryClient
public class GatewayZuulRegExpApplication {

    // 将 microservice-provider-user-v1 映射成 /v1/microservice-provider-user/
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
        return new PatternServiceRouteMapper(
                "(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}");
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulRegExpApplication.class, args);
    }

}
