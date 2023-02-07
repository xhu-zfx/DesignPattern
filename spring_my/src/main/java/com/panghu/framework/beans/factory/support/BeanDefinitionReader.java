package com.panghu.framework.beans.factory.support;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 13:05
 * @description 用于解析配置文件，该接口定义规范
 */
public interface BeanDefinitionReader {
    //获取注册表对象
    BeanDefinitionRegistry getRegistry();
    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
