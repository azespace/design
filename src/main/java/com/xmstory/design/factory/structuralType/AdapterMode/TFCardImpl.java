package com.xmstory.design.factory.structuralType.AdapterMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/03
 * Description:
 **/
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "TF读取成功！";
    }
    @Override
    public void writeTF(String content) {
        System.out.println("TF写入成功,内容"+content);
    }
}
