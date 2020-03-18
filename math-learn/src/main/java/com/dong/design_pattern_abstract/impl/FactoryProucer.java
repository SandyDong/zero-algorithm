package com.dong.design_pattern_abstract.impl;

import com.dong.design_pattern_abstract.CurrentDeposit;
import com.dong.design_pattern_abstract.FixDeposit;

import java.math.BigDecimal;

/**
 * 工厂制造者（产生产品工厂的）
 */
public class FactoryProucer {
    /**
     * 根据工厂类型产生工厂
     * @param type
     * @return
     */
    public static AbstractFactory  getProductFactoryByType(String type){
        if (null==type||"".equals(type)){
            System.out.println("输入的类型为空!");
            return null;
        }
        if ("curr".equals(type)){
            return new CurrDepositFactory();
        }else if ("fix".equals(type)){
            return new FixDepositFactory();
        }else {
            System.out.println("该类型产品工厂不能生产!");
            return null;
        }
    }

    public static void main(String[] args) {
        //获取活期产品工厂
        AbstractFactory curr = getProductFactoryByType("curr");
        CurrentDeposit curr_01 = curr.getCurrFactory("curr_01");
        curr_01.depositMoney(new BigDecimal(1000));
        //获取定期产品工厂
        AbstractFactory fix = getProductFactoryByType("fix");
        FixDeposit fix_01 = fix.getFixFactory("fix_01");
        fix_01.depositMoney(new BigDecimal(2000));
    }
}
