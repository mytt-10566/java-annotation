package com.momo.java_annotation.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)// 声明注解的保留期限
@Target(ElementType.METHOD)// 声明可以使用该注解的目标类型
public @interface NeedTest {
	
	// 无入参、无抛出异常
	// 可以指定默认值
	boolean value() default false;

}
