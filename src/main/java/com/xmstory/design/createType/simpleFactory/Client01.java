package com.xmstory.design.createType.simpleFactory;

/**
 * @ClassName Client01
 * @Description
 * @Author XM
 * @Date 2023/01/09 16:46
 **/
public class Client01 {
    public static void main(String[] args) {
        // 错误实现  具体创建对象的逻辑不应该在业务中，应该由工厂实现，把客户类和具体子类的实现解耦
        // Product product = new FoodProduct();
        //简单工厂优化后实现
        Product factory = ProductSimpleFactory01.createFactory(FoodProduct.class);
    }
}
