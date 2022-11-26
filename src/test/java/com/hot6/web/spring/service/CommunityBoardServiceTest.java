package com.hot6.web.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SpringBootTest
@Slf4j
public class CommunityBoardServiceTest {
    @Qualifier("community")
    @Autowired
    private BoardService boardService;

    @Test
    public void showTest(){
        log.info("board: " + boardService.show(0L));
    }


}
