package be.intecbrussel.the_notebook.entities.plant_entities;

public class Tree extends Plant {
    //properties
    private LeafType leaftype;


    //constructors
    public Tree(String name) {
        this(name, 0.0);
        this.leaftype = LeafType.DEFAULT_LEAFTYPE;
    }

    public Tree(String name, double height) {
        super(name, height);
        this.leaftype = LeafType.DEFAULT_LEAFTYPE;
    }


    //getters & setters
    public LeafType getLeaftype() {
        return leaftype;
    }

    public void setLeaftype(LeafType leaftype) {
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
