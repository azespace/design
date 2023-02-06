package com.xmstory.design.createType.builderModel;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class Client {
    public static void main(String[] args) {
        //具体产品封装在创建者,具体的创建者封装在执行者内部，由执行者调用具体的创建者方法创建出产品
        Director director = new Director(new MobikeBuilder());
        Bike bike = director.createBike();
        System.out.println(bike.getFrame()+"---"+bike.getSeat());
    }
}