package com.hot6.web.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class BoardControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

//    브라우저에서 URL을 요청한 것과 같은 환경을 구성해준다.
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    void bordList() throws Exception {
        log.info("boards: " + mockMvc.perform(MockMvcRequestBuilders.get("/board/boardlist")).andReturn().getModelAndView().getModelMap());
    }

    @Test
    void bordWrite() {
    }

    @Test
    void boardWrite() {
    }

    @Test
    void boardDetail() {
    }

    @Test
    void boardUpdate() {
    }

    @Test
    void boardDelete() {
    }
}