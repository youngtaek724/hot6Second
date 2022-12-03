package com.hot6.web.spring.mapper;


import com.hot6.web.spring.domain.vo.MyQuizVO;
import com.hot6.web.spring.domain.vo.QuizVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MyQuizMapperTest {
    @Autowired
    private MyQuizMapper myQuizMapper;

    @Test
    public void insertTest(){
        MyQuizVO myQuizVO = new MyQuizVO();
        myQuizVO.create(1L,30L,"배고파");
        myQuizMapper.insert(myQuizVO);
        log.info("quizNumber: " + myQuizVO.getMyQuizNumber());
    }

    @Test
    public void updateTest(){
//        MyQuizVO myQuizVO = myQuizMapper.select(4L);
        myQuizMapper.update(13L, 2L);
    }





}


















