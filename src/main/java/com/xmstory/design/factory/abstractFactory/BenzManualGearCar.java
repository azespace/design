package com.xmstory.design.factory.abstractFactory;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:
 **/
public class BenzManualGearCar extends AbstractBenZCar{
    @Override
    void run() {
        System.out.println("手动挡");
    }
}
