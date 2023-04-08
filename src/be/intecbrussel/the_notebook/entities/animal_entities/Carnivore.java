package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal {
    //properties
    private double maxFoodSize;


    //constructors
    public Carnivore(String name) {
        this(name, 0.0, 0.0, 0.0);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }


    //getters & setters
    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }


    //custom methods
    @Override
    public String toString() {
        return "Carnivore{" +
                super.toString() +
                "maxFoodSize=" + maxFoodSize +
                '}';
    }
}
