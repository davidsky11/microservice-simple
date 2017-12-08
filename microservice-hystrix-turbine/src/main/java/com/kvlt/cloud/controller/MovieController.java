package com.kvlt.cloud.controller;

import com.kvlt.cloud.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * MovieController
 *
 * @author KVLT
 * @date 2017-11-29.
 */
@RestController
public class MovieController {

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("USERNAME_" + id);
        user.setName("UN_" + id);
        user.setAge((short)8);
        return user;
    }

}
