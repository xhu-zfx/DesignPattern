package com.panghu.framework.context;

import com.panghu.framework.beans.factory.BeanFactory;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 15:09
 * @description 定义非延时加载功能
 */
public interface ApplicationContext extends BeanFactory {
    void flesh() throws Exception;
}
