package com.xmstory.design.factory.structuralType.proxyMode;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/02
 * Description:
 **/
public class CglibProxySell {
    TrainSell trainSell = new TrainSell();
    public  TrainSell getCglibProxy(){//使用Enhancer的create方法传入对象的class,并实现匿名内部类实现MethodInterceptor方法做增强处理
        TrainSell trainSell1 = (TrainSell)Enhancer.create(trainSell.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("收取费用,增强处理");
                Object invoke = method.invoke(trainSell, objects);
                return invoke;
            }
        });
        return trainSell1;
    }
}
