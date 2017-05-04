package com.simple.web.annotation.imp;

import com.simple.web.annotation.CustomerRule;
import com.simple.web.annotation.CustomerValidatorRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/5/4.
 */
@Component
public class CustomerValidatorFactory implements Validator {
    @Autowired
    private CustomerValidatorConfig validatorConfig;

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }

    @Override
    public void validate(Object object, Errors error) {
        Assert.notNull(object);
        Assert.notNull(error);
        List<Field> fields = this.getFields(object.getClass());
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().getAnnotation(CustomerRule.class) != null) {
                    try {
                        CustomerValidatorRule validatorRule = validatorConfig.findRule(annotation);
                        if (validatorRule != null) {
                            validatorRule.valid(annotation, object, field, error);
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private List<Field> getFields(Class<? extends Object> clazz) {
        List<Field> fieldList = new ArrayList<>();
        while (clazz != null) {
            Collections.addAll(fieldList, clazz.getDeclaredFields());
            clazz = clazz.getSuperclass();
        }
        return fieldList;
    }
}
