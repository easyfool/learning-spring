package com.wangfengbabe.learning_spring.controller;

import com.wangfengbabe.learning_spring.service.ISpittleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangfeng on 12/06/2017.
 */
@Controller @RequestMapping("/spittles") public class SpittleController {

    @Autowired private ISpittleService spittleService;

    public SpittleController(ISpittleService spittleService) {
        this.spittleService = spittleService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute(spittleService.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";

    }
}
