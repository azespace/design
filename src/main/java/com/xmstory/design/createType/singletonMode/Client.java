package com.xmstory.design.createType.singletonMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/01
 * Description:
 **/
public class Client {
    public static void main(String[] args) {
        HungrySingleton singleton = HungrySingleton.getSingleton();
        HungrySingleton01 singleton01 = HungrySingleton01.getSingleton();
    }
}
