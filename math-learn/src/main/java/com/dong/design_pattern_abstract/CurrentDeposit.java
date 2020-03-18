package com.dong.design_pattern_abstract;

import java.math.BigDecimal;

/**
 * 活期存款
 */
public interface CurrentDeposit {
    /**
     * 活期存钱
     * @param num
     */
    void   depositMoney(BigDecimal num);
}
