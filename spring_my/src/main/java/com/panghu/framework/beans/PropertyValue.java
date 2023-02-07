package com.panghu.framework.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 10:09
 * @description 用于封装bean标签下的property标签的属性，包括以下属性：
 *              name
 *              ref
 *              value 给基本数据类型及String类型数据赋的值
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyValue {
    private String name;
    private String ref;
    private String value;

}
