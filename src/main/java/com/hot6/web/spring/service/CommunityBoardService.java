package com.hot6.web.spring.service;


import com.hot6.web.spring.repository.BoardDAO;
import com.hot6.web.spring.repository.FileDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor @Qualifier("community") @Primary
public class CommunityBoardService implements BoardService {
    private final BoardDAO boardDAO;
    private final FileDAO fileDAO;

//    정보 공유 게시판 서비스
//    글 추가

//    글 수정

//    글 삭제

//    글 조회

//    글 전체 조회
}
