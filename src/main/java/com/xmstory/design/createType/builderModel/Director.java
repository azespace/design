package com.xmstory.design.createType.builderModel;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class Director {
    //决定者类，由它决定创建什么类型的创建者，具体创建细节被封装到createBike();
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public Bike createBike(){
        builder.builderFrame();
        builder.builderSeat();
        return builder.createBike();
    }
}
