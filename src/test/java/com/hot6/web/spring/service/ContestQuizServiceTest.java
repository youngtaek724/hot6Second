package com.hot6.web.spring.service;

import com.hot6.web.spring.domain.vo.BoardVO;
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
    void register() {
        QuizVO quizVO = new QuizVO();
        quizVO.create("문제 제목1","문제 내용1",2L,"리스트 제목2", "0", "0", "1",2L);
        contestQuizService.register(quizVO);
    }

    @Test
    void modify() {
        QuizVO quizVO = contestQuizService.show(4L);
        quizVO.setQuizTitle("수정된 게시글 제목");
        quizVO.setQuizType("1");
        contestQuizService.modify(quizVO);
    }

    @Test
    void remove() {
        contestQuizService.remove(5L);
        log.info("selectAll: "+contestQuizService.showAll());
    }

    @Test
    void show() { log.info("contestQuiz: " + contestQuizService.show(4L)); }

    @Test
    void showAll() { log.info("contestQuizAll: " + contestQuizService.showAll()); }

    @Test
    void getTotal() { log.info("contestQuizTotal: " + contestQuizService.getTotal()); }
}