package oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class ModArrayList<D> extends ArrayList<D> {


    public D getUsingMod( int index) {
        index = Math.abs(index);
        int length = this.size();
        if (index > length) {
            index = index % length;
        }
        return this.get(index);


    }
}
