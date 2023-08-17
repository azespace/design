package com.xmstory.design.behavioralType.observerMode;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class EventListener {//监听对象，所有事件被放入map中，就是被监听了
    // JDK 底层的Listener通常也是这样设计的
    private Map<String, Event> events = new HashMap<>();
    /**
     * 添加事件监听
     * @param eventType
     * @param target
     */
    public void addListener(String eventType, Object target) {
        try {
            //添加什么类的什么类型作为一个完整时间  比如MouseEventCallback的onClick
            this.addListener(eventType, target,
                    target.getClass().getMethod("on" + toUpperFirstCase(eventType), Event.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    public void addListener(String eventType, Object target, Method callback) {
        // 注册事件  将MouseEventCallback的onClick转化成Event存到map  Event存了是哪个类的什么方法
        // key表示什么类型获取到这个事件
        events.put(eventType, new Event(target, callback));
    }
    /**
     * 触发事件
     * @param event
     */
    public void trigger(Event event) {
        // 存储是谁调用了事件，也就是事件源 以及发生时间
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            // 发起回调
            if (event.getCallback() != null) {
                //执行对应事件类MouseEventCallback的方法
                event.getCallback().invoke(event.getTarget(), event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 触发事件
     * @param trigger
     */
    protected void trigger(String trigger) {
        if (!this.events.containsKey((trigger))) {
            return;
        }
        //获取到某个类型的事件
        Event event = this.events.get(trigger);
        event.setTrigger(trigger);
        //通过反射触发具体事件的具体方法
        trigger(event);
    }
    private String toUpperFirstCase(String str) {
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
