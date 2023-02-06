package com.xmstory.design.structuralType.proxyMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/02
 * Description:
 **/
public class StaticProxySell implements TicketOffice{//静态代理
    TrainSell trainSell = new TrainSell();
    @Override
    public void sell() {
        System.out.println("收取费用,增强处理");
        trainSell.sell();
    }
}
