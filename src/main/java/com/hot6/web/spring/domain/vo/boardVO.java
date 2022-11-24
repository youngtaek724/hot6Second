package com.hot6.web.spring.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class BoardVO {
//   게시글 번호
    @NonNull
    private Long boardNumber;
//   게시글 제목
    private String boardTitle;
//   게시글 내용
    private String boardContent;
//   게시글 날짜
    private String boardDate;
//   게시글 수정 날짜
    private String boardUpdateDate;
//   게시글 타입
    private char boardType;
//   유저 번호
    @NonNull
    private Long userNumber;

    public void create(String boardTitle, String boardContent, char boardType, Long userNumber) {
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.boardType = boardType;
        this.userNumber = userNumber;
    }
}
