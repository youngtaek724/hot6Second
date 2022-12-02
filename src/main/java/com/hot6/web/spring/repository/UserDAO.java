package com.hot6.web.spring.repository;


import com.hot6.web.spring.domain.vo.Criteria;
import com.hot6.web.spring.domain.vo.UserDTO;
import com.hot6.web.spring.domain.vo.UserVO;
import com.hot6.web.spring.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public void modifyUser(UserDTO userDTO){
        userMapper.updateUser(userDTO);
        System.out.println("8");
    }

    // 특정 유저 정보 가져오기
    public UserVO getUserInfo(String userEmail){
        return userMapper.getInfo(userEmail);
    }

    // 유저 number 가져오기
    public long getUserNumber(String userEmail){return userMapper.selectUserNumber(userEmail);}

// admin 유저 전체 조회
    public List<UserVO> findAllUser(Criteria criteria){ return  userMapper.selectAllUser(criteria);}

// admin 유저 상세 조회
    public UserVO findUser(Long userNumber){ return userMapper.selectUserAdm(userNumber);}

//  admin 유저 삭제
    public void remove(Long userNumber){ userMapper.deleteUser(userNumber);}

// 유저 전체 카운트
    public int getTotal(){return userMapper.getTotal();}
}





















