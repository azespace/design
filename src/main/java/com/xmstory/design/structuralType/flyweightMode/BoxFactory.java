package com.xmstory.design.structuralType.flyweightMode;

import java.util.HashMap;
import java.util.Map;

/**
 * There is plenty of fish in the sea
 * create by XM on 2023/02/07
 * Description:
 **/
public class BoxFactory {
    private static Map<String, Box> map;
    private BoxFactory() {
        map = new HashMap<>();
        map.put("L", new LBox());
        map.put("Y", new YBox());
    }
    public static BoxFactory getInstance() {
        return Singleton.boxFactory;
    }
    private static class Singleton {
        private static final BoxFactory boxFactory = new BoxFactory();
    }
    public Box getBox(String shape) {
        return map.get(shape);
    }
}
