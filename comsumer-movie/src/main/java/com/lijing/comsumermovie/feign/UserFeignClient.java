package com.lijing.comsumermovie.feign;

import com.lijing.comsumermovie.entity.User;
import com.lijing.comsumermovie.fallback.UserFallback;
import com.lijing.comsumermovie.fallback.UserFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Title: UserFeignClient
 * Package: com.lijing.comsumermovie.feign
 * Author: LiJing
 * CreateTime: 2018年05月30日 17:04
 * Description:User客户端
 */
//@FeignClient(name = "PROVIDER-USER",configuration = FeignConfiguration.class,FeignLogConfiguration.class)
//@FeignClient(name = "PROVIDER-USER",fallback = UserFallback.class)
@FeignClient(name = "PROVIDER-USER",fallbackFactory = UserFallbackFactory.class)
public interface UserFeignClient {

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    User findById(@PathVariable(value="id") Long id);

    @RequestMapping(value="/getUser",method = RequestMethod.GET)
    User getUser(@RequestParam Map<String,Object> map);

    @RequestMapping(value="/postUser",method = RequestMethod.POST)
    User postUser(@RequestBody User user);
}
