package be.intecbrussel.the_notebook.entities.plant_entities;

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
}
