package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void mainMenu(){
        //Menu m = new Menu();
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
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Просмотреть генеалогическое древо");
        System.out.println("2 - Найти детей");
        System.out.println("3 - Найти предков");
        System.out.println("0 - Выход");
        System.out.println("=".repeat(15));
        System.out.print("Выберите действие: ");
        int input = in.nextInt();
        //in.close();
        switch (input) {
        case 1:
            ViewTree.view(p1, 0);
            break;
        case 2:
            Scanner sc = new Scanner(System.in);
            System.out.print("Чьих детей хотите найти?: ");
            String t = sc.nextLine();
            if (t.equalsIgnoreCase(p1.getFullName())){
                ViewTree.searchPeople(p1);
            }
            if (t.equalsIgnoreCase(ch1.getFullName())){
                ViewTree.searchPeople(ch1);
            }
            if (t.equalsIgnoreCase(ch2.getFullName())){
                ViewTree.searchPeople(ch2);
            }
            if (t.equalsIgnoreCase(ch3.getFullName())){
                ViewTree.searchPeople(ch3);
            }
            if (t.equalsIgnoreCase(ch4.getFullName())){
                ViewTree.searchPeople(ch4);
            }
            if (t.equalsIgnoreCase(ch5.getFullName())){
                ViewTree.searchPeople(ch5);
            }
            if (t.equalsIgnoreCase(ch6.getFullName())){
                ViewTree.searchPeople(ch6);
            }
            if (t.equalsIgnoreCase(ch7.getFullName())){
                ViewTree.searchPeople(ch7);
            }
            break;
        case 3:
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Чьих предков хотите найти?: ");
            String t1 = sc1.nextLine();
            if (t1.equalsIgnoreCase(p1.getFullName())){
                System.out.println(p1.toString());
            }
            if (t1.equalsIgnoreCase(ch1.getFullName())){
                System.out.println(ch1.toString());
            }
            if (t1.equalsIgnoreCase(ch2.getFullName())){
                System.out.println(ch2.toString());
            }
            if (t1.equalsIgnoreCase(ch3.getFullName())){
                System.out.println(ch3.toString());
            }
            if (t1.equalsIgnoreCase(ch4.getFullName())){
                System.out.println(ch4.toString());
            }
            if (t1.equalsIgnoreCase(ch5.getFullName())){
                System.out.println(ch5.toString());
            }
            if (t1.equalsIgnoreCase(ch6.getFullName())){
                System.out.println(ch6.toString());
            }
            if (t1.equalsIgnoreCase(ch7.getFullName())){
                System.out.println(ch7.toString());
            }
            break;
        case 0:
            return;
    }
}
}
