package by.lamaka.homework.lesson2;

import java.util.Random;

public class Task6 {
    /*6) Даны 2 числа. Вывести большее из них*/
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(50) - 25;
        int b = random.nextInt(50) - 25;

        if (a > b) {
            System.out.println(a + " больше чем " + b);
        } else if (a == b) {
            System.out.println(a + " и " + b + " равны");
        } else {
            System.out.println(b + " больше чем " + a);
        }
    }
}
