package com.xmstory.design.factory.AdapterMode;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/06
 * Description:
 **/
public class SDAdapterTF01 implements SDCard{
    //对象适配器(较多使用)，通过引入需要适配的类，在实现方法种中调用另一个实现类的方法，达到适配的效果
    //这种方式扩展性更强，类适配器一旦继承就只能适配那个类，不够灵活
    private TFCard tfCard;
    public SDAdapterTF01(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        return tfCard.readTF();
    }
    @Override
    public void writeSD(String content) {
        tfCard.writeTF(content);
    }
}
