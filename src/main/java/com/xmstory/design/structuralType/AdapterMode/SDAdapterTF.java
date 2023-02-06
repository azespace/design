package com.xmstory.design.structuralType.AdapterMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/03
 * Description:
 **/
public class SDAdapterTF extends TFCardImpl implements SDCard{
    //类适配器(较少使用)，A类实现自己的方法，但是需要去适配B类，通过继承B类，达到调用其他类的效果，从而A类适配B类
    @Override
    public String readSD() {
        return super.readTF();
    }
    @Override
    public void writeSD(String content) {
        super.writeTF("重装机兵正在加载~~~");
    }
}
