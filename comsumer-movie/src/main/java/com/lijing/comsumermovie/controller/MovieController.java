package com.lijing.comsumermovie.controller;

import com.lijing.comsumermovie.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Title: MovieController
 * Package: com.lijing.springcloudcomsumermovie.controller
 * Author: LiJing
 * CreateTime: 2018年05月23日 20:00
 * Description:
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    @GetMapping("/movie/user/{id}")
    public User findById(@PathVariable Long id){
        return restTemplate.getForObject("http://PROVIDER-USER/"+id, User.class);
    }

    public User findByIdFallback(Long id){
        User user = new User();
        user.setId(-1L);
        user.setUserName("默认用户");
        return user;
    }
}
