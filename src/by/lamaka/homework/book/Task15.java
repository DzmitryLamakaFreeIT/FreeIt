package by.lamaka.homework.book;

import java.util.Arrays;
import java.util.Random;

public class Task15 {
    /*Создать массив, заполнить его случайными элементами, распечатать,
    перевернуть, и снова распечатать (при переворачивании нежелательно создавать
            еще один массив).*/
    public static void main(String[] args) {
        int[] array = new int[10];
        initArray(array);
        int numbOfReplace = array.length / 2;
        int temp = 0;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < numbOfReplace; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));

    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
