package com.panghu.patterns.memento.white_box;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 10:34
 * @description
 */
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateCaretaker() {
    }

    public RoleStateCaretaker(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }
}
