package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNotebook {
    //properties
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;


    //constructors
    public ForestNotebook() {
        carnivores = new ArrayList<>();
        omnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
        animals = new ArrayList<>();
        plants = new ArrayList<>();
    }


    //getters & setters
    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }


    //custom methods
    public void addAnimal(Animal animal) {
        if (this.animals.contains(animal)) {
            return;
        }

        switch (animal.getClass().getSimpleName().toUpperCase()) {
            case "OMNIVORE":
                omnivores.add((Omnivore) animal);
                break;
            case "HERBIVORE":
                herbivores.add((Herbivore) animal);
                break;
            case "CARNIVORE":
                carnivores.add((Carnivore) animal);
                break;
            default:
                System.out.println("ANIMAL CLASS NOT RECOGNISED, CHECK FORESTNOTEBOOK.ADDANIMAL()");
                return;
        }

        animals.add(animal);
        animalCount++;
    }

    public void addPlant(Plant plant) {
        if (this.plants.contains(plant)) {
            return;
        }

        plants.add(plant);
        plantCount++;
    }

    public void printNotebook() {
        System.out.printf("Animals(%d): %s %nPlants(%d): %s \n", animalCount, animals, plantCount, plants);
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
    }
}
