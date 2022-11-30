package com.hot6.web.spring.service;

import com.hot6.web.spring.domain.vo.BoardVO;
import com.hot6.web.spring.domain.vo.Criteria;
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
        log.info("admShow : "+adminService.showBoard(0L));
    }

    @Test
    public void showAllTest(){
        adminService.showAllInquiry(new Criteria().create(1, 10)).stream().map(BoardVO::getBoardTitle).forEach(log::info);
    }
    @Test
    public void showAllcount(){
        String date = adminService.findAll().get(0).getBoardDate();
        String bdate = date.substring(0,10);
        log.info("date!!!!!!!!!!!!!!!!!!!!= "+bdate);
    }

    @Test
    public void findAll(){
        log.info("!!!!! = "+adminService.findAll());
    }
}
