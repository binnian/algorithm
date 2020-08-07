package com.benonshi.string.cast;

/**
 * @Author: BenOnSHI
 * @Date: 2020/8/7 16:18
 **/
public enum MoneyEnum {

    ONE_THOUSAND(1, "万"),
    TEN_THOUSAND(2, "万"),
    HUNDRED_THOUSAND(3, "万"),
    THOUSAND_THOUSAND(4, "万"),
    HUNDRED_MILLION_THOUSAND(5, "亿"),
    TEN_HUNDRED_MILLION_THOUSAND(6, "亿");

    private Integer length;
    private String name;

    MoneyEnum(Integer length, String name) {
        this.length = length;
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public String getName() {
        return name;
    }
}
