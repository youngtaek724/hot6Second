package com.hot6.web.spring.service;


import com.hot6.web.spring.domain.vo.BoardDTO;
import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.domain.vo.Criteria;
import com.hot6.web.spring.domain.vo.FileVO;
import com.hot6.web.spring.repository.BoardDAO;
import com.hot6.web.spring.repository.FileDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

























//    ======================마이페이지 부분======================
//    특정 유저 게시글 전체 가져오기
    public List<BoardVO> findUserInquiry(String userEmail){return boardDAO.findUserInquiry(userEmail);}
//    전체 조회
    public List<BoardVO> showUserInquiryAll(Criteria criteria) {
    return boardDAO.findUserInquiryAll(criteria);
}
    public int getUserInquiryTotal() {
        return boardDAO.findCountUserInquiryAll();
    }









}
