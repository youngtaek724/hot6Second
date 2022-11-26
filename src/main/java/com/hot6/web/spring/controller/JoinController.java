package com.hot6.web.spring.controller;

import com.hot6.web.spring.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/login/*")
public class JoinController {
    // 로그인/회원가입 창 페이지
    @GetMapping("/login")
    public void login(){;}

    // 학생 회원가입 페이지 이동
    @GetMapping("/join")
    public void join(Model model){
        model.addAttribute("userInfo", new UserVO());
    }

    // 기업 회원가입 페이지 이동
    @GetMapping("/joinCompany")
    public void joinCompany(){;}

    // 학생 정보 추가
    @PostMapping("/join")
    public void join(){

    }

    // 유저 이메일 & 비밀번호 받기

}
