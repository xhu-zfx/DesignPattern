package com.panghu.patterns.interpret;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/13 9:52
 * @description 环境角色类
 */
public class Context {
    private Map<Variable,Integer> map = new HashMap<>();
    public void assign(Variable var,Integer value){
        map.put(var,value);
    }
    public int getValue(Variable var){
        return map.get(var);
    }

}
