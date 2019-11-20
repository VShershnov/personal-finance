package com.vshershnov.personalfinance.repository;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBeanBuilder;
import com.vshershnov.personalfinance.dto.ToshlTransactionDto;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Service
public class ToshlDetailRepo extends FileServiceCsv<ToshlTransactionDto> {

    @Override
    public ToshlTransactionDto read(File file) {
        return null;
    }

//    @Override
//    public List<ToshlTransactionDto> readAll(File file) throws IOException {
//        List<ToshlTransactionDto> beans = new CsvToBeanBuilder(new FileReader(file))
//                .withType(ToshlTransactionDto.class).build().parse();
//        return beans;
//    }

    @Override
    protected ColumnPositionMappingStrategy setColumnMapping() {
        ColumnPositionMappingStrategy strat = new ColumnPositionMappingStrategy();
        strat.setType(ToshlTransactionDto.class);
        String[] columns = new String[] {"name", "orderNumber", "id"}; // the fields to bind to in your bean
        strat.setColumnMapping(columns);
        return strat;
    }

    @Override
    public void add(File file, String string) {

    }
}
