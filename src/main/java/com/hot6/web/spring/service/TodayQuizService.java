package com.hot6.web.spring.service;


import com.hot6.web.spring.repository.FileDAO;
import com.hot6.web.spring.repository.QuizDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor @Qualifier("community") @Primary
public class TodayQuizService implements QuizService {
    private final QuizDAO quizDAO;
    private final FileDAO fileDAO;

//    오늘의 문제 서비스
//    글 추가

//    글 수정

//    글 삭제

//    글 조회

//    글 전체 조회
}
