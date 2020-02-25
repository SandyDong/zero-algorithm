package com.dong.code_youhua;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂模式和策略模式区别不大
 */
public class RoleProductFactory {

    static Map<String,RoleOperation>  staticMap = new HashMap<String,RoleOperation>();

    //静态代码块初始化
    static {
        staticMap.put("ROLE_ADMIN",new AdminRoleOperateImpl());
        staticMap.put("ROLE_ORDER",new OrderRoleOperateImpl());
        staticMap.put("ROLE_UNUSAL",new UnusalRoleOperateImpl());
    }

    public static RoleOperation getOp(String roleName){
        return staticMap.get(roleName);
    }

    public static void main(String[] args) {
        System.out.println("测试工厂类策略模式");
        System.out.println(RoleProductFactory.getOp("ROLE_ADMIN").operate());
    }
}
