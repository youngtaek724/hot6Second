package com.hot6.web.spring.service;


import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.repository.BoardDAO;
import com.hot6.web.spring.repository.FileDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InquiryBoardService implements BoardService {
    private final BoardDAO boardDAO;
    private final FileDAO fileDAO;

//    문의 게시판 서비스
//    글 추가

//    글 수정

//    글 삭제

//    글 조회

//    @Override
//    public BoardVO show(Long boardNumber) {
//        return null;
//    }

//    글 전체 조회


    //    추가
    public void register(BoardVO boardVO){};
    //    수정
    public void modify(BoardVO boardVO){};
    //    삭제
    public void remove(Long boardNumber){};
    //    조회
    public BoardVO show(Long boardNumber){return null;};
    //    전체 조회
    public List<BoardVO> showAll(){return null;};
    // 전체 개수
    public int getTotal(Long boardNumber){return boardDAO.findCountAll(boardNumber);}
}
