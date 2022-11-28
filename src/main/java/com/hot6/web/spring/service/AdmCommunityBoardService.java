package com.hot6.web.spring.service;


import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.repository.BoardDAO;
import com.hot6.web.spring.repository.FileDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor @Qualifier("Admcommunity") @Primary
public class AdmCommunityBoardService implements AdminService {
    private final BoardDAO boardDAO;
    private final FileDAO fileDAO;

//    정보 공유 게시판 서비스
//    글 추가

//    글 수정

//    글 삭제

//    글 조회
    public BoardVO show(Long boardNumber){
        BoardVO boardVO = new BoardVO();
        // boardVO.create(boardDAO.findById(boardNumber));
        return boardVO;
    }
//    글 전체 조회

    @Override
    public List<BoardVO> findAll() {
        return boardDAO.findAll();
    }
}
