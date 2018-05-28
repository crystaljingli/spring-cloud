package com.lijing.provideruser.controller;

import com.lijing.provideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * Title: UserController
 * Package: com.lijing.springcloudprovideruser.controller
 * Author: LiJing
 * CreateTime: 2018年05月23日 19:42
 * Description:
 */
@RestController
public class UserController {



    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = new User();
        user.setId(111111L);
        user.setUserName("xiaoMing");
        user.setAge(15);
        user.setBalance(new BigDecimal("2300"));
        return user;
    }
}
