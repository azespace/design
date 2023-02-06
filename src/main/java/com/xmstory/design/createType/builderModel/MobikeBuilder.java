package com.xmstory.design.createType.builderModel;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class MobikeBuilder extends Builder{
    @Override
    public void builderFrame() {
        bike.setFrame("铝合金支架");
    }
    @Override
    public void builderSeat() {
        bike.setSeat("真皮座椅");
    }
    @Override
    public Bike createBike() {
        return bike;
    }
}
