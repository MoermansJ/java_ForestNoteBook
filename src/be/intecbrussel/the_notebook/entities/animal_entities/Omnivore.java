package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Set;

public class Omnivore extends Animal {
    //properties
    private Set<Plant> plantDiet;
    private double maxFoodSize;


    //constructors
    public Omnivore(String name) {
        this(name, 0.0, 0.0, 0.0);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }


    //getters & setters
    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }


    //custom methods
    public void addPlantToDiet(Plant plant) {
        //logic to add plant to plantdiet
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                super.toString() +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                '}';
    }
}
