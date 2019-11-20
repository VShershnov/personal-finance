package com.vshershnov.personalfinance.repository;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.vshershnov.personalfinance.dto.ToshlTransactionDto;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class ToshlDetailRepo extends FileServiceCsv<ToshlTransactionDto> {

    @Override
    public ToshlTransactionDto read(File file) {
        return null;
    }

    @Override
    protected ColumnPositionMappingStrategy setColumnMapping() {
        ColumnPositionMappingStrategy strat = new ColumnPositionMappingStrategy();
        strat.setType(ToshlTransactionDto.class);

        // the fields to bind to in your bean
        String[] columns = new String[]{"transactionDate", "accountsType", "expenseCategory", "labels", "amount", "income", "currency", "sumInMainCurrency", "mainCurrency", "description"};
        strat.setColumnMapping(columns);
        return strat;
    }

    @Override
    public void add(File file, String string) {

    }
}
