package com.hot6.web.spring.mapper;


import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.domain.vo.Criteria;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BoardMapperTest {
    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void insertTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.create("새로작성한 제목", "새로작성한 내용", "0", 1L);
        boardMapper.insert(boardVO);
        log.info("boardNumber: "+boardVO.getBoardNumber());
    }

    @Test
    public void updateTest(){
        BoardVO boardVO = boardMapper.select(22L);
//        boardVO.create(boardMapper.select(22L));
        boardVO.setBoardTitle("수정된 게시글 제목");
        boardMapper.update(boardVO);
    }

    @Test
    public void selectTest(){
        log.info("select: " + boardMapper.select(22L));
    }

    @Test
    public void selectAllTest(){
        log.info("selectAll = "+boardMapper.selectAll());
    }
//    @Test
//    public void selectAllTest(){
//        boardMapper.selectAll().stream().map(BoardVO::getBoardTitle).forEach(log::info);
//    }

//    @Test
//    public void getToal() {
//        log.info("getTotal: " + boardMapper.getTotal());
//    }


}


















