package com.kvlt.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * UserController
 *
 * @author KVLT
 * @date 2017-11-27.
 */
@RestController
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserController {

    //private static final String URL = "http://localhost:7777/api/user/{id}";

    @Value("${user.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    public String get(@PathVariable(value = "id") int id) {
        return restTemplate.getForObject(url, String.class, id);
    }

}
