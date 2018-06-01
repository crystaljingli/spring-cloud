package com.lijing.provideruser.annotation;

/**
 * Title: TestDescription
 * Package: com.lijing.provideruser.annotation
 * Author: LiJing
 * CreateTime: 2018年05月31日 11:29
 * Description:
 */
public class TestDescription {

    public static void main(String[] args){
        System.out.println("TestDescription=========start");
        String className = "com.lijing.provideruser.annotation.UseAnnotation";
        DescriptionUtils.getDescriptionInfo(UseAnnotation.class);
        DescriptionUtils.getDescriptionClass(className);
        System.out.println("TestDescription=========end");
    }
}
