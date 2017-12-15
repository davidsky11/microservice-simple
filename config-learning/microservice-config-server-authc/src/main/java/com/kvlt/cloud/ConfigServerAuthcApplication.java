package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * MicroserviceDiscoveryEurekaApplication
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerAuthcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerAuthcApplication.class, args);
    }

}
