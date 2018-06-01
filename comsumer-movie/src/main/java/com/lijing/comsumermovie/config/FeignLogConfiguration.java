package com.lijing.comsumermovie.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Title: FeignLogConfiguration
 * Package: com.lijing.comsumermovie.config
 * Author: LiJing
 * CreateTime: 2018年05月30日 18:16
 * Description:feign的日志
 */
//@Configuration
public class FeignLogConfiguration {

    @Bean
    Logger.Level feignLoggerLever(){
        return Logger.Level.FULL;
    }
}
