package com.example.demo.controller;

import com.example.demo.repository.TouristRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(MyController.class)
class MyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TouristRepository repository;

    @Test
    public void testWelcomePage() throws Exception {
        mockMvc.perform(get(""))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"))
                .andExpect(content().string( containsString("WELCOME")));
    }

    @Test
    public void testUpdate() throws Exception {
        mockMvc.perform(get("/update"))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"))
                .andExpect(content().string( containsString("WELCOMEX")));
    }
}