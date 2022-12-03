package com.hot6.web.spring.service;

import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.domain.vo.Criteria;
import com.hot6.web.spring.domain.vo.QuizVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class ContestQuizServiceTest {
    @Qualifier("contest")
    @Autowired
    private ContestQuizService contestQuizService;

    @Test
    void registerTest() {
        QuizVO quizVO = new QuizVO();
        quizVO.create("문제 제목1","문제 내용1",2L,"리스트 제목2", "0", "0", "1","" ,2L);
        contestQuizService.register(quizVO);
    }

    @Test
    void modifyTest() {
        QuizVO quizVO = contestQuizService.show(1L);
        quizVO.setQuizTitle("수정된 게시글 제목");
        quizVO.setQuizType("1");
        contestQuizService.modify(quizVO);
    }

//    @Test
//    void removeTest() {
//        contestQuizService.remove(5L);
//        log.info("selectAll: "+contestQuizService.showAll());
//    }

    @Test
    void showTest() { log.info("contestQuiz: " + contestQuizService.show(6L)); }

    @Test
    void showListTest() { log.info("contestQuiz: " + contestQuizService.showList(3L, "2022-11-30")); }

    @Test
    void showListAllTest() { contestQuizService.showListAll(new Criteria().create(1, 10)).stream().map(QuizVO::getQuizRegisterDate).forEach(log::info); }

    @Test
    void showAllTest() { contestQuizService.showAll(new Criteria().create(1, 10)).stream().map(QuizVO::getQuizListTitle).forEach(log::info); }

    @Test
    void getTotalTest() { log.info("contestQuizTotal: " + contestQuizService.getTotal()); }

    @Test
    void getListTotalTest() { log.info("contestQuizListTotal: " + contestQuizService.getListTotal()); }
}