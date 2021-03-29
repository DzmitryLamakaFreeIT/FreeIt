package by.lamaka.homework.arrays.arrays1;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    /*3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
    массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
    это количество на экран на отдельной строке.*/
    public static void main(String[] args) {
        int[] array = new int[15];
        int countPosNumb = 0;

        initArray(array);

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0 && array[i]!=0){
                countPosNumb++;
            }
        }

        System.out.println("Кол-во четных элементов : " + countPosNumb);
    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
