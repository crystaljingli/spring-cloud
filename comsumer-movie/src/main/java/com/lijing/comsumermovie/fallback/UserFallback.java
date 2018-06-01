package com.lijing.comsumermovie.fallback;

import com.lijing.comsumermovie.entity.User;
import com.lijing.comsumermovie.feign.UserFeignClient;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Title: UserFallback
 * Package: com.lijing.comsumermovie.fallback
 * Author: LiJing
 * CreateTime: 2018年05月31日 15:01
 * Description:
 */
@Component
public class UserFallback implements UserFeignClient{

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setUserName("findById默认用户");
        return user;
    }

    @Override
    public User getUser(Map<String, Object> map) {
        User user = new User();
        user.setId(-2L);
        user.setUserName("getUser默认用户");
        return user;
    }

    @Override
    public User postUser(User user) {
        user.setId(-3L);
        user.setUserName("postUser默认用户");
        return user;
    }
}
