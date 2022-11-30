package com.hot6.web.spring.repository;

import com.hot6.web.spring.domain.vo.QuizVO;
import com.hot6.web.spring.mapper.QuizMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class QuizDAO {
    private final QuizMapper quizMapper;

// 추가 save
    public void save(QuizVO quizVO){
        quizMapper.insert(quizVO);
    }

// 수정 set
    public void setQuizDAO(QuizVO quizVO){
        quizMapper.update(quizVO);
    }

// 삭제 remove
    public void remove(Long quizNumber){
        quizMapper.delete(quizNumber);
    }

// 조회 findById
    public QuizVO findById(Long quizNumber){
        return quizMapper.select(quizNumber);
    }

// 전체 조회 findByIdAll
    public List<QuizVO> findByIdAll(){ return quizMapper.selectAll(); }

// 개수 findCountAll
    public int findCountAll(){
        return quizMapper.getTotal();
    }
}


















