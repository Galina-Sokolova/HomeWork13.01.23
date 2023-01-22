import Tree.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("кот","Борис");
        Cat c2 = new Cat("кот","Мурзик");
        Cat c3 = new Cat("кот","Рыжик");
        Cat c4 = new Cat("кошка","Фенька");
        Cat c5 = new Cat("кошка","Мурка");
        Cat c6 = new Cat("кошка","Чернышка");
        Cat c7 = new Cat("кот","Барон");
        Dog d1 = new Dog("собака","Мухтар");
        Dog d2 = new Dog("собака","Батлер");
        Dog d3 = new Dog("собака","Барби");
        Dog d4 = new Dog("собака","Линда");
        Dog d5 = new Dog("собака","Чук");
        Dog d6 = new Dog("собака","Соня");
        ArrayList<Animal> pt1 = new ArrayList<>();
        ArrayList<Animal> pt2 = new ArrayList<>();
        ArrayList<Animal> pt3 = new ArrayList<>();
        pt1.add(c1);
        pt1.add(c6);
        pt1.add(c7);
        pt1.add(d2);
        pt1.add(d6);
        pt2.add(c2);
        pt2.add(c4);
        pt2.add(d1);
        pt3.add(d3);

        Persona p1 = new Persona("Орлов Дмитрий", pt1);
        Persona ch1 = new Persona("Орлов Александр", p1);
        Persona ch2 = new Persona("Орлова Елизавета", p1, pt2);
        Persona ch3 = new Persona("Орлов Алексей", ch1);
        Persona ch4 = new Persona("Штольц Глеб", ch2, pt3);
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
        System.out.println("=".repeat(35));
        ViewTree.searchPeople(ch2);
        System.out.println("=".repeat(35));
        ViewTree.searchPeople(ch1);
        System.out.println("=".repeat(35));
        ViewTree.view(p1, 0);
        System.out.println("=".repeat(35));
        ViewTree.viewPets(p1);
    }
}