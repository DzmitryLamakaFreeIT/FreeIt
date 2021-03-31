package by.lamaka.homework.arrays.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    /*9) Найти наименьший элемент среди элементов с четными индексами массива*/
    public static void main(String[] args) {
        int[] array = new int[15];
        int minEvenNumb = 99;
        initArray(array);

        System.out.println(Arrays.toString(array));

        for (int i = 2; i < array.length; i += 2) {
            if (array[i] < minEvenNumb) {
                minEvenNumb = array[i];
            }
        }

        System.out.println("Минимальный четный элемент с четными индексами массива : " + minEvenNumb);

    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
    }
}
