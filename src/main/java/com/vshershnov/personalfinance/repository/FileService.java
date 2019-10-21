package com.vshershnov.personalfinance.repository;

import java.io.File;
import java.util.List;

public interface FileService {

    String read(File file);

    List<Object> readAll(File file);

    void add(File file, String string);

}
