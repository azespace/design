package com.xmstory.design.behavioralType.strategyMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class WechatPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }
    @Override
    protected double queryBalance(String uid) {
        return 16000;
    }
}
