package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * MicroserviceDiscoveryEurekaApplication
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayZuulFilterApplication {

    @Bean
    public PreZuulFilter preZuulFilter() {
        return new PreZuulFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulFilterApplication.class, args);
    }

}
