package com.hot6.web.spring.repository;


import com.hot6.web.spring.domain.vo.UserVO;
import com.hot6.web.spring.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;
// 추가 save
    // 일반
    public void saveUser(UserVO userVO){
        userMapper.insertUser(userVO);
    }
    // 기관
    public void saveCompany(UserVO userVO){
        userMapper.insertCompany(userVO);
    }

// 수정 set

// 삭제 remove

// 조회 findById

// 전체 조회 findByIdAll

// 개수 findCountAll

    // 로그인 시 아이디 조회
    public int checkUser(UserVO userVO){return userMapper.selectUser(userVO);}

    // 정보 수정
    public void modifyUser(UserVO userVO){
        userMapper.updateUser(userVO);
    }

    // 특정 유저 정보 가져오기
    public UserVO getUserInfo(String userEmail){
        return userMapper.getInfo(userEmail);
    }
}





















