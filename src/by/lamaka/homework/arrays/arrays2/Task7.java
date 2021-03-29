package by.lamaka.homework.arrays.arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    /*7) Подсчитать, сколько раз встречается элемент с заданным значением.*/
    public static void main(String[] args) {
        int[] array = new int[20];
        int number = 5;
        int counter = 0;

        initArray(array);
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Число " + number + " не встречается в данном массиве");
        } else {
            System.out.println("Число " + number + " в данном массиве, встречается " + counter + " раза");
        }

    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }
}
