package com.simple.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by SF on 2017/5/22.
 */
@Controller
@RequestMapping(value = "/ecmascript6")
public class ECMAScriptController {

    @RequestMapping
    public ModelAndView ecmascript6() {
        return new ModelAndView("ecmascript6");
    }
}
