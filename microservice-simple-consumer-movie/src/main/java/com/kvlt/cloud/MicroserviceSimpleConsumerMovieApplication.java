package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * MicroserviceSimpleConsumerMovieApplication
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSimpleConsumerMovieApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleConsumerMovieApplication.class, args);
    }
}
