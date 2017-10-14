package com.wangfengbabe.learning_spring.controller;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request
    .MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result
    .MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result
    .MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders
    .standaloneSetup;

import com.wangfengbabe.learning_spring.model.Spittle;
import com.wangfengbabe.learning_spring.service.ISpittleService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

/**
 * Created by wangfeng on 12/06/2017.
 */
public class SpittleControllerTest {

  @Test
  public void shouldShowRecentSpittles() throws Exception {
    List<Spittle> expectedSpittles = createSpittleList(20);
    ISpittleService spittleService = mock(ISpittleService.class);
    when(spittleService.findSpittles(Long.MAX_VALUE, 20))
        .thenReturn(expectedSpittles);
    SpittleController spittleController = new SpittleController(spittleService);
    MockMvc mockMvc = standaloneSetup(spittleController)
        .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
        .build();
    mockMvc.perform(get("/spittles")).andExpect(view().name("spittles"))
        .andExpect(model().attributeExists("spittleList"))
        .andExpect(model()
            .attribute("spittleList", hasItems(expectedSpittles.toArray())));

  }

  private List<Spittle> createSpittleList(int count) {
    List<Spittle> spittles = new ArrayList<Spittle>();
    for (int i = 0; i < count; i++) {
      spittles.add(new Spittle("Spittle" + i, new Date()));
    }
    return spittles;

  }

}
