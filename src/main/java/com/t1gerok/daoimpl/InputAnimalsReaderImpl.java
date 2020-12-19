package com.t1gerok.daoimpl;

import com.t1gerok.dao.InputAnimalsReader;
import com.t1gerok.model.Animal;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class InputAnimalsReaderImpl implements InputAnimalsReader {
    private File file;
    private String splitter;

    public InputAnimalsReaderImpl(File file, String splitter) {
        this.file = file;
        this.splitter = splitter;
    }

    public List<Animal> read() {
        List<Animal> animals = new ArrayList<>();
        try (BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            while (br1.ready()) {
                String line = br1.readLine();
                String[] specif = line.split(splitter);
                animals.add(new Animal(specif[0], specif[1], specif[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return animals;
    }
}
