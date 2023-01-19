package Tree;
import java.util.ArrayList;

public class ViewTree {
    public static void view(Persona root, int num){
        String name = "_".repeat(num);
        String stat = "";
        switch (num){
            case 0:
                stat = "   отец (мать)";
                break;
            case 1:
                stat = "   сын (дочь)";
                break;
            case 2:
                stat = "   внук (внучка)";
                break;
            case 3:
                stat = "   правнук (правнучка)";
                break;
        }

        System.out.println(name+root.getFullName()  +  stat);
        for (Persona a: root.getListName()){
            view(a, num+1);
        }
    }
     public static void searchPeople(Persona persona) {
         System.out.println(persona.getFullName() + ", дети: ");
        for (Persona b: persona.getListName()){
            if (b.getParent() == persona){
                System.out.println(b.getFullName());
            }
        }
    }

}