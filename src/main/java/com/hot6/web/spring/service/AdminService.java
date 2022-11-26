package com.hot6.web.spring.service;


import com.hot6.web.spring.domain.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

//    답변 작성

//    게시글 삭제

//    유저 전체 조회(showUser)

//    문제 조회

//    게시글 조회
    public BoardVO show(Long boardNumber);
//    전체 조회
    public List<BoardVO> findAll();


}
