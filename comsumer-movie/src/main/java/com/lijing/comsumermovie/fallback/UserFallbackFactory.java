package com.lijing.comsumermovie.fallback;

import com.lijing.comsumermovie.entity.User;
import com.lijing.comsumermovie.feign.UserController;
import com.lijing.comsumermovie.feign.UserFeignClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Title: UserFallbackFactory
 * Package: com.lijing.comsumermovie.fallback
 * Author: LiJing
 * CreateTime: 2018年05月31日 15:11
 * Description:
 */
@Component
public class UserFallbackFactory implements FallbackFactory<UserFeignClient>{

    private static final Logger logger = LoggerFactory.getLogger(UserFallbackFactory.class);

    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClient() {
            @Override
            public User findById(Long id) {
                logger.info("findById fallback reason:",throwable);
                User user = new User();
                user.setId(-1L);
                user.setUserName("findById默认用户");
                //针对不同的异常返回不同的结果，使异常变得比较灵活
                if(throwable instanceof IllegalArgumentException){
                    user.setId(-2L);
                }
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
                logger.info("postUser fallback reason:",throwable);
                user.setId(-3L);
                user.setUserName("postUser默认用户");
                return user;
            }
        };
    }
}
