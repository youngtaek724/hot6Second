package com.hot6.web.spring.controller;

import com.hot6.web.spring.domain.vo.Criteria;
import com.hot6.web.spring.domain.vo.UserDTO;
import com.hot6.web.spring.domain.vo.UserVO;
import com.hot6.web.spring.domain.vo.PageDTO;
import com.hot6.web.spring.service.InquiryBoardService;
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
    private final InquiryBoardService inquiryBoardService;

    // 페이지 이동
//    @GetMapping("/myPageMain")
//    public String pageMain(){
//        return "myPage/myPageMain";
//    }

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


    // 문의 페이지 이동
    // 유저 정보 받아야함. 유저의 문의글 전체 받아야 함.
    @GetMapping("/myPageInquary")
    public void pageInquiry(Model model, Criteria criteria, @SessionAttribute(name="userEmail", required = false) String userEmail){
        if(criteria.getPage() == 0){
            criteria.create(1, 5);
        }
        model.addAttribute("userInfo", userService.getUserInfo(userEmail));
        model.addAttribute("userEmail", userEmail);
        model.addAttribute("boards", inquiryBoardService.findUserInquiry(userEmail));

        model.addAttribute("boards", inquiryBoardService.showUserInquiryAll(criteria));
        model.addAttribute("pagination",new PageDTO().createPageDTO(criteria, inquiryBoardService.getUserInquiryTotal()));
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
    public RedirectView updateInfo(UserDTO userDTO){
        userService.modifyUser(userDTO);
        // 여기서 thumbs가 null 뜨는 중
        return new RedirectView("/mypage/myPageMain");
    }

    // 맞은 문제 리스트

    // 틀린 문제 리스트

}
