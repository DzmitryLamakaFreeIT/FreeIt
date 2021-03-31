package by.lamaka.homework.arrays.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    /*8) Найти второй по величине (т.е. следующий по величине за максимальным)
    элемент в массиве.*/
    public static void main(String[] args) {
        int[] array = new int[20];
        int resultNumber;
        initArray(array);

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        resultNumber = array[array.length - 1];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == resultNumber) {
                continue;
            } else {
                resultNumber = array[i];
                break;
            }
        }
        System.out.println("Второе число по величине : " + resultNumber);

    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }
}
