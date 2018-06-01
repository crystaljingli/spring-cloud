package com.lijing.provideruser.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Title: DescriptionUtils
 * Package: com.lijing.provideruser.annotation
 * Author: LiJing
 * CreateTime: 2018年05月31日 11:09
 * Description:
 * 1.所有注解的方法API
 * 2.标注其意思和功能
 */
public class DescriptionUtils {


    //获取注解类的方法和变量
    public static void getDescriptionInfo(Class t){
        //2.获取方法
        Method[] declaredMethods = t.getDeclaredMethods();
        for(Method method : declaredMethods){
            if(method.isAnnotationPresent(Description.class)){
                Description annotation = method.getAnnotation(Description.class);
                System.out.println(annotation.value());
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                for(Annotation annotation1 : declaredAnnotations){
                    System.out.println(annotation1.annotationType());
                    if(annotation1.annotationType().equals("interface com.lijing.provideruser.annotation.Description")){
                        System.out.println("=====");
                    }

                }
            }
        }

        //3.获取变量
        Field[] fields = t.getDeclaredFields();
        for(Field field : fields){
            if(field.isAnnotationPresent(Description.class)){
                Description annotation = field.getAnnotation(Description.class);
                System.out.println(annotation.value());
            }
        }
    }

    //获取被注解的类信息
    public static void getDescriptionClass(String className){
        //1.获取类
        try {
            //反射里面获取类
            Class<?> aClass = Class.forName(className);
            boolean annotation = aClass.isAnnotationPresent(Description.class);
            if(annotation){
                Description annotation1 = aClass.getAnnotation(Description.class);
                System.out.println(annotation1.value());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
