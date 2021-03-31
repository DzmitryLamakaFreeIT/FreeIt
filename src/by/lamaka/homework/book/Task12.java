package by.lamaka.homework.book;

import java.util.Random;

public class Task12 {
    /*Найдите сумму первых n целых чисел, которые делятся на 3.*/
    public static void main(String[] args) {
        Random random = new Random();

        int countOfNumbers = 4;
        int sum = 0;
        int number;
        int count = 0;

        System.out.print("Все числа : ");

        while (count < countOfNumbers) {
            number = random.nextInt(50);
            System.out.print(number + " ");
            if (number % 3 == 0 && number !=0) {
                sum += number;
                count++;
            }
        }

        System.out.println("\nСумма первых " + countOfNumbers + " чисел, которые делятся на 3 = " + sum);
    }
}
