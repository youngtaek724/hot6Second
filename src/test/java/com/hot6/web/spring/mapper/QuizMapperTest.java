package com.hot6.web.spring.mapper;


import com.hot6.web.spring.domain.vo.QuizDTO;
import com.hot6.web.spring.domain.vo.Criteria;
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
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.createAdm(3L, "새로운 게시글", "내용", 1L,"1","1","1","첫 번쨰 답","2","3","4","5");
        quizMapper.insertAdm(quizDTO);
        log.info("quizNumber = "+quizDTO.getQuizNumber());
    }

    @Test
    public void updateTest(){
        QuizVO quizVO = quizMapper.select(4L);
        quizVO.setQuizListTitle("리스트제목2");
        quizVO.setQuizList(2L);
        quizMapper.update(quizVO);
    }

//    @Test
//    public void deleteTest(){
//        quizMapper.delete(3L);
//        log.info("selectAll = "+quizMapper.selectAll());
//    }

    @Test
    public void selectTest(){
        log.info("quiz: " + quizMapper.select(1L));
    }

//    @Test
//    public void selectAllTest(){
//        log.info("selectAll = "+quizMapper.selectAll());
//    }
    @Test
    public void selectListAllTest(){
        quizMapper.selectListAll(new Criteria().create(1, 10)).stream().map(QuizVO::getQuizRegisterDate).forEach(log::info);
}

    @Test
    public void selectAllTest(){
        quizMapper.selectAll(new Criteria().create(1, 10)).stream().map(QuizVO::getQuizRegisterDate).forEach(log::info);
}

    @Test
    public void getTotalTest() {
        log.info("getTotal: " + quizMapper.getTotal());
    }

    @Test
    public void insertTodayTest(){
        QuizVO quizVO = new QuizVO();
    }
    
    @Test
    public void getListTotalTest() {
        log.info("getListTotal: " + quizMapper.getListTotal());
    }
}


















