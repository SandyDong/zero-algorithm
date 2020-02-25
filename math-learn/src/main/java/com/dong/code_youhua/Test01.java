package com.dong.code_youhua;

/**
 * 对于多层if else的问题的解决办法
 * 1 使用枚举办法
 * 2 使用工厂类办法
 */
public class Test01 {

    public static void main(String[] args) {
        printMessage(-15);

        System.out.println(authorMessage("ROLE_ADMIN"));
    }

    public static void  printMessage(int aa){
        if (aa >=0 && aa <20){
            System.out.println(aa);
        }else if (aa > 20 && aa <30){
            System.out.println(aa);
        }else{
            System.out.println(aa);
        }
    }

    /**
     * 权限认证
     * @param author
     */
    public static  String   authorMessage(String author){
       return RoleOperationImpl.valueOf(author).operate();
    }

}
