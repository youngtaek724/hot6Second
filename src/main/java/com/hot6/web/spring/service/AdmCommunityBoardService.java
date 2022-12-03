package com.hot6.web.spring.service;


import com.hot6.web.spring.domain.vo.*;
import com.hot6.web.spring.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor @Qualifier("Admcommunity") @Primary
public class AdmCommunityBoardService implements AdminService {
    private final BoardDAO boardDAO;
    private final UserDAO userDAO;
    private final FileDAO fileDAO;
    private final QuizDAO quizDAO;
    private final ReplyDAO replyDAO;

// 유저 전체 조회
    public List<UserVO> showAllUser(Criteria criteria){ return userDAO.findAllUser(criteria);}

// 유저 상세 조회
    public UserVO showUser(Long userNumber){ return userDAO.findUser(userNumber); }

// 유저 삭제
    public void remove(Long userNumber){ userDAO.remove(userNumber);}

// 전체 유저 카운트
    public int getTotal(){ return userDAO.getTotal();}

// 오늘의 문제 추가
    @Override
    public void registerToday(QuizDTO quizDTO) {
       quizDAO.saveToday(quizDTO);
    }

// 오늘의 문제 리스트 전체보기
    @Override
    public List<QuizDTO> showAllToday(Criteria criteria) { return quizDAO.findAll(criteria); }

// 오늘의 문제 전체 개수
    @Override
    public int getToday() { return quizDAO.getToday();}

// 대회 문제 리스트 전체보기
    @Override
    public List<QuizDTO> showAllContest(Criteria criteria) { return quizDAO.findAllContest(criteria); }

// 대회 문제 전체 개수
    @Override
    public int getTodayContest() { return quizDAO.getTodayContest(); }

    // 게시판보기?
    public BoardVO showBoard(Long boardNumber){
        return boardDAO.findById(boardNumber);
    }

    // 작성 게시글 전체 조회
    @Override
    public List<BoardVO> findAll() { return boardDAO.findAll();}

// 문의글 전체 조회
    @Override
    public List<BoardVO> showAllInquiry(Criteria criteria) {
        return boardDAO.findAllInquiry(criteria);
    }

// 문의글 상세 조회
    @Override
    public BoardDTO showInquiry(Long boardNumber) { return boardDAO.findInquiry(boardNumber);}

// 문의글 전체 카운트
    @Override
    public int getInquiryTotal() {
        return boardDAO.inquiryGetTotal();
    }

// 문의글 댓글 전체 조회
    @Override
    public List<InReplyVO> showAllInReply(Long boardNumber) { return replyDAO.findAllInReply(boardNumber);}

// 문의글 댓글 개수
    @Override
    public int getTotalReply(Long boardNumber) { return replyDAO.getTotal(boardNumber); }

// 문의글 이전글글
    @Override
    public BoardVO beforeInquiry(Long boardNumber) { return boardDAO.beforeInquiry(boardNumber); }

// 문의글 다음 글
    @Override
    public BoardVO afterInquiry(Long boardNumber) { return boardDAO.afterInquiry(boardNumber); }
}
