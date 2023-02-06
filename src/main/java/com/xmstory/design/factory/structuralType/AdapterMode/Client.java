package com.xmstory.design.factory.structuralType.AdapterMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/03
 * Description:
 **/
public class Client {
    public static void main(String[] args) {
        //类适配器，用的比较少，适配器类实现需要适配的接口，并继承被适配的类，接口需要实现的方法做适配处理(调用被适配的类的方法)
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        SDCard sdCardAdapter = new SDAdapterTF();
        System.out.println(computer.readSD(sdCardAdapter));
        //对象适配器，用的比较多，类内部引入接口，达到适配更多类的效果
        SDCard sdCard1 = new SDAdapterTF01(new TFCardImpl());
        System.out.println(sdCard1.readSD());
    }
}
