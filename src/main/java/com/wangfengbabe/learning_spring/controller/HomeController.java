package com.wangfengbabe.learning_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangfeng on 12/06/2017.
 */
@Controller @RequestMapping({"/", "/homepage"}) public class HomeController {

    @RequestMapping(method = RequestMethod.GET) public String home() {
        return "home";
    }

}
