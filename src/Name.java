/**
 * Created by alexv on 19.08.2016.
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Name {
    public ArrayList<String> name;

    public Integer s2;

    public void main2 () {
        name = new ArrayList<>();
                Scanner input = new Scanner(System.in);
        boolean exit = false;
        try {
            while (exit == false) {
                System.out.print("Введите имя ");
                name.add(input.next());
                if ((name.get(name.size() - 1).compareTo("00") == 0) ) {
                    System.out.println("Ввод завершен");
                    exit = true;
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Введены некоректные данные");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ввод завершен");
        }

}
}

