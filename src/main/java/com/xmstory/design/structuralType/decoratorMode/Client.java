package com.xmstory.design.structuralType.decoratorMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class Client {
    public static void main(String[] args) {
        //创造煎饼果子
        BatterCake batterCake = new BaseBatterCake();
        //将煎饼果子放到基本装饰器中 此时煎饼果子就加了一个鸡蛋
        batterCake = new EggDecorator(batterCake);
        //将加了鸡蛋的煎饼果子放到基本装饰器中 此时鸡蛋煎饼果子就又加了一个鸡蛋
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        System.out.println(batterCake.getMsg()+batterCake.getPrice());//煎饼果子加一个鸡蛋加一个鸡蛋加一个鸡蛋8
    }
}
