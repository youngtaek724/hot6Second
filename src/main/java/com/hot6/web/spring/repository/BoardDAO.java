package com.hot6.web.spring.repository;


import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final BoardMapper boardMapper;

    //    추가
//    public void save(BoardDTO boardDTO){
//        boardMapper.insert(boardDTO);
//    }

    //    수정
//    public void setBoardVO(BoardDTO boardDTO){
//        boardMapper.update(boardDTO);
//    }

    //    삭제
//    public void remove(Long boardNumber){
//        boardMapper.delete(boardNumber);
//    }

//        조회
    public BoardVO findById(Long boardNumber){
        return boardMapper.select(boardNumber);
      }

    //    전체 조회
   public List<BoardVO> findAll(){
        return boardMapper.selectAll();
    }
//
//    전체 개수
//    public int findCountAll(){
//        return boardMapper.getTotal();
//    }

}
