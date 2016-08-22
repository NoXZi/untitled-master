import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {
    public static void main(String[] argv) {

        Breed cat = new Breed("Вася", 2, "муж", 4, "черный", "мяу");
        System.out.println("Кличка:  "+cat.getName() +"\n   Возраст:  "+cat.getAge()+"\n   Пол:  "+cat.getSex()+"\n   Количество лап:  "+cat.getLegs()+"\n   Цвет:  "+ cat.getColor());
        System.out.println(cat.getName() + " говорит: " + cat.sound());
    }
}
    /*public static void main(String[] argv) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Integer countRecords = 3;
        boolean exit = false;
        try {
            while (exit == false) {
                System.out.print("Введите имя ");
                name.add(input.next());
                if ((name.get(name.size() - 1).compareTo("00") == 0) ) {
                    System.out.println("Ввод завершен");
                    exit = true;
                } else {
                    System.out.print("Введите возраст ");
                    age.add(input.nextInt());
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Введены некоректные данные");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ввод завершен");
        }

        name.remove(name.size() - 1);

        try {
            name.size();
            for (int i =0; i<name.size(); ++i)  {
                System.out.println(" Имя:  " + name.get(i) + "     Возраст:  " + age.get(i) );
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Нету данных");
        }

    }*/