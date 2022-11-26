package com.hot6.web.spring.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BoardVO {
//    게시판 번호
    private Long boardNumber;
//    게시글 이름
    private String BoardTitle;
    //    게시글 내용
    private String BoardContent;
//    게시글 날짜
    private String BoardDate;
//    게시글 수정 날짜
    private String BoardUpdateDate;
//    게시글 타입
    private String BoardType;
//  유저 번호
    private Long userNumber;


}
