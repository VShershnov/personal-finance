package com.vshershnov.personalfinance.dto;


public enum AccountsTypeToshl {

    CASH("Cash"),
    CREDITCARD("creditcard");

    private final String type;

    AccountsTypeToshl(String type) {
        this.type = type;
    }
}
