package com.hot6.web.spring.repository;

import com.hot6.web.spring.mapper.ReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReplyDAO {
    private final ReplyMapper replyMapper;
//  댓글 추가
//    public void save(ReplyVO replyVO){
//        replyMapper.insert(replyVO);
//    }

//   댓글 수정
//    public void setReplyVO(ReplyVO replyVO){
//        replyMapper.update(replyVO);
//    }

//    댓글 삭제
//    public void remove(Long replyNumber){
//        replyMapper.delete(replyNumber);
//    }

//    조회
//    public ReplyVO findById(Long replyNumber){
//        return replyMapper.select(replyNumber);
//    }

//    전체 조회
//    public List<ReplyVO> findAll(Long boardNumber){
//        return replyMapper.selectAll(boardNumber);
//    }
}





















