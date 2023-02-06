package com.xmstory.design.factory.createType.factoryMethod;

/**
 * @ClassName BananaFactory
 * @Description
 * @Author XM
 * @Date 2023/01/12 10:02
 **/
public class BananaFactory implements FoodFactory{
    @Override
    public IFood creatFood() {
        return new Banana();
    }
}
