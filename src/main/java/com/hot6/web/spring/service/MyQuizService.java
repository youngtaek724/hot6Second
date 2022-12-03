package com.hot6.web.spring.service;

import com.hot6.web.spring.domain.vo.MyQuizVO;
import com.hot6.web.spring.domain.vo.QuizVO;
import com.hot6.web.spring.repository.MyQuizDAO;
import com.hot6.web.spring.repository.QuizDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyQuizService {
    private final MyQuizDAO myQuizDAO;

    //    추가
    public void register(MyQuizVO myQuizVO) { myQuizDAO.save(myQuizVO); }
    //    수정
    public void modify(Long quizNumber , Long userNumber) { myQuizDAO.setMyQuiz(quizNumber , userNumber); };
}
