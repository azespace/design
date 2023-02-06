package com.xmstory.design.createType.builderModel;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class OfoBuilder extends Builder {
    @Override
    public void builderFrame() {
        bike.setFrame("碳纤维结构");
    }
    @Override
    public void builderSeat() {
        bike.setSeat("记忆棉座椅");
    }
    @Override
    public Bike createBike() {
        return bike;
    }
}
