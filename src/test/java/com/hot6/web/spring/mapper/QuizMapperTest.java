package com.hot6.web.spring.mapper;


import com.hot6.web.spring.domain.vo.QuizVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class QuizMapperTest {
    @Autowired
    private QuizMapper quizMapper;

    @Test
    public void insertTest(){
        QuizVO quizVO = new QuizVO();
        quizVO.create("문제 제목3","문제 내용3",2L,"리스트 제목2", "0", "0", "1",1L);
        quizMapper.insert(quizVO);
        log.info("quizNumber: " + quizVO.getQuizNumber());
    }

    @Test
    public void updateTest(){
        QuizVO quizVO = quizMapper.select(3L);
        quizVO.setQuizTitle("수정된 게시글 제목");
        quizVO.setQuizType("1");
        quizMapper.update(quizVO);
    }

    @Test
    public void deleteTest(){
        quizMapper.delete(3L);
        log.info("selectAll = "+quizMapper.selectAll());
    }

    @Test
    public void selectTest(){
        log.info("quiz: " + quizMapper.select(3L));
    }

    @Test
    public void selectAllTest(){
        log.info("selectAll = "+quizMapper.selectAll());
    }
//    @Test
//    public void selectAllTest(){
//        quizMapper.selectAll().stream().map(QuizVO::getQuizTitle).forEach(log::info);
//    }

    @Test
    public void getTotalTest() {
        log.info("getTotal: " + quizMapper.getTotal());
    }
}


















