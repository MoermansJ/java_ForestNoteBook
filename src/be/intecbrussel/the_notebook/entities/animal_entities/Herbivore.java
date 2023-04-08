package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Set;
import java.util.stream.Stream;

public class Herbivore extends Animal {
    //properties
    Set<Plant> plantDiet;


    //constructors
    public Herbivore(String name) {
        this(name, 0.0, 0.0, 0.0);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }


    //getters & setters
    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }


    //custom methods
    public void addPlantToDiet(Plant plant) {
        //logic to add plant to diet
    }

    public void printDiet() {
        //double check this logic
        Stream.of(plantDiet).forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                super.toString() +
                "plantDiet=" + plantDiet +
                '}';
    }
}
