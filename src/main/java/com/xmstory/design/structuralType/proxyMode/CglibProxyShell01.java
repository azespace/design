package com.xmstory.design.structuralType.proxyMode;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/03
 * Description:
 **/
public class CglibProxyShell01 implements MethodInterceptor {
    //cglib使用字节码技术生成代理类，不需要实现指定类也可以做代理，但这个类不可以是final，因为cglib需要去继承被代理类
    //速度方面随着jdk的优化，从1.6开始比cglib效率更强。
    private TrainSell trainSell = new TrainSell();
    public TrainSell getProxy(){//使用Enhancer的create方法传入类名的class,并将自己传进去，自己已经是MethodInterceptor了，实现接口即可
        return (TrainSell)Enhancer.create(TrainSell.class,this);
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取费用,增强处理");
        return method.invoke(trainSell, objects);
    }
}
