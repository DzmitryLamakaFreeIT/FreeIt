package by.lamaka.homework.lesson2;

import java.util.Random;

public class Task4 {
    /*4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.*/
    public static void main(String[] args) {
        Random random = new Random();
        int countPosNumb = 0;

        int a = random.nextInt(50) - 25;
        int b = random.nextInt(50) - 25;
        int c = random.nextInt(50) - 25;

        if (a > 0) {
            countPosNumb++;
        }
        if (b > 0) {
            countPosNumb++;
        }
        if (c > 0) {
            countPosNumb++;
        }

        if (countPosNumb == 0) {
            System.out.println("В наборе чисел (" + a + " , " + b + " , " + c + ") нет положительных чисел");
        } else {
            System.out.println("В наборе чисел (" + a + " , " + b + " , " + c + ") кол-во  положительных чисел : " + countPosNumb);
        }

    }
}
