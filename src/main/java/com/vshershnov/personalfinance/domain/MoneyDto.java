package com.vshershnov.personalfinance.domain;

import lombok.Data;

import javax.annotation.Nonnull;
import java.math.BigDecimal;

@Data
public class MoneyDto {

    @Nonnull
    private String currency;
    @Nonnull
    private BigDecimal amount;
    private String nativeCurrency;
    private BigDecimal nativeAmount;

    private float exchangeRate;
    private BigDecimal commissions;
    private BigDecimal cashBack;

}
