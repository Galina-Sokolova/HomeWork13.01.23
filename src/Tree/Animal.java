package Tree;

import java.util.ArrayList;

public abstract class Animal {
    protected String name;
    protected String kind;

    public Animal(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }
    @Override
    public String toString(){
        String res = kind +"  " +name;
        return res;
    }

    public abstract void Voice();

}
