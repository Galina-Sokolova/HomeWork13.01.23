package Tree;

import java.util.ArrayList;
public class Persona {
    private Persona parent;
    private String fullName;
    private  Animal anim;
    private ArrayList<Animal> listPets;

    public String getFullName() {
        return fullName;
    }
    public Persona getParent(){
        return parent;
    }
    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }
    public Persona(final String fullName, final Persona parent, ArrayList<Animal> listPets) {
        this.fullName = fullName;
        this.parent = parent;
        this.listPets = listPets;
    }
    public Persona(final String fullName, final Persona parent) {
        this(fullName, parent, null);
    }
    public Persona(final String fullName) {
        this(fullName, null, null);
    }
    public Persona(final String fullName, final ArrayList<Animal> listPets) {
        this(fullName, null, listPets);
    }
    ArrayList<Persona> listName = new ArrayList<>();
    public void addName(Persona persona){
        listName.add(persona);
    }
    public ArrayList<Persona> getListName() {
        return listName;
    }
    public ArrayList<Animal> getListPets() {
        return listPets;
    }
    @Override
    public String toString(){
        String res = fullName + " <------ " + parent;
        return res;
    }
}
