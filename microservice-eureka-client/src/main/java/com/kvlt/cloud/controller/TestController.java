package com.kvlt.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author KVLT
 * @date 2017-11-26.
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        System.out.println(name + " welcome. My is microservice provider user");
        return name + " welcome. My is microservice provider user";
    }

}
