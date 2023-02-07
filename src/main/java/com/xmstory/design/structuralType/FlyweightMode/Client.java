package com.xmstory.design.structuralType.FlyweightMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class Client {
    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        Box l = instance.getBox("L");
        Box y = instance.getBox("Y");
        Box x = instance.getBox("Y");
        l.display("黄色");
        x.display("绿色");
        System.out.println(y==x);//true
    }
}
