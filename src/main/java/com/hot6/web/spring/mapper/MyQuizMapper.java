package com.hot6.web.spring.mapper;


import com.hot6.web.spring.domain.vo.MyQuizVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyQuizMapper {
//    추가(임시 저장도 포함)
    public void insert(MyQuizVO myQuizVO);

//    작성 완료
    public void update(Long quizNumber, Long userNumber);

//    조회(상세글)
//    public myQuizDTO select(Long myQuizNumber);

//    맞은 문제 조회
//    public List<myQuizDTO> selectAllOK(Long userNumber);

//    틀린 문제 조회
//    public List<myQuizDTO> selectAllNO(Long userNumber);

//    전체 개수
//    public int getTotal();

}
