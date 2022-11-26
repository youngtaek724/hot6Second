package com.hot6.web.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AdmCommunityBoardServiceTest {
    @Qualifier("Admcommunity")
    @Autowired
    private AdminService adminService;

    @Test
    public void showTest(){
        log.info("admShow : "+adminService.show(0L));
    }


}
