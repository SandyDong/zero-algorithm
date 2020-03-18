package com.dong.design_pattern_abstract.impl;

import com.dong.design_pattern_abstract.CurrentDeposit;
import com.dong.design_pattern_abstract.FixDeposit;

/**
 * 定期产品工厂
 */
public  class FixDepositFactory extends AbstractFactory {

    @Override
    CurrentDeposit getCurrFactory(String str) {
        return null;
    }

    @Override
    FixDeposit getFixFactory(String str) {
        if ("fix_01".equals(str)){
            return new FixDepositImpl();
        }
        return null;
    }
}
