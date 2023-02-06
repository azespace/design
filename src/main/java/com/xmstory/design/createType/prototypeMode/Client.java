package com.xmstory.design.createType.prototypeMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/02
 * Description:
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //实现Cloneable接口的clone方法 实现原型模式
        Student xm = new Student();
        xm.setName("xm");
        Student qq = xm.getBean();
        System.out.println(xm);//Student@7440e464
        System.out.println(qq);//Student@49476842
    }
}
