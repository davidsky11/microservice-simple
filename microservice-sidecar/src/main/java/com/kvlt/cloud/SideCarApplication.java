package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * SidecarApplication
 *
 * @author KVLT
 * @date 2017-12-12.
 */
@SpringBootApplication
@EnableSidecar
public class SideCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SideCarApplication.class, args);
    }

}
