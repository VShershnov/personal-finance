package com.vshershnov.personalfinance.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class ToshlTransactionDto extends TransactionDto {

    @CsvBindByName(column = "First Name", required = true)
    private AccountsTypeToshl accountsType;
    private Set<String> labels;
    private Currency currency;
    private Currency mainCurrency;

    private BigDecimal sumInMainCurrency;
}
