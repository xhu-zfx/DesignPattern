package com.panghu.framework.context.support;

import com.panghu.framework.beans.BeanDefinition;
import com.panghu.framework.beans.factory.support.BeanDefinitionRegistry;
import com.panghu.framework.context.ApplicationContext;
import com.panghu.framework.beans.factory.support.BeanDefinitionReader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 15:22
 * @description Application接口的子实现类，用于立即加载
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    // 声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;
    // 定义用于存储bean对象的map容器
    protected Map<String,Object> singletonObjects = new HashMap<>();
    // 用于记录配置文件类路径
    protected String configLocation;

    @Override
    public void flesh() throws Exception {
        // 加载BeanDefinition对象
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        // 初始化bean
        finishBeanInitialization();
    }
    // 初始化bean
    private void finishBeanInitialization() throws Exception {
        // 获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        String[] beanNames = registry.getBeanDefinitionNames();
        // 进行bean初始化
        for (String beanName : beanNames) {
            getBean(beanName);
        }
    }
}
