package com.vshershnov.personalfinance.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class TransactionDto {

    private LocalDate transactionDate;

    private String expenseCategory;
    private String description;

    private BigDecimal sum;
}
