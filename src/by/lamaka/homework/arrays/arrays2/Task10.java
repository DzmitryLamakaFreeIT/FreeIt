package by.lamaka.homework.arrays.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    /*10) Найти максимальный элемент в массиве и поменять его местами с нулевым
            элементом*/
    public static void main(String[] args) {
        int[] array = new int[20];
        initArray(array);
        int maxElem = array[0];
        int indexMaxElem = 0;
        int temp = 0;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElem) {
                maxElem = array[i];
                indexMaxElem = i;
            }
        }

        System.out.println("Максимальный элемент : " + maxElem);

        temp = array[indexMaxElem];
        array[indexMaxElem] = array[0];
        array[0] = temp;

        System.out.println("Массив после замены : \n" + Arrays.toString(array));

    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
    }
}
