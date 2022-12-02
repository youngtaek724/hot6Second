package com.hot6.web.spring.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ThumbVO {
    private Long thumbNUmber;
    private String thumbName;
    private String thumbUploadPath;
    private String thumbUuid;
    private boolean thumbImageCheck;
    private Long thumbSize;
    private Long userNumber;

}
