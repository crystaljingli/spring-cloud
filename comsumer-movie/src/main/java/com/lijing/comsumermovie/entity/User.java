package com.lijing.comsumermovie.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Title: User
 * Package: com.lijing.springcloudprovideruser.entity
 * Author: LiJing
 * CreateTime: 2018年05月23日 19:33
 * Description:
 */
@Data
public class User {

    private Long id;
    private String userName;
    private Integer age;
    private BigDecimal balance;
}
