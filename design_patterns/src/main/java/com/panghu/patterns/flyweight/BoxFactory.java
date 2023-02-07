package com.panghu.patterns.flyweight;

import java.util.HashMap;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/25 16:04
 * @description
 */
public class BoxFactory {
    private HashMap<String ,AbstractBox> map;

    private BoxFactory() {
        this.map = new HashMap<>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    private static BoxFactory factory = new BoxFactory();

    public static BoxFactory getInstance(){
        return factory;
    }

    // 根据名称获取图像对象
    public AbstractBox getShape(String name){
        return map.get(name);
    }
}
