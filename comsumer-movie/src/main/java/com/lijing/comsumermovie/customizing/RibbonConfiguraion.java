package com.lijing.comsumermovie.customizing;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Title: RibbonConfiguraion
 * Package: com.lijing.comsumermovie.customizing
 * Author: LiJing
 * CreateTime: 2018年05月30日 16:33
 * Description:ribbon默认配置类：RibbonClientsConfiguration.class
 * 为了不让所有的客户端都使用自定义的ribbon,该类必须放在@ComponentScan不扫描的地方
 * 为了其他功能暂时屏蔽该组件
 */
//@Configurable
public class RibbonConfiguraion {

    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
