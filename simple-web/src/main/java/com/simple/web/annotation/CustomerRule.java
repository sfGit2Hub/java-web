package com.simple.web.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by SF on 2017/4/27.
 * <p>使用注解的方式加载定义的注解处理器</p>
 * <p>需要定义一个标注是自定义的注解处理器的注解</p>
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface CustomerRule {
}
