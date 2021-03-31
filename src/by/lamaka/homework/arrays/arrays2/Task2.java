package by.lamaka.homework.arrays.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    /*2) Найти среднее арифметическое элементов с нечетными номерами.*/
    public static void main(String[] args) {
        int[] array = new int[10];
        int sumElemArray = 0;
        int countElemWithNegIndex = 0;
        double arithMean = 0;
        initArray(array);

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i += 2) {
            sumElemArray += array[i];
            countElemWithNegIndex++;
        }

        arithMean = sumElemArray / (double) countElemWithNegIndex;

        System.out.println("среднее арифметическое элементов с нечетными номерами = " + arithMean);

    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
    }
}
