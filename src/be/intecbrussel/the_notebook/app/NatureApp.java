package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class NatureApp {
    public static void main(String[] args) {
        ForestNotebook forestNotebook = new ForestNotebook();

        //plants
        Plant bush1 = new Bush("George W.", 1.82);
        Plant bush2 = new Bush("Jeb", 1.91);
        Plant tree = new Tree("Donald Tree-ump", 1.9);
        Plant weed = new Weed("Smoke", 4.2);
        Plant flower = new Flower("OK bloomer", 6.9);

        //animals
        Animal cat = new Carnivore("Fenna", 6.0, 0.5, 1.0);
        Animal chicken = new Herbivore("Nugget");
        Animal cow = new Herbivore("Big Mac", 200.0, 1.5, 2.5);
        Animal sheep1 = new Herbivore("Dolly 1", 200.0, 1.5, 2.5);
        Animal sheep2 = new Herbivore("Dolly 2", 200.0, 1.5, 2.5);
        Animal sheep3 = new Herbivore("Dolly 3", 200.0, 1.5, 2.5);
        Animal dog = new Omnivore("Elvis");
        Animal pig = new Omnivore("Bacon", 150, 1.0, 1.5);
        Animal ape = new Omnivore("Jonathan", 80, 1.8, 1.8);

        //adding plants
        forestNotebook.addPlant(bush1);
        forestNotebook.addPlant(bush1); //this shouldn't work
        forestNotebook.addPlant(bush2);
        forestNotebook.addPlant(tree);
        forestNotebook.addPlant(weed);
        forestNotebook.addPlant(flower);

        //adding animals
        forestNotebook.addAnimal(cat);
        forestNotebook.addAnimal(cat); //this shouldn't work
        forestNotebook.addAnimal(chicken);
        forestNotebook.addAnimal(cow);
        forestNotebook.addAnimal(sheep1);
        forestNotebook.addAnimal(sheep2);
        forestNotebook.addAnimal(sheep3);
        forestNotebook.addAnimal(dog);
        forestNotebook.addAnimal(pig);
        forestNotebook.addAnimal(ape);

        //printing animal and plantcount
        System.out.println("PRINTING ANIMAL AND PLANTCOUNT");
        System.out.printf("Animalcount: %2d | Plantcount: %5d |\n", forestNotebook.getAnimalCount(), forestNotebook.getPlantCount());

        //printNotebook -> unsorted lists
        System.out.println("-".repeat(50));
        System.out.println("PRINTING NOTEBOOK, UNSORTED");
        forestNotebook.printNotebook();

        //printing animals -> unsorted lists
        System.out.println("-".repeat(50));
        System.out.println("PRINTING INDIVIDUAL ANIMAL LISTS, UNSORTED");
        System.out.printf("Omnivores: %s \nCarnivores: %s \nHerbivores: %s \n", forestNotebook.getOmnivores(), forestNotebook.getCarnivores(), forestNotebook.getHerbivores());

        //sorting lists
        forestNotebook.sortAnimalsByName();
        forestNotebook.sortPlantsByName();

        //printing sorted lists
        System.out.println("-".repeat(50));
        System.out.println("PRINTING NOTEBOOK, SORTED");
        forestNotebook.printNotebook();
    }
}
