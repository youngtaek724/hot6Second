package com.hot6.web.spring.controller;

import com.hot6.web.spring.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {
    private final AdminService adminService;


    // 오늘의 문제 조회

    // 대회 문제 조회

    // 회원 목록

    // 작성 게시글
    @GetMapping("/adm_boardList")
    public void boardList(Model model){
        model.addAttribute("boards", adminService.findAll());
    }
    // 작성 게시글 상세조회
    @GetMapping("/adm_boardDetail")
    public void boardDetail(Model model){
        model.addAttribute("boards", adminService.show(0L));
    }
    // 문의글

}
