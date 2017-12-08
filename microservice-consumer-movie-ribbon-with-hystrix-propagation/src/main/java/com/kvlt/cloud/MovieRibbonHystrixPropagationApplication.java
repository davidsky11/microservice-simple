package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * MicroserviceConsumerMovieRibbonApplication
 *
 * @author KVLT
 * @date 2017-11-29.
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "microservice-provider-user")  // 通过注解屏蔽扫描
@EnableCircuitBreaker
public class MovieRibbonHystrixPropagationApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MovieRibbonHystrixPropagationApplication.class, args);
    }
}
