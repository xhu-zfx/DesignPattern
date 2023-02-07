package com.panghu.patterns.combination;

import com.sun.org.apache.regexp.internal.RE;

import java.awt.*;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/25 14:54
 * @description
 */
public abstract class MenuComponent {
    // 菜单组件的名称
    protected String name;
    // 菜单组件的层级
    protected int level;
    // 添加子菜单
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    // 移除子菜单
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();

    }
    // 获取指定的子菜单
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        return name;
    }
    public abstract void print();
}
