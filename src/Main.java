import Tree.Persona;
import Tree.ViewTree;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Орлов Дмитрий");
        Persona ch1 = new Persona("Орлов Александр", p1);
        Persona ch2 = new Persona("Орлова Елизавета", p1);
        Persona ch3 = new Persona("Орлов Алексей", ch1);
        Persona ch4 = new Persona("Штольц Глеб", ch2);
        Persona ch5 = new Persona("Штольц Алёна", ch2);
        Persona ch6 = new Persona("Штольц Назар", ch4);
        Persona ch7 = new Persona("Орлова Мария", ch3);
        p1.addName(ch1);
        p1.addName(ch2);
        ch1.addName(ch3);
        ch2.addName(ch4);
        ch2.addName(ch5);
        ch4.addName(ch6);
        ch3.addName(ch7);
        System.out.println(ch4.getFullName() + ", предки:  ");
        System.out.println(ch4.toString());
        System.out.println("============================================");
        ViewTree.searchPeople(ch2);
        System.out.println("============================================");
        ViewTree.searchPeople(ch1);
        System.out.println("============================================");
        ViewTree.view(p1, 0);
    }
}