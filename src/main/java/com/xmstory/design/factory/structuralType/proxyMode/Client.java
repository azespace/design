package com.xmstory.design.factory.structuralType.proxyMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/02
 * Description:
 **/
public class Client {
    public static void main(String[] args) {
        StaticProxySell staticProxySell = new StaticProxySell();
        staticProxySell.sell();//静态代理实现
        JDKProxySell jdkProxySell = new JDKProxySell();
        TicketOffice proxy = jdkProxySell.getProxy();
        proxy.sell();//jdk动态代理实现
        CglibProxySell cglibProxy = new CglibProxySell();
        TrainSell trainSell = cglibProxy.getCglibProxy();
        trainSell.sell();//cglib动态代理实现
        CglibProxyShell01 cglibProxyShell01 = new CglibProxyShell01();
        TrainSell cg01 = cglibProxyShell01.getProxy();
        cg01.sell();
    }
}
