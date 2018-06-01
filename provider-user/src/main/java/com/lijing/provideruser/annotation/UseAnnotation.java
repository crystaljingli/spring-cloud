package com.lijing.provideruser.annotation;

/**
 * Title: UseAnnotation
 * Package: com.lijing.provideruser.annotation
 * Author: LiJing
 * CreateTime: 2018年05月31日 11:05
 * Description:
 */
@Description("I am class annotation")
public class UseAnnotation {

    @Description("I am field annotation-description")
    @Description1("I am field annotation-description")
    @Description2("I am field annotation-description")
    private String userName;

    @Description("I am method annotation-description")
    @Description1("I am method annotation-description")
    @Description2("I am method annotation-description")
    public void hello(){
    }

    @Description("I am moreParams annotation-description")
    @Description1("I am moreParams annotation-description")
    @Description2("I am moreParams annotation-description")
    public void moreParams(String userName,String age){
        System.out.println("方法内部的参数userName="+userName+",age="+age);
    }
}
