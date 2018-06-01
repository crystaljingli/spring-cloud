package com.lijing.provideruser.annotation;

import java.lang.annotation.*;

/**
 * Title: Description
 * Package: com.lijing.provideruser.annotation
 * Author: LiJing
 * CreateTime: 2018年05月31日 11:03
 * Description:
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Description {

    String value();
}
