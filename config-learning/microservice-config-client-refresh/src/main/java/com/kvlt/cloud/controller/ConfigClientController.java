package com.kvlt.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConfigClientController
 *
 * @author KVLT
 * @date 2017-12-14.
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String getProfile() {
        return this.profile;
    }

}
