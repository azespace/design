package com.xmstory.design.factory.createType.singletonMode;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/02
 * Description:
 **/
public class ContainersSingleton {//容器式单例模式  线程安全
    //1 构造器私有 防止外部new
    private ContainersSingleton(){}
    //2 线程安全的map对象存储全局单例对象   spring的ioc就是这么做的
    private static Map<String,Object> singletonContainers = new ConcurrentHashMap<String,Object>();
    //通过名称获取对象
    public static Object getBean(String className){
        //防止创建多个单例对象被创建后 同一个key的obj一直被覆盖
        synchronized (singletonContainers){
            //不存在这个key就创建对象  并存进容器
            if (!singletonContainers.containsKey(className)){
                Object obj = null;
                try {
                    obj= Class.forName(className).newInstance();
                    singletonContainers.put(className,obj);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                return obj;
            }else {
                //有了直接返回
                return singletonContainers.get(className);
            }
        }
    }
}
