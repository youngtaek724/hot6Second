package com.hot6.web.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main/*")
public class MainController {

    @GetMapping("/main")
    public String main() {return "/main/main";}

    // 오늘의 문제 페이지 이동

    // 대회 페이지 이동

    // 랭킹 페이지 이동

    // 게시판 페이지 이동

    // 오늘의 문제 최신글 보여주기

    // 게시판 최신글 보여주기

    // 대회 배너 조회
}
