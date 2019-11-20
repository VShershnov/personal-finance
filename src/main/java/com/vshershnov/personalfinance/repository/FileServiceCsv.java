package com.vshershnov.personalfinance.repository;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public abstract class FileServiceCsv<T> implements FileService<T> {

    @Override
    public T read(File file) {
        return null;
    }

    @Override
    public List<T> readAll(File file) throws FileNotFoundException {
        List beans = new CsvToBeanBuilder(new FileReader(file))
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
