package com.panghu.framework.beans.factory.support;


import com.panghu.framework.beans.BeanDefinition;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 10:56
 * @description TODO(描述该类的作用)
 */
public interface BeanDefinitionRegistry {
    //注册BeanDefinition对象到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    //从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName) throws Exception;

    //根据名称从注册表中获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();
}
