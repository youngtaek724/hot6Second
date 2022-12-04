package com.hot6.web.spring.mapper;

//<<<<<<< HEAD
//import com.example.app.domain.vo.BoardDTO;
//import com.example.app.domain.vo.BoardVO;
//import com.example.app.domain.vo.Criteria;
//=======

import com.hot6.web.spring.domain.vo.BoardDTO;
import com.hot6.web.spring.domain.vo.BoardVO;
//>>>>>>> 079a339145ff678f3a47606dc1f9b41c36adc3a8
import com.hot6.web.spring.domain.vo.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
//<<<<<<< HEAD
////    추가
    public void insert(BoardVO boardVO);
////    수정
    public void update(BoardVO boardVO);
////    삭제 // 도희정 바보
    public void delete(Long boardNumber);
////    조회
//    public BoardVO select(Long boardNumber);
////    전체 조회
//    public List<BoardVO> selectAll(Criteria criteria);
////    전체 개수
//=======
//    추가
//    public void insert(BoardDTO boardDTO);

//    수정
//    public void update(BoardDTO boardDTO);

//    삭제
//    public void delete(Long boardNumber);

//    조회
    public BoardVO select(Long boardNumber);

//    전체 조회
    public List<BoardVO> selectAll();

//    전체 개수
    public int getTotal(Long boardNumber);

//  문의글 전체 개수
    public int getInquiryTotal();

//  문의글 전체 조회
    public List<BoardVO> selectAllInquiry(Criteria criteria);

//  문의글 상세보기
    public BoardDTO selectInquiry(Long boardNumber);

// 문의글 이전글
    public BoardVO selectBefore(Long boardNumber);

// 문의글 다음글
    public BoardVO selectAfter(Long boardNumber);

// 작성 게시글 전체보기
    public List<BoardDTO> selectAllBoard(Criteria criteria);

// 작성 게시글 수
    public int getBoardTotal();
































//    ======================마이페이지 부분======================
//    특정 유저 게시글 전체 가져오기
    public List<BoardVO> getUserInquiry(String userEmail);
    //    전체 조회
    public List<BoardVO> selectUserInquiryAll(Criteria criteria);
    //    전체 개수
    public int getUserInquiryTotal();
}
