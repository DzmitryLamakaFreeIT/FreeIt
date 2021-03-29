package by.lamaka.homework.arrays.arrays1;


import java.util.Arrays;
import java.util.Random;

public class Task5 {
    /*5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
    выведите массивы на экран в двух отдельных строках. Посчитайте среднее
    арифметическое элементов каждого массива и сообщите, для какого из
    массивов это значение оказалось больше (либо сообщите, что их средние
            арифметические равны).*/
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        initArray(array1);
        initArray(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        double arithMeanArr1 = arithMeanForArray(array1);
        double arithMeanArr2 = arithMeanForArray(array2);

        if (arithMeanArr1 == arithMeanArr2) {
            System.out.println("Среднее арифметическое двух массиов равны : " + arithMeanArr1);
        } else if (arithMeanArr1 > arithMeanArr2) {
            System.out.println("Среднее арифметическое первого массива " + arithMeanArr1 +
                    " больше, чем среднее арифметическое второго массива " + arithMeanArr2);
        } else {
            System.out.println("Среднее арифметическое второго массива " + arithMeanArr2 +
                    " больше, чем среднее арифметическое первого массива " + arithMeanArr1);
        }


    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
    }

    public static double arithMeanForArray(int[] array) {
        double sumElem = 0;
        double result;

        for (int i = 0; i < array.length; i++) {
            sumElem += array[i];
        }
        result = sumElem / array.length;

        return result;
    }
}
