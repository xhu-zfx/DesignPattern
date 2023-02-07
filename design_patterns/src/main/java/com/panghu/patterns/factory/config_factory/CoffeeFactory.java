package com.panghu.patterns.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/18 19:29
 * @description
 */
public class CoffeeFactory {
    // 加载配置文件，加载配置的全类名并创建该类对象
    // 1.定义存储容器
    private static HashMap<String,Coffee> coffeeMap = new HashMap<String,Coffee>();

    // 2.加载配置文件
    static {
        Properties properties = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            // 从properties集合中获取全类名
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty((String) key);
                // 通过反射创建对象
                Class clazz = Class.forName(className);
                Coffee coffee= (Coffee) clazz.newInstance();
                // 放入容器
                coffeeMap.put((String) key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据名称获取对象
     * @param name
     * @return
     */
    public static Coffee createCoffee(String name){
        return coffeeMap.get(name);
    }
}
