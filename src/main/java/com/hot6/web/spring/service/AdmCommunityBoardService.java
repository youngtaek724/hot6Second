package com.hot6.web.spring.service;


import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.domain.vo.Criteria;
import com.hot6.web.spring.domain.vo.UserVO;
import com.hot6.web.spring.repository.BoardDAO;
import com.hot6.web.spring.repository.FileDAO;
import com.hot6.web.spring.repository.UserDAO;
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

// 유저 전체 조회
    public List<UserVO> showAllUser(Criteria criteria){ return userDAO.findAllUser(criteria);}

// 유저 상세 조회
    public UserVO showUser(Long userNumber){ return userDAO.findUser(userNumber); }

// 유저 삭제
    public void remove(Long userNumber){ userDAO.remove(userNumber);}

// 전체 유저 카운트
    public int getTotal(){ return userDAO.getTotal();}


//    글 전체
    public BoardVO showBoard(Long boardNumber){
        return boardDAO.findById(boardNumber);
    }

    // 작성 게시글 전체 조회
    @Override
    public List<BoardVO> findAll() {
        return boardDAO.findAll();
    }
// 문의글 전체 조회
    @Override

    public List<BoardVO> showAllInquiry(Criteria criteria) {
        return boardDAO.findAllInquiry(criteria);
    }

// 문의글 상세 조회

// 문의글 전체 카운트
    @Override
    public int getInquiryTotal() {
        return boardDAO.inquiryGetTotal();
    }
}
