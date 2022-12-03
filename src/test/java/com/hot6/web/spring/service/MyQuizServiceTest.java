package com.hot6.web.spring.service;

import com.hot6.web.spring.domain.vo.MyQuizVO;
import com.hot6.web.spring.domain.vo.QuizVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MyQuizServiceTest {
    @Autowired
    private MyQuizService myQuizService;

    @Test
    void registerTest() {
        MyQuizVO myQuizVO = new MyQuizVO();
        myQuizVO.create(1L,22L,"사과");
        myQuizService.register(myQuizVO);
    }

    @Test
    void modifyTest() {
        myQuizService.modify(22L, 1L);
    }
}