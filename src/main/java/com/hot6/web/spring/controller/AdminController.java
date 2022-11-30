package com.hot6.web.spring.controller;

import com.hot6.web.spring.domain.vo.Criteria;
import com.hot6.web.spring.domain.vo.PageDTO;
import com.hot6.web.spring.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {
    private final AdminService adminService;
    //메인 페이지
    @GetMapping("/adm_main")
    public void mainPage(){

    }

    // 오늘의 문제 조회
    @GetMapping("/adm_todayList")
    public void todayList(){

    }
    // 대회 문제 조회
    @GetMapping("/adm_contestList")
    public void contestList(){

    }
    // 회원 목록 전체 보기
    @GetMapping("/adm_userList")
    public void userList(Criteria criteria, Model model){
        if(criteria.getPage() == 0){
            criteria.create(1, 10);
        }
        model.addAttribute("boards", adminService.showAllUser(criteria));
        model.addAttribute("pagination", new PageDTO().createPageDTO(criteria, adminService.getTotal()));
    }

    // 회원 상세정보 보기
    @GetMapping("/adm_userDetail")
    public void userDetail(Long userNumber, Criteria criteria, Model model){
        model.addAttribute("board", adminService.showUser(userNumber));
    }

    // 회원 삭제
    @GetMapping("/delete")
    public RedirectView delete(Long userNumber){
        adminService.remove(userNumber);
        return new RedirectView("/admin/adm_userList");
    }

    // 작성 게시글
    @GetMapping("/adm_boardList")
    public void boardList(Model model){
        model.addAttribute("boards", adminService.findAll());
    }
    // 작성 게시글 상세조회
    @GetMapping("/adm_boardDetail")
    public void boardDetail(Long boardNumber, Criteria criteria, Model model){
        model.addAttribute("board", adminService.showBoard(boardNumber));
    }
    // 문의글 전체 보기
    @GetMapping("/adm_inquiryList")
    public void inquiryList(Criteria criteria, Model model){
        if(criteria.getPage() == 0){
            criteria.create(1, 10);
        }
        model.addAttribute("boards", adminService.showAllInquiry(criteria));
        model.addAttribute("pagination", new PageDTO().createPageDTO(criteria, adminService.getInquiryTotal()));
    }

}
