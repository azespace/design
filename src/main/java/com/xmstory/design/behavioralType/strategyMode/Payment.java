package com.xmstory.design.behavioralType.strategyMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public abstract class Payment {
    //支付方式抽象类 实现支付方式，余额查询，支付等
    public abstract String getName();
    protected abstract double queryBalance(String uid);
    public PayStatus pay(String uid, Double amount) {
        if (queryBalance(uid) < amount) {
            return new PayStatus(500, "支付失败", "余额不足");
        }
        return new PayStatus(200, "支付成功", "支付金额：" + amount);
    }
}
