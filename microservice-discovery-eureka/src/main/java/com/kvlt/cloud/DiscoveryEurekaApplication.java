package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * MicroserviceDiscoveryEurekaApplication
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryEurekaApplication {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(MicroserviceDiscoveryEurekaApplication.class).web(true).run(args);
        SpringApplication.run(DiscoveryEurekaApplication.class, args);
    }
}
