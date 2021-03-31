package by.lamaka.homework.arrays.arrays1;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    /*4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
    массив на экран в строку. Замените каждый элемент с нечётным индексом на
    ноль. Снова выведете массив на экран на отдельной строке.*/
    public static void main(String[] args) {
        int[] array = new int[20];
        initArray(array);

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));

    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
    }
}
