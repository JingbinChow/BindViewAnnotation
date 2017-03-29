package com.jingbin.tools;

import android.app.Activity;

import java.lang.reflect.Field;

/**
 * Created by JingbinChow
 * on 2017/3/29.
 */

public class InitBindView {


    public static void initBindView(Activity activity) {

        try {

            Class<Activity> clazz = (Class<Activity>) activity.getClass();//通过getClass拿到activity实例
            Field[] fields = clazz.getDeclaredFields();//通过反射拿到类内属性
            //循环取出属性
            for (Field field : fields) {
                if (field.isAnnotationPresent(BindView.class)) {//判断属性是否使用注解
                    BindView inject = field.getAnnotation(BindView.class);//如果使用就获得该类上注解
                    int id = inject.value();
                    if (0 != id) {
                        field.setAccessible(true);//提高反射速度
                        field.set(activity, activity.findViewById(id));//给被注解属性赋值
                    }
                }
            }

        } catch (Exception e) {

        }

    }

}
