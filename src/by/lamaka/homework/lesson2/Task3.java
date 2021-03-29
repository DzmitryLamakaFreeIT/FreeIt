package by.lamaka.homework.lesson2;

import java.util.Random;

public class Task3 {
    /*3) Дано целое число. Если оно является положительным,
    то прибавить к нему 1.Если отрицательным, то вычесть из него 2.
    Если нулевым, то заменить его на 10. Вывести полученное число*/
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(50) - 25;
        int result;

        System.out.println("Дано число : " + number);

        if (number > 0) {
            result = number + 1;
        } else if (number == 0) {
            result = 10;
        } else {
            result = number - 2;
        }

        System.out.println("Результат : " + result);
    }
}
