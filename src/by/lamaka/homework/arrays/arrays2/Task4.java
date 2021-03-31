package by.lamaka.homework.arrays.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    /*4) Найти наименьший нечетный элемент.*/
    public static void main(String[] args) {
        int[] array = new int[10];
        initArray(array);
        int minOddElem = 99;

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                continue;
            } else {
                if (array[i] < minOddElem && array[i] != 0) {
                    minOddElem = array[i];
                }
            }
        }
        if (minOddElem == 99) {
            System.out.println("В данном массиве нечетных элементов нет");
        } else {
            System.out.println("Наименьший нечетный элемент : " + minOddElem);
        }
    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
    }
}
