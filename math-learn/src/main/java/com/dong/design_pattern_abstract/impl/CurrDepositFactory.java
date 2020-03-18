package com.dong.design_pattern_abstract.impl;

import com.dong.design_pattern_abstract.CurrentDeposit;
import com.dong.design_pattern_abstract.FixDeposit;

/**
 * 活期产品工厂
 */
public  class CurrDepositFactory extends AbstractFactory {

    @Override
    CurrentDeposit getCurrFactory(String str) {
        if("curr_01".equals(str)){
            return new CurrDepositImpl();
        }
        return null;
    }

    @Override
    FixDeposit getFixFactory(String str) {
        return null;
    }
}
