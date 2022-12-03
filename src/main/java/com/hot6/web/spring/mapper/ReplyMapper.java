package com.hot6.web.spring.mapper;


import com.hot6.web.spring.domain.vo.InReplyVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
//   댓글 추가
//    public void insert(ReplyVO replyVO);

//    댓글 수정
//    public void update(ReplyVO replyVO);

//    댓글 삭제
//    public void delete(Long replyNumber);

//    댓글 조회
//    public ReplyVO select(Long replyNumber);

//    댓글 전체 조회
//    public List<ReplyVO> selectAll(Long boardNumber);

//    Admin 문의글 전체 댓글 조회
    public List<InReplyVO> selectAllInReply(Long boardNumber);

//    Admin 댓글 개수
    public int getTotal(Long boardNumber);
}
