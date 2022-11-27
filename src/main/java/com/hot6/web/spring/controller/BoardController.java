package com.hot6.web.spring.controller;

import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;

    // 게시글 목록
    @GetMapping("/boardList")
    public void bordList(Model model){
        model.addAttribute("boards", boardService.showAll());
    }

    // 게시글 등록
    @GetMapping("/boardWrite")
    public void boardWrite(){}


//    @LogStatus
    @PostMapping("/boardwrite")
//    화면이 아닌 다른 컨트롤러로 이동해야 할 때에는 RedirectView를 사용하여 Redirect방식으로 전송할 수 있다.
    public RedirectView boardWrite(BoardVO boardVO, RedirectAttributes redirectAttributes){
        boardService.register(boardVO);
//        Redirect방식일 때 데이터를 전달하는 방법
//        1. Query String : 다음 컨트롤러에 데이터 전달
//        2. Flash : 화면에 데이터 전달
//        Session의 Flash영역을 사용하여 request가 초기화된 뒤 Flash영역에 담아뒀던 데이터를 꺼내올 수 있다.

//        RedirectAttributes는 addAttribute()를 사용하여 쿼리 스트링을 제작해주고,
//        addFlashAttribute()를 사용하여 Session의 Flash영역을 사용하게 해준다.
        redirectAttributes.addFlashAttribute("boardNumber", boardVO.getBoardNumber());
        return new RedirectView("/board/boardList");
    }

    // 게시글 상세 조회
    @GetMapping(value = {"/boardDetail", "/boardUpdate"})
    public void boardDetail(){;}
//    public void boardDetail(Long boardNumber, Model model){
//        model.addAttribute("board", boardService.show(boardNumber));
//    }

    // 게시글 수정(완료)
//    @LogStatus
    @PostMapping("/boardUpdate")
    public void boardUpdate(){;}
//    public RedirectView boardUpdate(BoardVO boardVO, RedirectAttributes redirectAttributes){
//        boardService.modify(boardVO);
//        redirectAttributes.addAttribute("boardNumber", boardVO.getBoardNumber());
//        return new RedirectView("/board/boardDetail");
//    }

    // 게시글 삭제
    @GetMapping("/boardDelete")
    public RedirectView boardDelete(Long boardNumber){
        boardService.remove(boardNumber);
        return new RedirectView("/board/boardList");
    }
}
