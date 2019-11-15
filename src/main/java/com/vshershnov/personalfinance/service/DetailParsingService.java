package com.vshershnov.personalfinance.service;

import java.io.File;
import java.util.List;

public interface DetailParsingService {

    List<String> fetchData(File file);

}
