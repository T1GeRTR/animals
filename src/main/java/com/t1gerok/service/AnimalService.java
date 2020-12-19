package com.t1gerok.service;

import com.t1gerok.dao.InputAnimalsReader;
import com.t1gerok.model.Animal;
import org.kie.api.runtime.KieSession;

public class AnimalService {
    private final InputAnimalsReader fileReader;
    private final KieSession session;

    public AnimalService(InputAnimalsReader fileReader, KieSession session) {
        this.fileReader = fileReader;
        this.session = session;
    }

    public void calculate(){
        for (Animal animal: fileReader.read()){
            session.insert(animal);
        }
        session.fireAllRules();
        System.out.println("1. Травоядных животных: " + Counter.getRule1());
        System.out.println("1. Маленьких травоядных и плотоядных животных: " + Counter.getRule2());
        System.out.println("1. Всеядных животных, которые не являются высокими: " + Counter.getRule3());
        Counter.clear();
    }
}
