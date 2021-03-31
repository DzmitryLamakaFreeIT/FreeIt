package by.lamaka.homework.book;

import java.util.Random;

public class Task8 {
    /*Имеется целое число (задать с помощью Random rand = new Random(); int x =
    rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
    нему слово «рублей» в правильном падеже.*/
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        if (number % 10 == 1) {
            System.out.println(number + " рубль");
        } else if (number % 10 == 2 || number % 10 == 3 || number % 10 == 4) {
            System.out.println(number + " рубля");
        } else {
            System.out.println(number + " рублей");
        }

    }
}
