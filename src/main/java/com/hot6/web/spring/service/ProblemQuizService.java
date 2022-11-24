package com.hot6.web.spring.service;


import com.hot6.web.spring.repository.FileDAO;
import com.hot6.web.spring.repository.QuizDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor @Qualifier("community") @Primary
public class ProblemQuizService implements QuizService {
    private final QuizDAO quizDAO;
    private final FileDAO fileDAO;

//    대회 문제 서비스
//    대회글 작성

//    대회 수정

//    대회글 삭제

//    대회글 조회

//    대회글 전체 조회
}
