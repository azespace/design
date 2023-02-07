package com.xmstory.design.structuralType.facadeMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class Client {
    public static void main(String[] args) {
        //将子系统封装 实现多个功能
        Facade facade = new Facade();
        facade.todo("打开");
    }
}
