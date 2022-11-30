package com.hot6.web.spring.service;

import com.hot6.web.spring.domain.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SpringBootTest
@Slf4j
public class CommunityBoardServiceTest {
    @Qualifier("community")
    @Autowired
    private BoardService boardService;

    @Test
    public void registerTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.create("새로작성한 제목", "새로작성한 내용", "0", 1L, 3L, 2L);
        boardService.register(boardVO);
    }

    @Test
    public void modifyTest(){
        BoardVO boardVO = boardService.show(22L);
//        boardDTO.create(boardService.findById(1L));
        boardVO.setBoardTitle("수정된 게시글 제목");
        boardService.modify(boardVO);
    }

//    @Test
//    public void showTest(){
//        log.info("board: " + boardService.show(0L));
//    }
    @Test
    public void showTest(){ log.info("board: " + boardService.show(22L)); }

    @Test
    public void showAllTest(){
        boardService.showAll().stream().map(BoardVO::getBoardTitle).forEach(log::info);
    }





}
