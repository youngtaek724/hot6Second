package com.hot6.web.spring.controller;

import com.hot6.web.spring.domain.vo.UserVO;
import com.hot6.web.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/modal/*")
public class MypageModalController {
    private final UserService userService;

    @GetMapping("/info/{userEmail}")
    public UserVO getInfo(@PathVariable("userEmail") String userEmail){
        return userService.getUserInfo(userEmail);
    }

}
