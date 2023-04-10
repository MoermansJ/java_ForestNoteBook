package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Objects;

public class Plant {
    //properties
    protected String name;
    protected double height;


    //constructors
    public Plant(String name) {
        this(name, 0.0);
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }


    //getters & setters
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    //custom methods
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant plant)) return false;
        return getName().equals(plant.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
