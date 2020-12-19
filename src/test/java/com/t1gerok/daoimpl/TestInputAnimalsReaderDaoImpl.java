package com.t1gerok.daoimpl;

import com.t1gerok.model.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class TestInputAnimalsReaderDaoImpl {

    @Test
    public void testRead() {
        InputAnimalsReaderDaoImpl fileReader = new InputAnimalsReaderDaoImpl(new File(".\\animals.csv"), ",");
        List<Animal> animals = fileReader.read();
        Assert.assertEquals(3, animals.size());
    }

    @Test
    public void testReadFail() {
        InputAnimalsReaderDaoImpl fileReader = new InputAnimalsReaderDaoImpl(new File(".\\wrongFile.csv"), ",");
        List<Animal> animals = fileReader.read();
        Assert.assertEquals(0, animals.size());
    }

}
