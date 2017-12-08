package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
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
@EnableHystrixDashboard
public class ConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboardApplication.class, args);
    }

}
