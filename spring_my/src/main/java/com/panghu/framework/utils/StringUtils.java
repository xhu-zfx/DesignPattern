package com.panghu.framework.utils;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/2/7 15:54
 * @description TODO(描述该类的作用)
 */
public class StringUtils {
    public StringUtils() {
    }
    public static String getSetterMethodByFieldName(String fieldName){
        String methodName = "set" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
        return methodName;
    }
}
