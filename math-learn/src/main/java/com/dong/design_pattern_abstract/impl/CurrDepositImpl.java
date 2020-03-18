package com.dong.design_pattern_abstract.impl;

import com.dong.design_pattern_abstract.CurrentDeposit;

import java.math.BigDecimal;

public class CurrDepositImpl implements CurrentDeposit {
    @Override
    public void depositMoney(BigDecimal num) {
        System.out.println("活期产品存了"+num);
    }
}
