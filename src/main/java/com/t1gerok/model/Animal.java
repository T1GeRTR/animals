package com.t1gerok.model;

import java.util.Objects;

public class Animal {
    private String weight;
    private String growth;
    private String type;

    public Animal(String weight, String growth, String type) {
        this.weight = weight;
        this.growth = growth;
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getWeight(), animal.getWeight()) &&
                Objects.equals(getGrowth(), animal.getGrowth()) &&
                Objects.equals(getType(), animal.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getGrowth(), getType());
    }
}
