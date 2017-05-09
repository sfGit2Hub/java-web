package java.com.simple.web.exp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

/**
 * Created by Administrator on 2017/5/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/beans.xml")
public class DemoTest {
    @Autowired
    private Validator customerValidatorFactory;

    @Test
    public void helloTest() {
        Form form = new Form();
        form.setCurrent("2015 11 11");
        BindException errors = new BindException(form, "target");
        customerValidatorFactory.validate(form, errors);
        System.out.println(errors.getFieldErrors());
    }
}
