package com.panghu.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2023/1/12 9:39
 * @description
 */
public class Home {
    private List<Animal> nodeList = new ArrayList<>();
    public void add(Animal animal){
        nodeList.add(animal);
    }
    public void action(Person person){
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
