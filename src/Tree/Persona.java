package Tree;

import java.util.ArrayList;
public class Persona {
    private Persona parent;
    private String fullName;

    public String getFullName() {
        return fullName;
    }
    public Persona getParent(){
        return parent;
    }
    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }
    public Persona(final String fullName, final Persona parent) {
        this.fullName = fullName;
        this.parent = parent;
    }
    public Persona(final String fullName) {
        this(fullName, null);
    }
    ArrayList<Persona> listName = new ArrayList<>();
    public void addName(Persona persona){
        listName.add(persona);
    }
    public ArrayList<Persona> getListName() {
        return listName;
    }
    @Override
    public String toString(){
        String res = fullName + " <------ " + parent;
        return res;
    }
}
