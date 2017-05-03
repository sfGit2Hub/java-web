package com.simple.web.annotation.imp;

import com.simple.web.annotation.CustomerValidatorRule;
import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;
import org.springframework.validation.Errors;

import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by SF on 2017/4/27.
 */
public abstract class AbastractCustomerValidatorRule implements CustomerValidatorRule{
    @Override
    public abstract boolean support(Annotation annotation);

    @Override
    public void valid(Annotation annotation, Object target, Field field, Errors errors) throws Exception {
        this.preHandle(annotation, target, field, errors);
        PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(target.getClass(),
                field.getName());
        Method reader = propertyDescriptor.getReadMethod();
        Object property = reader.invoke(target);
        this.validProperty(annotation, property, new PostHandler() {
            public void postHanle(String errorCode, String message) {
                errors.rejectValue(field.getName(), errorCode, message);
            }
        });
    }

    public static interface PostHandler {
        public void postHanle(String errorCode, String message);
    }
    /**
     *
     */
    private void preHandle(Annotation annotation, Object target, Field field, Errors errors) {
        Assert.notNull(target);
        Assert.notNull(annotation);
        Assert.notNull(errors);
        Assert.notNull(field);
    }

    public abstract void validProperty(Annotation annotation, Object property,PostHandler postHandler);
}
