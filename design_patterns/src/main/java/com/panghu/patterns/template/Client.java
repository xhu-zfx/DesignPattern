package com.panghu.patterns.template;

public class Client {
    public static void main(String[] args) {
        //炒手撕包菜
        ConcreateClass_BaoCai baoCai = new ConcreateClass_BaoCai();
        baoCai.cookProcess();

        //炒蒜蓉菜心
        ConcreateClass_CaiXin caiXin = new ConcreateClass_CaiXin();
        caiXin.cookProcess();
    }
}