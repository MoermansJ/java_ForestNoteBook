package be.intecbrussel.the_notebook.custom.collections;

import java.util.ArrayList;

public class UniqueArrayList<E> extends ArrayList<E> {
    @Override
    public boolean add(E e) {
        if (!this.contains(e)) {
            return super.add(e);
        }
        return false;
    }

    //how do I make the add(int, E) return type boolean and use the super.add(int, E)?????
//    @Override
//    public void add(int index, E element) {
//        if (!this.contains(element)) {
//            super.add(index, element);
//        }
//    }

    
}
