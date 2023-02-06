package com.xmstory.design.createType.abstractFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:
 **/
public class client {
    public static void main(String[] args) {
        //手动挡家族创建过程如下
        CarFactory factory = new ManualGearFactory();
        AbstractBenZCar benz = factory.createBenz();//benz
        AbstractBmwCar bmw = factory.createBmw();//bmw
        benz.run();
        bmw.run();
        List<String> list = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
        String next = iterator.next();

    }
}
