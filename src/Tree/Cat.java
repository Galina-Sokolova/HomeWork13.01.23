package Tree;

import java.util.ArrayList;

public class Cat extends Animal{
    public Cat(String kind, String name) {
        super(kind, name);
    }
    public String getName() {
        return name;
    }
    public String getKind() {
        return kind;
    }
    @Override
    public void Voice() {
        System.out.println("Мяу");

    }

}
