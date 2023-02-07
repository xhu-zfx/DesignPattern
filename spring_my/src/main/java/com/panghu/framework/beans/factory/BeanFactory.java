package com.panghu.framework.beans.factory;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 15:07
 * @description IOC容器父接口
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;
    <T> T getBean(String name,Class<? extends T> clazz) throws Exception;
}
