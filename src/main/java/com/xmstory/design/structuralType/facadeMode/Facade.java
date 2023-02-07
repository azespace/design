package com.xmstory.design.structuralType.facadeMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class Facade {
    private TV tv;
    private Light light;
    public Facade() {
        tv = new TV();
        light = new Light();
    }
    public void todo(String msg){
        if (msg.contains("打开")){
            on();
        } else if (msg.contains("关闭")) {
            off();
        }else{
            System.out.println("我听不懂你在说什么");
        }
    }
    private void on(){
        tv.on();
        light.on();
    }
    private void off(){
        tv.off();
        light.off();
    }
}
