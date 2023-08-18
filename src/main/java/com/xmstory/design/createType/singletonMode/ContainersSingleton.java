package com.xmstory.design.createType.singletonMode;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/02
 * Description:容器式单例模式  线程安全
 **/
public class ContainersSingleton {
    /**
     * 构造器私有 防止外部new
     */
    private ContainersSingleton(){}

    /**
     * 线程安全的map对象存储全局单例对象 spring的ioc就是这么做的
     */
    private static Map<String,Object> singletonContainers = new ConcurrentHashMap<>();

    /**
     * 通过名称获取对象
     * @param className
     * @return
     */
    public static Object getBean(String className){
        // 加锁防止创建多个单例，对象被创建后 同一个key的obj一直被覆盖 并且那也就不是单例了
        synchronized (singletonContainers){
            //不存在这个key就创建对象  并存进容器
            if (!singletonContainers.containsKey(className)){
                Object obj = null;
                try {
                    //这里的对象创建是属于类加载创建对象可以不加volatile关键字，不像new关键字锁不住
                    //那LazySingleton02直接这样创建不就好了？
                    //其实是不行的因为反射是通过构造参数创建对象，懒加载单例的无参构造已经私有了，会抛异常，你要写更多的代码，此时性能就很慢了
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
