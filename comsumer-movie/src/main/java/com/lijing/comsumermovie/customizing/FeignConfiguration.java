package com.lijing.comsumermovie.customizing;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Title: FeignConfiguration
 * Package: com.lijing.comsumermovie.customizing
 * Author: LiJing
 * CreateTime: 2018年05月30日 17:33
 * Description:
 * Feign默认类:FeignClientsConfiguration.class,定义了编码器，解码器，契约
 */
//@Configuration
public class FeignConfiguration {


    @Bean
    public Contract feignContract(){
        //默认的是springMvcContract
        return new feign.Contract.Default();
    }
}
