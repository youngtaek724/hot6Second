package com.hot6.web.spring.repository;


import com.hot6.web.spring.domain.vo.BoardDTO;
import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.domain.vo.Criteria;
import com.hot6.web.spring.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final BoardMapper boardMapper;

    //    추가
    public void save(BoardVO boardVO){
        boardMapper.insert(boardVO);
    }

    //    수정
    public void setBoardVO(BoardVO boardVO){
        boardMapper.update(boardVO);
    }

    //    삭제
    public void remove(Long boardNumber){
        boardMapper.delete(boardNumber);
    }

//        조회
    public BoardVO findById(Long boardNumber){
        return boardMapper.select(boardNumber);
      }

    //    전체 조회
    public List<BoardVO> findAll(){
        return boardMapper.selectAll();
    }

//    전체 개수
    public int findCountAll(Long boardNumber){ return boardMapper.getTotal(boardNumber); }

// admin 문의 전체 조회
    public List<BoardVO> findAllInquiry(Criteria criteria) { return boardMapper.selectAllInquiry(criteria); }

// admin 문의 전체 개수
    public int inquiryGetTotal(){return boardMapper.getInquiryTotal();}

// admin 문의 상세조회회
    public BoardDTO findInquiry(Long boardNumber) { return boardMapper.selectInquiry(boardNumber); }

// Admin 문의 이전글
    public BoardVO beforeInquiry(Long boardNumber) { return boardMapper.selectBefore(boardNumber); }

// Admin 문의 다음글
    public BoardVO afterInquiry(Long boardNumber){ return boardMapper.selectAfter(boardNumber); }

// Admin 작성 게시글 전체보기
    public List<BoardDTO> findAllBoards(Criteria criteria){ return boardMapper.selectAllBoard(criteria);}
// Admin 작성 게시글 개수
    public int getBoardTotal(){return boardMapper.getBoardTotal();}





















//    ======================마이페이지 부분======================
//    특정 유저 게시글 전체 가져오기
    public List<BoardVO> findUserInquiry(String userEmail){return boardMapper.getUserInquiry(userEmail);}
    //    전체 조회
    public List<BoardVO> findUserInquiryAll(Criteria criteria){
        return boardMapper.selectUserInquiryAll(criteria);
    }
    //    전체 개수
    public int findCountUserInquiryAll(){
        return boardMapper.getUserInquiryTotal();
    }
}
