package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * MicroserviceEurekaClient
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@SpringBootApplication
@EnableEurekaClient // 启动EnableEureka客户端
public class MicroserviceEurekaClient {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaClient.class, args);
    }

}
