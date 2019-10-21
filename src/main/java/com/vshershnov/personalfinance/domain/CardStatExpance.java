package com.vshershnov.personalfinance.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class CardStatExpance {

    private CardType cardType;
    private LocalDate transactionDate;
    private LocalTime transactionTime;
    private int month;
    private String Category;
    private ExpenseType expType;
    private String detail;
    private int mccCode;
    private MoneyDto sum;
    private int amountAfter;

}
