package com.panghu.framework.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 10:44
 * @description 用于封装bean，包含以下属性：
 *              id
 *              className：全类名
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BeanDefinition {
    private String id;
    private String className;
    private MutablePropertyValues propertyValues;
}
