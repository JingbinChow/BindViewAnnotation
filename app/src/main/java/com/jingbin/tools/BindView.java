package com.jingbin.tools;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by JingbinChow
 * on 2017/3/29.
 * FindViewById注解
 */
@Target(ElementType.FIELD) //注解目标为域
@Retention(RetentionPolicy.RUNTIME) //运行时注解
public @interface BindView {
    int value() default 0;//当前注解只需要一个值，所以我们用value 默认值为0
}
