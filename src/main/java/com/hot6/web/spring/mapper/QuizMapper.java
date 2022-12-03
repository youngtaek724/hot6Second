package com.hot6.web.spring.mapper;


import com.hot6.web.spring.domain.vo.Criteria;
import com.hot6.web.spring.domain.vo.QuizDTO;
import com.hot6.web.spring.domain.vo.QuizVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuizMapper {
//    문제 추가
    public void insert(QuizVO quizVO);

//    문제 수정
    public void update(QuizVO quizVO);

//    문제 조회
    public QuizVO select(Long quizNumber);

//    문제 전체 조회
    public List<QuizVO> selectAll();

//    문제 삭제
    public void delete(Long quizNumber);

//    문제 전체 갯수
    public int getTotal();
    
// 오늘의 문제 등록
    public void insertAdm(QuizDTO quizDTO);

// 오늘의 문제 전체 리스트
    public List<QuizDTO> selectAllToday(Criteria criteria);

// 오늘의 문제 수
    public int getToday();

// 대회 전체 리스트
    public List<QuizDTO> selectAllContest(Criteria criteria);

// 대회 전체 문제 수
    public int getTodayContest();
}
