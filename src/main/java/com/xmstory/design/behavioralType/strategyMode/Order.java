package com.xmstory.design.behavioralType.strategyMode;

import static com.xmstory.design.behavioralType.strategyMode.PayStrategyMode.DEFAULT_PAY;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class Order {
    private String uid;
    private String orderId;
    private Double amount;
    public Order(String uid, String orderId, Double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }
    public PayStatus pay(){
        return pay(DEFAULT_PAY);
    }
    public PayStatus pay(String key){
        Payment payment = PayStrategyMode.getPayment(key);
        System.out.println("使用"+payment.getName());
        System.out.println("本次交易金额"+amount +",开始扣款。。。");
        return payment.pay(uid,amount);
    }
}
