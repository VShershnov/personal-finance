package com.vshershnov.personalfinance.dto;

import lombok.Data;

@Data
public class ToshlTransaction extends TransactionDto {

    private AccountsTypeToshl accountsType;
    private String labels;
    private Currency currency;
    private Currency mainCurrency;

    private int sumInMainCurrency;
}
