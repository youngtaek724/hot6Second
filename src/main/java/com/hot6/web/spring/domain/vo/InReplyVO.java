package com.hot6.web.spring.domain.vo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class InReplyVO {
    @NonNull
    private Long replyNumber;
    private String replyContent;
    private String replyWriter;
    private String replyRegisterDate;
    private String replyUpdateDate;
    private Long boardNumber;

    public void setBoardNumber(Long boardNumber) {
        this.boardNumber = boardNumber;
    }

    public Long getBoardNumber() {
        return boardNumber;
    }
}
