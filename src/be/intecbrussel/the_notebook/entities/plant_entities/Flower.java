package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant {
    //properties
    private Scent smell;


    //constructors
    public Flower(String name) {
        this(name, 0.0);
        this.smell = Scent.DEFAULT_SCENT;
    }

    public Flower(String name, double height) {
        super(name, height);
        this.smell = Scent.DEFAULT_SCENT;
    }


    //getters & setters
    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }


    //custom methods

    @Override
    public String toString() {
        return "Flower{" +
                super.toString() +
                "smell=" + smell +
                '}';
    }
}
