package com.dong.design_pattern_abstract.impl;

import com.dong.design_pattern_abstract.CurrentDeposit;
import com.dong.design_pattern_abstract.FixDeposit;

/**
 * 超级工厂（最抽象的工厂）
 */
public abstract class AbstractFactory {
    /**
     * 获取活期产品工厂
     * @param str
     * @return
     */
   abstract CurrentDeposit  getCurrFactory(String str);
    /**
     * 获取定期产品工厂
     * @param str
     * @return
     */
   abstract FixDeposit  getFixFactory(String str);
}
