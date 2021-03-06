package com.github.misterchangray.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Miste on 4/19/2018.
 * 返回对象为Map子类,可直接当Map使用
 * 简易的map构建器,用于链式构建map结构数据
 * 示例如下：
 * MapBuilder.build().add("key", "value").add("key2", "value2");
 *
 */
public class MapBuilder extends HashMap {

    private MapBuilder() {}

    public static Map<String, Object> build() {
        return new MapBuilder();
    }

    /**
     * 向map里增加元素
     * @param key
     * @param value
     * @return MapBuilder
     */
    private MapBuilder add(String key, Object value) {
        super.put(key, value);
        return  this;
    }

    /**
     * 向map里增加元素
     * @param key
     * @param value
     * @return MapBuilder
     */
    private MapBuilder put(String key, Object value) {
        this.add(key, value);
        return  this;
    }

}
