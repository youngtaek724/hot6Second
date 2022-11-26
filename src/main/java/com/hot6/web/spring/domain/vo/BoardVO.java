package com.hot6.web.spring.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BoardVO {
//    게시판 번호
    private Long boardNumber;
//    게시글 이름
    private String boardTitle;
    //    게시글 내용
    private String boardContent;
//    게시글 날짜
    private String boardDate;
//    게시글 수정 날짜
    private String boardUpdateDate;
//    게시글 타입
    private String boardType;
//  유저 번호
    private Long userNumber;

    public void create(BoardVO boardVO){
        this.boardNumber = boardVO.getBoardNumber();
        this.boardTitle = boardVO.getBoardTitle();
        this.boardContent = boardVO.getBoardContent();
        this.boardDate = boardVO.getBoardDate();
        this.boardUpdateDate = boardVO.getBoardUpdateDate();
        this.boardType = boardVO.getBoardType();
        this.userNumber = boardVO.getUserNumber();

    }
}
