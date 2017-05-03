package com.simple.web.annotation;

import java.lang.annotation.*;

/**
 * Created by SF on 2017/4/27.
 * @自定义 日期类型校验器的注解
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@CustomerAnnotation
public @interface DateString {
    String pattern() default "yyyy-MM-dd HH:mm:ss";

    String errorCode() default "must date";

    String message() default "must be date pattern";
}
