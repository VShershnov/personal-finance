package com.vshershnov.personalfinance.domain;

public enum CardType {
    MONOBANK("mono"),
    FOP("fop"),
    PB_UNIVERSAL("pb_universal"),
    PB_VYPLAT("pb_vyp"),
    PB_VYPLAT_GOLD("pb_vyp_gold");

    private final String name;

    CardType(String name) {
        this.name = name;
    }
}
