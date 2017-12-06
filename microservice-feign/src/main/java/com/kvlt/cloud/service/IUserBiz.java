package com.kvlt.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * IUserBiz
 *
 * @author KVLT
 * @date 2017-11-27.
 */
@FeignClient(value = "microservice-feign")
public interface IUserBiz {

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    String view(@PathVariable(value = "id") int id);
}
