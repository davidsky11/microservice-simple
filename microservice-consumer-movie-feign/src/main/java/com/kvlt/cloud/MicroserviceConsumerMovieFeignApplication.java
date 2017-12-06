package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * MicroserviceConsumerMovieFeignApplication
 *
 * @author KVLT
 * @date 2017-11-29.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan
public class MicroserviceConsumerMovieFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieFeignApplication.class, args);
    }

}
