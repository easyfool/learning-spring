package com.wangfengbabe.learning_spring.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request
    .MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result
    .MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders
    .standaloneSetup;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created by wangfeng on 12/06/2017.
 */
public class HomeControllerTest {

    @Test public void testHomePage() {
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
    }

    @Test public void testHomePageWithSpringMVC() throws Exception {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }

}
