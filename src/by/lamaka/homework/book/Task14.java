package by.lamaka.homework.book;

import java.util.Arrays;
import java.util.Random;

public class Task14 {
    /*Создать массив оценок произвольной длины, вывести максимальную и
    минимальную оценку, её (их) номера.*/
    public static void main(String[] args) {
        int[] array = new int[15];
        initArray(array);

        int max = array[0];
        int indexMax = 0;

        int min = array[0];
        int indexMin = 0;

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            } else if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }

        System.out.println("Максимальное число = "+ max + " под индексом " + indexMax);
        System.out.println("Минимальное число = "+ min + " под индексом " + indexMin);

    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

}
