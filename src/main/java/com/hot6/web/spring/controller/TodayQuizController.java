package com.hot6.web.spring.controller;

import com.hot6.web.spring.domain.vo.Criteria;
import com.hot6.web.spring.domain.vo.MyQuizVO;
import com.hot6.web.spring.domain.vo.PageDTO;
import com.hot6.web.spring.domain.vo.QuizVO;
import com.hot6.web.spring.service.MyQuizService;
import com.hot6.web.spring.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class TodayQuizController {
    private final QuizService quizService;
    private final MyQuizService myQuizService;

    // 오늘의 문제 목록
    @GetMapping("/problemList")
    public void problemList(Criteria criteria, Model model){
        if(criteria.getPage() == 0){
            criteria.create(1, 10);
        }
        model.addAttribute("todayQuizs", quizService.showListAll(criteria));
        model.addAttribute("pagination",new PageDTO().createPageDTO(criteria, quizService.getListTotal()));
    }


    // 오늘의 문제 상세조회 이동
    @GetMapping("/problemDetail")
    public void problemDetail(Criteria criteria, Long quizList, String quizRegisterDate, Model model) {
        model.addAttribute("todayQuizList", quizService.showList(quizList, quizRegisterDate));
        model.addAttribute("myQuiz", new MyQuizVO());
    }

//    // 오늘의 문제 작성 페이지 이동
//    @GetMapping("/contestWrite")
//    public void contestWrite(){}

    // 오늘의 문제 답안 작성
//    @LogStatus
    @PostMapping("/problemDetail")
//    화면이 아닌 다른 컨트롤러로 이동해야 할 때에는 RedirectView를 사용하여 Redirect방식으로 전송할 수 있다.
    public RedirectView prolemDetail(QuizVO quizVO, MyQuizVO myQuizVO, RedirectAttributes redirectAttributes){
//        quizService.register(quizVO);
        myQuizService.register(myQuizVO);
        myQuizService.modify(myQuizVO.getQuizNumber(), myQuizVO.getUserNumber());
//        myQuizService.register(myQuizVO);
//        Redirect방식일 때 데이터를 전달하는 방법
//        1. Query String : 다음 컨트롤러에 데이터 전달
//        2. Flash : 화면에 데이터 전달
//        Session의 Flash영역을 사용하여 request가 초기화된 뒤 Flash영역에 담아뒀던 데이터를 꺼내올 수 있다.

//        RedirectAttributes는 addAttribute()를 사용하여 쿼리 스트링을 제작해주고,
//        addFlashAttribute()를 사용하여 Session의 Flash영역을 사용하게 해준다.
        redirectAttributes.addFlashAttribute("quizList", quizVO.getQuizList());
        redirectAttributes.addFlashAttribute("quizRegisterDate", quizVO.getQuizRegisterDate());
//        redirectAttributes.addAttribute("quizList", 4);
//        redirectAttributes.addAttribute("quizRegisterDate", "2022-12-03");

        return new RedirectView("/board/problemDetailOk");
    }

    // 오늘의 문제 답안 임시저장

    // 오늘의 문제 답안지 페이지 이동
    @GetMapping("/problemDetailOk")
    public void problemDetailOk(Criteria criteria, Long quizList, String quizRegisterDate, Model model) {
        model.addAttribute("todayQuizList", quizService.showList(quizList, quizRegisterDate));
    }

    // 오늘의 문제 답안지 조회
    @GetMapping("/problemAnswer")
    public void problemAnswer(Long quizList, String quizRegisterDate, Model model){
        model.addAttribute("todayQuizAnswer", quizService.showList(quizList, quizRegisterDate));
    }

}
