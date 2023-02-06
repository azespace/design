package com.xmstory.design.factory.AdapterMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/03
 * Description:
 **/
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SD读取成功！";
    }
    @Override
    public void writeSD(String content) {
        System.out.println("SD读取成功,内容"+content);
    }
}
