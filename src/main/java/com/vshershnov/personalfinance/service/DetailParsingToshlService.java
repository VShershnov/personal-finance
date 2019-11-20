package com.vshershnov.personalfinance.service;

import com.vshershnov.personalfinance.dto.ToshlTransactionDto;
import com.vshershnov.personalfinance.repository.FileServiceCsv;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class DetailParsingToshlService implements DetailParsingService {

    private final FileServiceCsv<ToshlTransactionDto> csvFileService;

    public DetailParsingToshlService(FileServiceCsv<ToshlTransactionDto> csvFileService) {
        this.csvFileService = csvFileService;
    }

    @Override
    public List<String> fetchData(File file) {
        return null;
    }
}
