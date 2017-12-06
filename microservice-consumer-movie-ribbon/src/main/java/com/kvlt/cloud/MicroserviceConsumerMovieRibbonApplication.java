package com.kvlt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

/**
 * MicroserviceConsumerMovieRibbonApplication
 *
 * @author KVLT
 * @date 2017-11-29.
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "microservice-provider-user", configuration = TestConfiguration2.class)  // 通过注解屏蔽扫描
//@RibbonClient(name = "microservice-provider-user", configuration = TestConfiguration.class)  // 转移到其他目录，避免被扫描到
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFromComponentScan.class)})  // 不扫描带这个注解的路径或文件
public class MicroserviceConsumerMovieRibbonApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieRibbonApplication.class, args);
    }
}
