package com.simple.web.annotation.imp;

import com.simple.web.annotation.CustomerRule;
import com.simple.web.annotation.CustomerValidatorRule;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by SF on 2017/5/3.
 */
public class CustomerValidatorConfig implements ApplicationContextAware {
    private Map<Annotation, CustomerValidatorRule> rules = new ConcurrentHashMap<>();
    Map<String, Object> customerValidationRules = null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        customerValidationRules = applicationContext.getBeansWithAnnotation(CustomerRule.class);
        System.out.println(customerValidationRules);
    }

    public CustomerValidatorRule findFormMap(Annotation annotation) {
        for (Map.Entry<String, Object> entry : customerValidationRules.entrySet()) {
            if (entry.getValue() != null && ((CustomerValidatorRule)entry.getValue()).support(annotation)) {
                return (CustomerValidatorRule)entry.getValue();
            }
        }
        return null;
    }

    public CustomerValidatorRule findRule(Annotation annotation) {
        CustomerValidatorRule customerValidatorRule = null;
        if (!rules.containsKey(annotation)) {
            CustomerValidatorRule cvr = this.findFormMap(annotation);
            if (cvr != null) {
                rules.put(annotation, cvr);
            }
            customerValidatorRule = cvr;
        }
        customerValidatorRule = this.rules.get(annotation);
        return customerValidatorRule;
    }
}
