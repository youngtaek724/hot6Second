package com.hot6.web.spring.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class UserVO {
//   유저 번호
    private Long userNumber;
//   유저 이메일
    private String userEmail;
//   유저 비밀번호
    private String userPassword;
//   유저 이름
    private String userName;
//   유저 상세메세지
    private String userMsg;
//   유저 생년월일
    private String userBirth;
//   유저 타입
    private char userType;
//   유저 학급
    private String userGrade;
//    


    public void create(String boardTitle, String boardContent, char boardType, Long userNumber) {
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.boardType = boardType;
        this.userNumber = userNumber;
    }
}
