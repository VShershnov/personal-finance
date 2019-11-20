package com.vshershnov.personalfinance.repository;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.vshershnov.personalfinance.dto.ToshlTransactionDto;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public abstract class FileServiceCsv<T> implements FileService<T> {

    @Override
    public T read(File file) {
        return null;
    }

    @Override
    public List<T> readAll(File file) throws IOException {
//        var persistentClass = (Class<T>) ((ParameterizedType) getClass()
//                .getGenericSuperclass()).getActualTypeArguments()[0];
//        List beans = new CsvToBeanBuilder(new FileReader(file))
//                .withType(persistentClass).build().parse();

        List<T> beans = new CsvToBeanBuilder(new FileReader(file))
                .withMappingStrategy(setColumnMapping())
                .build()
                .parse();
        return beans;
    }


    protected abstract ColumnPositionMappingStrategy setColumnMapping();

    @Override
    public void add(File file, String string) {
    }
}
