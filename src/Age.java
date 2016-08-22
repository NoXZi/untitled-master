/**
 * Created by lti00 on 21.08.2016.
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Age {
    public Integer a1;

    public static void main1 () {
        ArrayList<Integer> age = new ArrayList<>();
        Scanner input = new Scanner(System.in);
                boolean exit = false;
        try {
            while (exit == false) {
                System.out.print("Введите возраст ");
                age.add(input.nextInt());
                if ((age.get(age.size() - 1).hashCode(000) == 0))  {
                    System.out.println("Ввод завершен");
                    exit = true;
                }

            }

        } catch (InputMismatchException e) {
            System.out.println("Введены некоректные данные");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ввод завершен");
        }
}}
