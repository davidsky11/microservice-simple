package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * MicroserviceDiscoveryEurekaApplication
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaApplication.class, args);
    }

}
