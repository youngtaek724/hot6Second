package com.hot6.web.spring.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class FileVO {
//    파일 번호
    private Long fileNumber;
//    파일 이름
    private String fileName;
//    파일 업로드 경로
    private String fileUploadPath;
//    파일 고유 번호
    private String fileUuid;
//    파일 이미지 체크
    private boolean fileImageCheck;
//    파일 사이즈
    private Long fileSize;
//    게시글 번호
    private Long boardNumber;

    public void create(String fileName, String fileUploadPath, String fileUuid, boolean fileImageCheck) {
        this.fileName = fileName;
        this.fileUploadPath = fileUploadPath;
        this.fileUuid = fileUuid;
        this.fileImageCheck = fileImageCheck;
    }
}
