package com.xmstory.design.createType.factoryMethod;

/**
 * @ClassName client
 * @Description
 * @Author XM
 * @Date 2023/01/12 10:08
 **/
public class client {
    public static void main(String[] args) {
        FoodFactory factory = new BananaFactory();
        IFood food = factory.creatFood();
        food.eat();
    }
}
