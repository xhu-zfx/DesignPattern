package com.panghu.framework.context.support;

import com.panghu.framework.beans.BeanDefinition;
import com.panghu.framework.beans.MutablePropertyValues;
import com.panghu.framework.beans.PropertyValue;
import com.panghu.framework.beans.factory.support.BeanDefinitionRegistry;
import com.panghu.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.panghu.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 15:38
 * @description TODO(描述该类的作用)
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{
    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        // 构建解析器对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try{
            this.flesh();
        }catch (Exception e){

        }
    }

    @Override
    public Object getBean(String name) throws Exception {
        // 判断对象容器中是否包含指定名称的bean，如果包含，返回，如果不包含，创建
        Object obj = singletonObjects.get(name);
        if (obj != null){
            return obj;
        }
        // 获取BeanDefinition对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        // 获取bean信息中的className
        String className = beanDefinition.getClassName();
        // 通过反射创建对象
        Class<?> clazz = Class.forName(className);
        Object newObj = clazz.newInstance();
        // 依赖注入
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            String propertyName = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();
            // 如果ref不为null或者空字符串，那么他就是一个bean对象，也被ioc管理，我们需要从ioc容器中寻找到该对象
            if (ref != null && !ref.equals("")){
                // 获取依赖的bean对象
                Object bean = getBean(ref);
                // 拼接方法名，寻找set方法，userDao我们需要寻找setUserDao方法
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                // 获取方法对象
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    // 如果有set方法，执行该方法，为该property赋值
                    if (methodName.equals(method.getName())){
                        method.invoke(newObj,bean);
                    }
                }
            }
            if (value != null && !"".equals(value)) {
                // 拼接方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(newObj,value);
            }
        }
        // 将该对象存储到map容器中
        singletonObjects.put(name,newObj);
        return newObj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if (bean == null ){
            return null;
        } else {
            return clazz.cast(bean);
        }
    }
}
