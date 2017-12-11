package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * MicroserviceFileUploadApplication
 *
 * @author KVLT
 * @date 2017-12-11.
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroserviceFileUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceFileUploadApplication.class, args);
    }

}
