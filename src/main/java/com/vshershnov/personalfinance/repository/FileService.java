package com.vshershnov.personalfinance.repository;

import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface FileService<T> {

    T read(File file);

    List<T> readAll(File file) throws IOException, CsvException;

    void add(File file, String string);

}
