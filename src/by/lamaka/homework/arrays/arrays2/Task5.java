package by.lamaka.homework.arrays.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    /*5) «Сожмите» массив, выбросив из него каждый второй элемент.
            «Освободившиеся» места массива заполните нулями.*/
    public static void main(String[] args) {
        int[] array = new int [15];
        initArray(array);

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i+=2) {
            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));

    }
    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51);
        }
    }
}
