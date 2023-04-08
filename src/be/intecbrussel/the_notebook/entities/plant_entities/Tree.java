package be.intecbrussel.the_notebook.entities.plant_entities;

public class Tree extends Plant {
    //properties
    private Leaftype leaftype;


    //constructors
    public Tree(String name) {
        this(name, 0.0);
    }

    public Tree(String name, double height) {
        super(name, height);
    }


    //getters & setters
    public Leaftype getLeaftype() {
        return leaftype;
    }

    public void setLeaftype(Leaftype leaftype) {
        this.leaftype = leaftype;
    }


    //custom methods
    @Override
    public String toString() {
        return "Tree{" +
                super.toString() +
                "leaftype=" + leaftype +
                '}';
    }
}
