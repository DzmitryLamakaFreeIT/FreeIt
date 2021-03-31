package by.lamaka.homework.lesson2;

import java.util.Random;

public class Task1 {
    /*1)В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    Например, "это однозначное положительное число". Достаточно будет определить, является ли число однозначным, двузначным или трехзначным и более.*/
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000) - 500;
        int counter = 0;
        int temp = number;

        while (temp != 0) {
            temp = temp / 10;
            counter++;
        }

        if (number > 0) {
            System.out.println("Число " + number + " положиетльное и " + counter + "-значное");
        } else if (number == 0) {
            System.out.println("Число " + number + " равно нулю и " + counter + "-значное");
        } else {
            System.out.println("Число " + number + " отрицательное и " + counter + "-значное");
        }


    }
}
