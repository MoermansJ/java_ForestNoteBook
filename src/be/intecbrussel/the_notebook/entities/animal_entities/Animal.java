package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.Objects;

public class Animal {
    //properties
    protected String name;
    protected double weight;
    protected double height;
    protected double length;


    //constructors
    public Animal(String name) {
        this(name, 0.0, 0.0, 0.0);
    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
    }


    //getters & setters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    //custom methods
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight(), getHeight(), getLength());
    }
}
