package com.dong.enumlearn;


public enum Role {

    /**
     * 设计枚举值  super  admin  teacher  student
     */
    SUPER(200), ADMIN(300), TEACHER(400), STUDENT(500);

    /**
     * 角色对应的编码值
     */
    private Integer code;

    /**
     * 枚举类默认的构造方法是私有的构造方法
     */
    Role(Integer code) {
        this.code = code;
    }

    public static void main(String[] args) {
        System.out.println(Role.values().length);
        System.out.println(Role.valueOf("SUPER").code);
        System.out.println(Role.SUPER.code);
    }
}
