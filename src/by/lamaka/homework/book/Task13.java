package by.lamaka.homework.book;

import java.util.Arrays;
import java.util.Random;

public class Task13 {
    /*Создать последовательность случайных чисел, найти и вывести наибольшее
    из них.*/
    public static void main(String[] args) {
        int[] array = new int[10];
        initArray(array);
        int max = array[0];

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Максимальное число " + max);


    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
    }
}
