package com.panghu.patterns.template;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/7 15:32
 * @description
 */
public class ConcreateClass_BaoCai extends AbastractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");

    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");

    }
}
