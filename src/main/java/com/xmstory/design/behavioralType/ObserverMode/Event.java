package com.xmstory.design.behavioralType.ObserverMode;

import java.lang.reflect.Method;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class Event {//整个事件对象的处理，保存事件类，事件类名称，以及事件类需要触发的方法，以及被谁触发，触发的事件等
    // 事件源，事件由谁发起的，保存起来
    private Object source;
    // 事件触发，要通知谁
    private Object target;
    // 事件触发，要做什么动作，回调
    private Method callback;
    // 事件的名称，触发是什么事件
    private String trigger;
    // 事件触发的时间
    private long time;
    public Event(Object target, Method callback) {
        super();
        this.target = target;
        this.callback = callback;
    }
    public Object getSource() {
        return source;
    }
    public void setSource(Object source) {
        this.source = source;
    }
    public Object getTarget() {
        return target;
    }
    public void setTarget(Object target) {
        this.target = target;
    }
    public Method getCallback() {
        return callback;
    }
    public void setCallback(Method callback) {
        this.callback = callback;
    }
    public String getTrigger() {
        return trigger;
    }
    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }
    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
