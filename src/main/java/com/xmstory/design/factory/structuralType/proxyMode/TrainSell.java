package com.xmstory.design.factory.structuralType.proxyMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/02
 * Description:
 **/
public class TrainSell implements TicketOffice{
    @Override
    public void sell() {
        System.out.println("火车站售票原价");
    }
}
