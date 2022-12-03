package com.hot6.web.spring.service;

import com.hot6.web.spring.domain.vo.FileVO;
import com.hot6.web.spring.repository.FileDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FileService {
    private final FileDAO fileDAO;

    public List<FileVO> showOldFiles(){
        return fileDAO.findOldFiles();
    }
}
