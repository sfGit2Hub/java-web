package com.simple.web.annotation;

import java.lang.annotation.*;

/**
 * Created by SF on 2017/4/27.
 * 这个注解中没有任何内容，属于标记注解
 */
@Documented
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerAnnotation {
}
