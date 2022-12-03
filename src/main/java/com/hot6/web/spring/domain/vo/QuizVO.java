package com.hot6.web.spring.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class QuizVO {
//   문제 번호
    @NonNull
    private Long quizNumber;
//   문제 제목
    private String quizTitle;
//   문제 내용
    private String quizContent;
//   문제 리스트
    @NonNull
    private Long quizList;
//   문제 리스트 제목
    private String quizListTitle;
//   문제 등록날짜
    private String quizRegisterDate;
//    문제 수정날짜
    private String quizUpdateDate;
//    문제 테마(오늘의문제(0), 대회(1))
    private String quizTheme;
//    문제 정답 유형(객관식(0), 주관식(1))
    private String quizType;
//   문제 답안1
    @NonNull
    private String quizAnsOne;
    //   문제 답안2
    private String quizAnsTwo;
    //   문제 답안3
    private String quizAnsThree;
    //   문제 답안4
    private String quizAnsFour;
    //   문제 답안5
    private String quizAnsFive;
//    유저 번호
    @NonNull
    private Long userNumber;

    public void create(String quizTitle, String quizContent, @NonNull Long quizList, String quizListTitle, String quizTheme, String quizType, @NonNull String quizAnsOne, String quizAnsTwo, @NonNull Long userNumber) {
        this.quizTitle = quizTitle;
        this.quizContent = quizContent;
        this.quizList = quizList;
        this.quizListTitle = quizListTitle;
        this.quizTheme = quizTheme;
        this.quizType = quizType;
        this.quizAnsOne = quizAnsOne;
        this.quizAnsTwo = quizAnsTwo;
        this.userNumber = userNumber;
        this.quizNumber = quizNumber;
    }
    
    public void create(Long quizNumber, String quizTitle, String quizContent, @NonNull Long quizList, String quizListTitle, String quizTheme, String quizType, @NonNull String quizAnsOne, @NonNull Long userNumber) {
        this.quizTitle = quizTitle;
        this.quizContent = quizContent;
        this.quizList = quizList;
        this.quizListTitle = quizListTitle;
        this.quizTheme = quizTheme;
        this.quizType = quizType;
        this.quizAnsOne = quizAnsOne;
        this.userNumber = userNumber;
        this.quizNumber = quizNumber;
    }
}
