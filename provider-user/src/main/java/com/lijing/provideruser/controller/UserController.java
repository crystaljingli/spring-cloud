package com.lijing.provideruser.controller;

import com.lijing.provideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Map;
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
        System.out.println("port:8000");
        User user = new User();
        user.setId(111111L);
        user.setUserName("xiaoMing");
        user.setAge(15);
        user.setBalance(new BigDecimal("2300"));
        return user;
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam Map<String,Object> map){
        User user = new User();
        user.setId(4L);
        user.setAge(45);
        user.setBalance(new BigDecimal("234"));
        user.setUserName("WangHua");
        System.out.println(map.get("id").toString()+map.get("age").toString()+map.get("balance").toString()+map.get("userName").toString());
        return user;
    }

    @PostMapping("/postUser")
    public User postUser(@RequestBody User user){
        return user;
    }
}
