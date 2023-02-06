package com.xmstory.design.factory.createType.abstractFactory;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:
 **/
public class BenzAutoGearCar extends AbstractBenZCar{
    //确定是自动挡的
    @Override
    void run() {
        System.out.println("自动挡");
    }
}
