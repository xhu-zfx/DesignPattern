package com.panghu.patterns.memento.black_box;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 10:36
 * @description
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---------before---------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("---------after----------");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("----------reflash---------");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
