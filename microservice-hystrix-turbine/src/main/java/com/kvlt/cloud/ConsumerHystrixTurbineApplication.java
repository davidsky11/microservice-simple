package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * MicroserviceConsumerMovieFeignApplication
 *
 * @author KVLT
 * @date 2017-11-29.
 */
@SpringBootApplication
@EnableTurbine
public class ConsumerHystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixTurbineApplication.class, args);
    }

}
