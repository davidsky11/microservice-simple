package com.kvlt.cloud.controller;

import com.kvlt.cloud.service.IUserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * FeignUserController
 *
 * @author KVLT
 * @date 2017-11-27.
 */
@RestController
@RequestMapping(value = "/feign/user", method = RequestMethod.POST)
public class FeignUserController {

    @Autowired
    private IUserBiz userBiz;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable(value = "id") int id) {
        return userBiz.view(id);
    }
}
