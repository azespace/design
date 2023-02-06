package com.xmstory.design.factory.createType.abstractFactory;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:
 **/
public abstract class CarFactory {
    //核心工厂，将不同汽车但相同功能的组合起来，一次创建一个产品族，比如宝马自动挡，奔驰自动挡
    abstract AbstractBenZCar createBenz();
    abstract AbstractBmwCar createBmw();
}
