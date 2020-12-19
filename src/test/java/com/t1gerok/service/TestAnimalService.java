package com.t1gerok.service;

import com.t1gerok.config.DroolsConfig;
import com.t1gerok.daoimpl.InputAnimalsReaderDaoImpl;
import org.junit.Test;

import java.io.File;

public class TestAnimalService {
    @Test
    public void testCalculate(){
        AnimalService animalService = new AnimalService(new InputAnimalsReaderDaoImpl(new File(".\\animals.csv"), ","), new DroolsConfig().getKieSession());
        animalService.calculate();
    }
}
