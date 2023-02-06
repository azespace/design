package com.xmstory.design.behavioralType.strategyMode;

import static com.xmstory.design.behavioralType.strategyMode.PayStrategyMode.UNION_PAY;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class Client {
    public static void main(String[] args) {
        //创建订单
        Order order = new Order("1","20230206",100.1);
        //策略模式选择支付方式，并支付金额
        System.out.println(order.pay(UNION_PAY));
    }
}
