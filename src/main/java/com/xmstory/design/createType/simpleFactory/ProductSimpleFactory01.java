package com.xmstory.design.createType.simpleFactory;

/**
 * @ClassName ProductSimpleFactory01
 * @Description
 * @Author XM
 * @Date 2023/01/09 16:43
 **/
public class ProductSimpleFactory01 {
    //简单工厂的优化优化后直接传对象的class就可以创建
    //方法改成静态的，便于我们调用！
    public static Product createFactory(Class<? extends Product> product){
        try {
            if (product != null) {
                return product.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
