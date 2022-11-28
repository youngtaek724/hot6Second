package com.hot6.web.spring.mapper;


import com.hot6.web.spring.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
//    추가
    // 일반
    public void insertUser(UserVO userVO);
    // 기관
    public void insertCompany(UserVO userVO);

//    수정
//    public void update(UserVO userVO);

//    삭제
//    public void delete(Long userNumber);

//    조회
//    public UserVO select(Long userNumber);

//    전체 조회
//    public List<UserVO> selectAll(Criteria criteria);

    // 로그인 시 아이디 조회
    public int selectUser(UserVO userVO);

}
