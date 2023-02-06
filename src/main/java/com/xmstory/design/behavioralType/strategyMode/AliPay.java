package com.xmstory.design.behavioralType.strategyMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class AliPay extends Payment{
    @Override
    public String getName() {
        return "支付宝支付";
    }
    @Override
    protected double queryBalance(String uid) {
        return 1000;
    }
}
