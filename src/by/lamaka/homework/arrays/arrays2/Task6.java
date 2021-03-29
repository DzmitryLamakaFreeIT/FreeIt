package by.lamaka.homework.arrays.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    /*6) Проверить, различны ли все элементы массива.*/
    public static void main(String[] args) {
        int[] array = new int[10];
        initArray(array);
        int startPos = 0;
        boolean isOk = true;

        System.out.println(Arrays.toString(array));
        while (isOk) {
            for (int i = 1; i < array.length; i++) {
                if (startPos == i) {
                    continue;
                }
                if (array[startPos] == array[i]) {
                    System.out.println("Все элементы массива не различны");
                    return;
                }
            }
            startPos++;
            if (startPos == array.length) {
                System.out.println("Все элементы массива различны");
                isOk = false;
            }
        }
    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
    }
}
