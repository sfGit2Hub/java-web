package com.simple.web.annotation.imp;

import com.simple.web.annotation.CustomerRule;
import com.simple.web.annotation.DateString;

import java.lang.annotation.Annotation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by SF on 2017/4/27.
 * 处理 DateString注解的问题
 */
@CustomerRule
public class DateValidatorRule extends AbstractCustomerValidatorRule {
    @Override
    public boolean support(Annotation annotation) {
        return annotation instanceof DateString;
    }

    @Override
    public void validProperty(Annotation annotation, Object property, PostHandler postHandler) {
        DateString ds = (DateString) annotation;
        if (this.parse(ds.pattern(), (String) property) == null) {
            postHandler.postHandle(ds.errorCode(), ds.message());
        }
    }

    private Date parse(String pattern, String property) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.parse(property);
        } catch (ParseException e) {
            //do noting
        }
        return null;
    }
}
