package com.hot6.web.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage/*")
public class MypageController {
    // 페이지 이동
    @GetMapping("/myPageMain")
    public String pageMain(){
        return "myPage/myPageMain";
    }

    @GetMapping("/myPageInquary")
    public String pageInquiry(){
        return "myPage/myPageInquary";
    }

    @GetMapping("/myPageQuizNo")
    public String pageQuizNo(){
        return "myPage/myPageQuizNo";
    }

    @GetMapping("/myPageQuizOk")
    public String pageQuizOk(){
        return "myPage/myPageQuizOk";
    }




    // 탈퇴

    // 개인 정보 상세 보기

    // 개인 정보 수정

    // 맞은 문제 리스트

    // 틀린 문제 리스트

}
