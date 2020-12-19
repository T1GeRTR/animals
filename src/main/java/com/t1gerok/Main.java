package com.t1gerok;

import com.t1gerok.config.DroolsConfig;
import com.t1gerok.daoimpl.InputAnimalsReaderDaoImpl;
import com.t1gerok.service.AnimalService;

import java.io.File;

public class Main {
    public static void main(final String[] args) {
        new AnimalService(new InputAnimalsReaderDaoImpl(new File(".\\animals.csv"), ","),
                new DroolsConfig().getKieSession()).calculate();
    }
}
