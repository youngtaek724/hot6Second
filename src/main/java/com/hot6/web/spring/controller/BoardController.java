package com.hot6.web.spring.controller;

import com.hot6.web.spring.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
    private BoardService boardService;
    // 게시글 목록

    // 게시글 상세 조회

    // 게시글 등록

    // 게시글 수정

    // 게시글 삭제
}
