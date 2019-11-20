package com.vshershnov.personalfinance.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface DetailParsingService<T> {

    List<T> fetchData(File file) throws FileNotFoundException;

}
