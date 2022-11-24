package com.hot6.web.spring.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class UserVO {
//   유저 번호
    @NonNull
    private Long userNumber;
//   유저 이메일
    @NonNull
    private String userEmail;
//   유저 비밀번호
    @NonNull
    private String userPassword;
//   유저 이름
    private String userName;
//   유저 상세메세지
    private String userMsg;
//   유저 생년월일
    private String userBirth;
//   유저 타입
    @NonNull
    private char userType;
//   유저 학급
    @NonNull
    private String userGrade;
//   유저 점수
    private Long userPoint;


    public void create(String userEmail, String userPassword, String userName,
                       String userMsg, String userBirth, char userType, String userGrade) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userMsg = userMsg;
        this.userBirth = userBirth;
        this.userType = userType;
        this.userGrade = userGrade;
    }
}
