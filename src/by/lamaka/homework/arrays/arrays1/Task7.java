package by.lamaka.homework.arrays.arrays1;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    /*7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
    какой элемент является в этом массиве максимальным и сообщите индекс его
    последнего вхождения в массив.*/
    public static void main(String[] args) {
        int[] array = new int[12];
        initArray(array);
        int maxElem = array[0];
        int index = 0;

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= maxElem) {
                maxElem = array[i];
                index = i;
            }
        }

        System.out.println("Максимальный элемент : " + maxElem + " Индекс последнего вхождения : " + index);



    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
    }
}
