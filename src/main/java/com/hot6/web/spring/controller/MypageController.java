package com.hot6.web.spring.controller;

import com.hot6.web.spring.domain.vo.UserVO;
import com.hot6.web.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage/*")
public class MypageController {
    private final UserService userService;

    // 페이지 이동
//    @GetMapping("/myPageMain")
//    public String pageMain(){
//        return "myPage/myPageMain";
//    }

    @GetMapping("/myPageInquary")
    public String pageInquiry(){
        return "myPage/myPageInquary";
    }

    @GetMapping("/myPageNoAns")
    public String pageNoAns(){
        return "myPage/myPageNoAns";
    }

    @GetMapping("/myPageQuizNo")
    public String pageQuizNo(){
        return "myPage/myPageQuizNo";
    }

    @GetMapping("/myPageQuizOk")
    public String pageQuizOk(){
        return "myPage/myPageQuizOk";
    }

    @GetMapping("/myPageModal")
    public String pageModal(){
        return "myPage/myPageModal";
    }




    // 탈퇴

    // 개인 정보 상세 보기
    @GetMapping("/myPageMain")
    public void userInfo(Model model, @SessionAttribute(name="userEmail") String userEmail){
        model.addAttribute("userInfo", userService.getUserInfo(userEmail));
        model.addAttribute("userEmail", userEmail);
    }

    // 개인 정보 수정
    @PostMapping("/updateInfo")
    public RedirectView updateInfo(UserVO userVO){
        userService.modifyUser(userVO);
        return new RedirectView("/mypage/myPageMain");
    }

    // 맞은 문제 리스트

    // 틀린 문제 리스트

}
