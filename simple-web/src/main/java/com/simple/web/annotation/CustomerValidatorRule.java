package com.simple.web.annotation;

import org.springframework.validation.Errors;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by SF on 2017/4/27.
 * 自定义注释的 处理器接口
 */
public interface CustomerValidatorRule {
    /**
     * 判断是否支持该注解
     *
     * @param annotation
     * @return
     */
    public boolean support(Annotation annotation);

    /**
     *  校验处理
     *
     *
     * @param annotation
     * @param field
     * @param errors
     */
    public void valid(Annotation annotation, Object object, Field field, Errors errors)
            throws Exception;
}
