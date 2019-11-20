package com.vshershnov.personalfinance.service;

import com.vshershnov.personalfinance.dto.ToshlTransactionDto;
import com.vshershnov.personalfinance.repository.FileServiceCsv;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

@Service
public class DetailParsingToshlService implements DetailParsingService<ToshlTransactionDto> {

    private final FileServiceCsv<ToshlTransactionDto> csvFileService;

    public DetailParsingToshlService(FileServiceCsv<ToshlTransactionDto> csvFileService) {
        this.csvFileService = csvFileService;
    }

    @Override
    public List<ToshlTransactionDto> fetchData(File file) throws FileNotFoundException {
        return csvFileService.readAll(file);
    }
}
