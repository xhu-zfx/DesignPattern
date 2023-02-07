package com.panghu.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 10:17
 * @description
 */
public class MutablePropertyValues implements Iterable<PropertyValue>{
    private final List<PropertyValue> propertyValueList;

    // final修饰的成员遍历必须在构造器中为其赋值，并且只允许这一次赋值
    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<PropertyValue>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList.isEmpty()){
            this.propertyValueList = new ArrayList<PropertyValue>();
        } else {
            this.propertyValueList = propertyValueList;
        }
    }

    // 获取所有propertyValue对象，以数组形式返回
    public PropertyValue[] getPropertyValueList() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    // 根据name属性值获取PropertyValue对象
    public PropertyValue getPropertyValue(String propertyName){
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getValue().equals(propertyName))
                return propertyValue;
        }
        return null;
    }
    // 判断集合是否为空
    public boolean isEmpty(){
        return propertyValueList.isEmpty();
    }

    // 添加PropertyValue对象
    public MutablePropertyValues addPropertyValue(PropertyValue pv){
        // 判断集合中是否已经有该对象，如果有，需要替换
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue propertyValue = propertyValueList.get(i);
            if (propertyValue.getValue().equals(pv.getName())) {
                propertyValueList.set(i,pv);
                return this;
            }
        }
        propertyValueList.add(pv);
        return this;
    }

    // 判断是否有指定name属性的对象
    public boolean contains(String propertyName){
        return getPropertyValue(propertyName) != null;
    }

    // 获取迭代器对象
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }

}
