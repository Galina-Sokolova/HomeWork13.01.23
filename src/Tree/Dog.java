package Tree;

import java.util.ArrayList;

public class Dog extends Animal{
    public Dog(String kind, String name) {
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
        System.out.println("Гав");

    }
}
