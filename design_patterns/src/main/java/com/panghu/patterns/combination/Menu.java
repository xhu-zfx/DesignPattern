package com.panghu.patterns.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/25 15:04
 * @description
 */
public class Menu extends MenuComponent{
    // 菜单可以有多个子菜单或者子菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void print() {
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
