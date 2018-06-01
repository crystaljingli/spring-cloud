package com.lijing.comsumermovie.feign;

import com.lijing.comsumermovie.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: UserController
 * Package: com.lijing.comsumermovie.feign
 * Author: LiJing
 * CreateTime: 2018年05月30日 17:11
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserFeignClient userFeignClient;


    @RequestMapping("/{id}")
    public User findById(@PathVariable(value="id") Long id){
        return  userFeignClient.findById(id);
    }



    @GetMapping("/get-user")
    public User getUser(){
        Map<String, Object> map = new HashMap<>();
        map.put("id",2L);
        map.put("age",23);
        map.put("balance",new BigDecimal("7890"));
        map.put("userName","WangHua");
        return userFeignClient.getUser(map);
    }

   @GetMapping("/post-user")
   public User postUser(){
       User user = new User();
       user.setId(111111L);
       user.setUserName("XiaoMing");
       user.setAge(15);
       user.setBalance(new BigDecimal("2300"));
        return userFeignClient.postUser(user);
   }
}
