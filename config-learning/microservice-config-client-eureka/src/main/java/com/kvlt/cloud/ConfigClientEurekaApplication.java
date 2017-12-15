package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ConfigClientApplication
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApplication.class, args);
    }

}
