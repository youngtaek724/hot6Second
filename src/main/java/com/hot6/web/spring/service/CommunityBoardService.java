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
@RequiredArgsConstructor @Qualifier("community") @Primary
public class CommunityBoardService implements BoardService {
    private final BoardDAO boardDAO;
    private final FileDAO fileDAO;

//    정보 공유 게시판 서비스
//    글 추가
    @Override
    public void register(BoardVO boardVO) {
        boardDAO.save(boardVO);
    }

//    글 수정
    @Override
    public void modify(BoardVO boardVO) {
        boardDAO.setBoardVO(boardVO);
    }

//    글 삭제
    @Override
    public void remove(Long boardNumber) {
        boardDAO.remove(boardNumber);
    }

//    글 조회
//    public BoardVO show(Long boardNumber){
//        BoardVO boardVO = new BoardVO();
//        // boardVO.create(boardDAO.findById(boardNumber));
//        return boardVO;
//    }
    @Override
    public BoardVO show(Long boardNumber) {
        return boardDAO.findById(boardNumber);
    }

//    글 전체 조회
//    @Override
//    public List<BoardVO> findAll() {
//        return null;
//    }
    @Override
    public List<BoardVO> showAll() {
        return boardDAO.findAll();
    }

//    @Override
//    public int getTotal(Long boardNumber) {
//        return boardDAO.findCountAll(boardNumber);
//    }
}
