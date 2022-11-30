package com.hot6.web.spring.controller;

import com.hot6.web.spring.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class TodayQuizController {
    private final QuizService quizService;

    // 오늘의 문제 목록
    @GetMapping("/problemList")
    public void problemList(Model model){
        model.addAttribute("todayQuizs", quizService.showAll());
    }


    // 오늘의 문제 상세조회 이동
    @GetMapping("/problemDetail")
    public void problemDetail(){}

    // 오늘의 문제 작성 페이지 이동
    @GetMapping("/contestWrite")
    public void contestWrite(){}

    // 오늘의 문제 답안 작성
    @PostMapping("/problemDetail")
    public void prolemDetail(){}

    // 오늘의 문제 답안 임시저장

    // 오늘의 문제 답안지 페이지 이동

    // 오늘의 문제 답안지 조회
}
