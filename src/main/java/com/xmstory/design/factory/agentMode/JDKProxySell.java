package com.xmstory.design.factory.agentMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/02
 * Description:
 **/
public class JDKProxySell {//JDK动态代理
    private TrainSell trainSell = new TrainSell();
    //进行增强处理
    public TicketOffice getProxy(){
        TicketOffice ticketOffice = (TicketOffice)Proxy.newProxyInstance(trainSell.getClass().getClassLoader(), trainSell.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("收取费用,增强处理");
                Object invoke = method.invoke(trainSell, args);
                return invoke;
            }
        });
        return ticketOffice;
    }
}
