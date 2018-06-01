package com.lijing.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: ConfigClientController
 * Package: com.lijing.configserver.controller
 * Author: LiJing
 * CreateTime: 2018年05月31日 17:35
 * Description:
 */
@RestController
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String hello(){
        return this.profile;
    }
}
