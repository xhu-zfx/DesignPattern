package com.panghu.patterns.memento.white_box;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 10:19
 * @description 游戏角色类(发起人)
 */
public class GameRole {
    // 生命力
    private int vit;
    //
    private int atk;
    private int def;
    // 初始化
    public void initState(){
        this.vit = 100;
        this.def = 100;
        this.atk = 100;
    }

    public void fight(){
        this.vit = 0;
        this.def = 0;
        this.atk = 0;
    }
    // 保存角色状态
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }

    public void recoverState(RoleStateMemento roleStateMemento){
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }
    // 展示状态功能
    public void stateDisplay(){
        System.out.println("生命力：" + vit);
        System.out.println("攻击力：" + atk);
        System.out.println("防御力：" + def);
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
