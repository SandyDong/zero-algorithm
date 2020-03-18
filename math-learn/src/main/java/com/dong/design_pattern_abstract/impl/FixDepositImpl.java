package com.dong.design_pattern_abstract.impl;

import com.dong.design_pattern_abstract.FixDeposit;

import java.math.BigDecimal;

public class FixDepositImpl implements FixDeposit {
    @Override
    public void depositMoney(BigDecimal num) {
        System.out.println("定期产品存了"+num);
    }
}
