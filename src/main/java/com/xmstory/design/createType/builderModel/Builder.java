package com.xmstory.design.createType.builderModel;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public abstract class Builder {
    //创建抽象类，由子类决定创建什么样的产品，产品范围由限制，只可以创建自行车
    Bike bike = new Bike();
    //具体产品的属性由子类给予
    public abstract void builderFrame();
    public abstract void builderSeat();
    //返回创建好的产品
    public abstract Bike createBike();
}
