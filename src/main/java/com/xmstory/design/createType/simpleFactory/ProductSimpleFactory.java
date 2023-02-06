package com.xmstory.design.createType.simpleFactory;

/**
 * @ClassName ProductFactory
 * @Description
 * @Author XM
 * @Date 2023/01/09 16:35
 **/
public class ProductSimpleFactory {
    //可以发现简单工厂每次增加产品都需要修改工厂类代码，违反了开闭原则，对修改关闭，对扩展开放
    public Product createFactory(int status){
        if (status == 1){
            return new FoodProduct();
        }else if (status == 2){
            return new ToyProduct();
        }
        return null;
    }
}
