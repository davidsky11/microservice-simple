package com.kvlt.cloud.controller;

import com.kvlt.cloud.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * ApiUserController
 *
 * @author KVLT
 * @date 2017-11-27.
 */
@RestController
@RequestMapping(value = "/api/user")
public class ApiUserController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User view(@PathVariable int id) {
        User user = new User();
        user.setId(id);
        user.setName("悟净");
        user.setCreateTime(new Date());

        return user;
    }
}
