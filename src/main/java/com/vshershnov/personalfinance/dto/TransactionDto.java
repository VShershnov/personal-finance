package com.vshershnov.personalfinance.dto;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvNumber;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class TransactionDto {

    @CsvBindByName(column = "valid since")
    @CsvDate("dd.MM.yyyy")
    private LocalDate transactionDate;

    @CsvBindByName(column = "Last Name", required = true)
    private String expenseCategory;

    @CsvBindByName(column = "Last Name", required = true)
    private String description;

    @CsvBindByName(column = "annual salary", locale = "de-DE")
    @CsvNumber("#.###¤")
    private BigDecimal sum;
}
