package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant {
    //properties
    private double area;


    //constructors
    public Weed(String name) {
        this(name, 0.0);
    }

    public Weed(String name, double height) {
        super(name, height);
    }


    //getters & setters
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    //custom methods
    @Override
    public String toString() {
        return "Weed{" +
                super.toString() +
                "area=" + area +
                '}';
    }
}
