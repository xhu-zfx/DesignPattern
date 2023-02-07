package com.panghu.framework.beans.factory.xml;

import com.panghu.framework.beans.BeanDefinition;
import com.panghu.framework.beans.MutablePropertyValues;
import com.panghu.framework.beans.PropertyValue;
import com.panghu.framework.beans.factory.support.BeanDefinitionReader;
import com.panghu.framework.beans.factory.support.BeanDefinitionRegistry;
import com.panghu.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 13:07
 * @description TODO(描述该类的作用)
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {
    // 声明注册表对象
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        // 使用dom4j进行xml文件解析
        SAXReader reader = new SAXReader();
        // 获取类路径下的配置文件
        InputStream inputStream = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(inputStream);
        // 获取Document对象获取根标签对象(beans)
        Element rootElement = document.getRootElement();
        // 获取根标签下的所有bean标签对象
        List<Element> beanElements = rootElement.elements("bean");
        // 遍历集合
        for (Element beanElement : beanElements) {
            // 获取id属性
            String id = beanElement.attributeValue("id");
            // 获取class属性
            String className = beanElement.attributeValue("class");
            // 创建BeanDefinition对象
            BeanDefinition beanDefinition = new BeanDefinition();
            // 将id和class封装到BeanDefinition对象中
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);
            // 获取bean标签下所有的property标签对象
            List<Element> propertyElements = beanElement.elements("property");
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
            for (Element propertyElement : propertyElements) {
                String name = propertyElement.attributeValue("name");
                String ref = propertyElement.attributeValue("ref");
                String value = propertyElement.attributeValue("value");
                // 创建PropertyValue对象
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                mutablePropertyValues.addPropertyValue(propertyValue);
            }
            // 将Property封装到beanDefinition对象中
            beanDefinition.setPropertyValues(mutablePropertyValues);
            // 注册beanDefinition对象到注册表中
            registry.registerBeanDefinition(id,beanDefinition);
        }
    }
}
