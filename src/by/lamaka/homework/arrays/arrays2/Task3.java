package by.lamaka.homework.arrays.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    /*3) Найти средне арифметическое элементов массива, превосходящих некоторое
    число С.*/
    public static void main(String[] args) {
        int c = 10;
        double arithMean = 0;
        int sumElemMoreC = 0;
        int countNumbsMoreC = 0;

        int[] array = new int[10];
        initArray(array);

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                sumElemMoreC += array[i];
                countNumbsMoreC++;
            }
        }

        arithMean = sumElemMoreC / (double) countNumbsMoreC;

        System.out.println("Среднее арифметическое чисел больше " + c + " = " + arithMean);


    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
    }
}
