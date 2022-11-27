package com.hot6.web.spring.service;


import com.hot6.web.spring.domain.vo.UserVO;
import com.hot6.web.spring.repository.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDAO userDAO;

    // 회원가입
    // 일반
    public void saveUser(UserVO userVO){
        userDAO.saveUser(userVO);
    }
    // 기관
    public void saveCompany(UserVO userVO){
        userDAO.saveCompany(userVO);
    }


    // 내 정보 수정(유저 수정)

    // 탈퇴(유저 삭제)

    // 내 정보 보기(유저 조회)

    // 로그인 시 아이디 조회
    public int checkUser(UserVO userVO){
        return userDAO.checkUser(userVO);
    }
}
