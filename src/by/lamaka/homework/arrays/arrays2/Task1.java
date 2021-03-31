package by.lamaka.homework.arrays.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    /*1) Найти произведение элементов, кратных 3.*/
    public static void main(String[] args) {
        int[] array = new int[10];
        initArray(array);

        System.out.println(Arrays.toString(array));

        int multiplyNumb = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] != 0) {
                multiplyNumb *= array[i];
            }
        }
        if (multiplyNumb == 1) {
            System.out.println("В данном массиве нет элементов кратных 3");
        } else {
            System.out.println("Произведение элементов кратным 3 = " + multiplyNumb);
        }


    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
    }
}
