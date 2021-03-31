package by.lamaka.homework.arrays.arrays1;

import java.util.Arrays;

public class Task2 {
    /*2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
    строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
    порядке (99 97 95 93 ... 7 5 3 1).*/
    public static void main(String[] args) {
        int[] array = new int[50];
        int startNumber = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = startNumber;
            startNumber += 2;
        }

        System.out.println(Arrays.toString(array));

        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
