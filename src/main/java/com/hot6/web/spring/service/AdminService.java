package com.hot6.web.spring.service;


import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.domain.vo.Criteria;
import com.hot6.web.spring.domain.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

//    답변 작성

//    게시글 삭제

//    유저 전체 조회(showUser)

//    문제 조회

//    게시글 조회
    public BoardVO showBoard(Long boardNumber);
//    전체 조회
    public List<BoardVO> findAll();

// 유저 전체 조회
    public List<UserVO> showAllUser(Criteria criteria);

// 유저 상세 조회
    public UserVO showUser(Long userNumber);

// 유저 삭제
    public void remove(Long userNumber);

// 유저 전체 개수
    public int getTotal();

// 문의글 전체 조회
    public List<BoardVO> showAllInquiry(Criteria criteria);

// 문의글 전체 개수
    public int getInquiryTotal();

}
