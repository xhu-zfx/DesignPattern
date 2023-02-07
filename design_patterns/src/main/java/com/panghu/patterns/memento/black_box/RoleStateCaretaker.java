package com.panghu.patterns.memento.black_box;


/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 10:34
 * @description
 */
public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
