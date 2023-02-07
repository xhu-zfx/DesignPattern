package com.panghu.patterns.memento.white_box;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 10:24
 * @description
 */
public class RoleStateMemento {
    // 生命力
    private int vit;
    //
    private int atk;
    private int def;

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public RoleStateMemento() {
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
