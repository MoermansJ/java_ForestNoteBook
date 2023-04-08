package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant {
    //properties
    private String fruit;
    private LeafType leafType;


    //constructors
    public Bush(String name) {
        this(name, 0.0);
    }

    public Bush(String name, double height) {
        super(name, height);
    }


    //getters & setters
    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }


    //custom methods
    @Override
    public String toString() {
        return "Bush{" +
                super.toString() +
                "fruit='" + fruit + '\'' +
                ", leafType=" + leafType +
                '}';
    }
}
