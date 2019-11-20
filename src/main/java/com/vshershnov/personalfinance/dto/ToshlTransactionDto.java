package com.vshershnov.personalfinance.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class ToshlTransactionDto extends TransactionDto {

    private AccountsTypeToshl accountsType;

    private Set<String> labels;

    private Currency currency;
    private Currency mainCurrency;

    private BigDecimal sumInMainCurrency;
    private BigDecimal income;
}
