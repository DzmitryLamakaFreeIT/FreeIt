package by.lamaka.homework.arrays.arrays1;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    /*6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
    на экран в строку. Определить и вывести на экран сообщение о том, является ли
    массив строго возрастающей последовательностью.*/
    public static void main(String[] args) {
        int[] array = new int[4];
        initArray(array);

        System.out.println(Arrays.toString(array));

        if (checkArrayBySequence(array)) {
            System.out.println("Данный массив, является строго возрастающей последовательностью ");
        }else{
            System.out.println("Данный массив, не является строго возрастающей последовательностью ");
        }

    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
    }

    public static boolean checkArrayBySequence(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) {
                return false;
            }
        }
        return true;
    }
}
