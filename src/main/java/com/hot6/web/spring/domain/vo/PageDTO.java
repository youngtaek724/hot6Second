package com.hot6.web.spring.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PageDTO {
    //    페이지 단위 수
    private int pageCount;
    //    현재 페이지를 기준으로 시작 페이지
    private int startPage;
    //    현재 페이지를 기준으로 마지막 페이지
    private int endPage;
    //    가장 마지막 페이지
    private int realEnd;
    private boolean prev, next;
    //    전체 게시글 개수
    private int total;
    //    화면에서 받아온 page, amount를 필드로 구성한 객체
    private Criteria criteria;

}
