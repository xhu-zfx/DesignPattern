package com.panghu.framework.beans.factory.support;

import com.panghu.framework.beans.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 10:58
 * @description TODO(描述该类的作用)
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry{

    // 定义一个容器，用于存储BeanDefinition对象
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        beanDefinitionMap.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws Exception {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return beanDefinitionMap.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }
}
