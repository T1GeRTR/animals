package com.t1gerok.service;

import com.t1gerok.config.DroolsConfig;
import com.t1gerok.daoimpl.InputAnimalsReaderImpl;
import org.junit.Test;

import java.io.File;

public class TestAnimalService {
    @Test
    public void testCalculate(){
        AnimalService animalService = new AnimalService(new InputAnimalsReaderImpl(new File(".\\animals.csv"), ","), new DroolsConfig().getKieSession());
        animalService.calculate();
    }
}
