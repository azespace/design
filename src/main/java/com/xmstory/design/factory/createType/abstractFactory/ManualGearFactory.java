package com.xmstory.design.factory.createType.abstractFactory;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:
 **/
public class ManualGearFactory extends CarFactory{
    @Override
    AbstractBenZCar createBenz() {
        return new BenzManualGearCar();
    }
    @Override
    AbstractBmwCar createBmw() {
        return new BmwManualGearCar();
    }
}
