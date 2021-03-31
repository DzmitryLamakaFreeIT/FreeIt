package by.lamaka.homework.arrays.arrays1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    /*10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
    переменную n. Если пользователь ввёл не подходящее число, то программа
    должна выдать соответствующее сообщение. Создать массив из n случайных
    целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
    только из чётных элементов первого массива, если они там есть, и вывести его
    на экран.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;
        int[] arrayPosNumb;
        int counterPosNumb = 0;
        int[] temp;
        int n;

        System.out.println("Введите число больше 3");

        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели текст");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n <= 3) {
                System.out.println("Вы ввели число меньше или равно 3");
            }
        }
        while (n <= 3);

        array = new int[n];
        initArray(array, n);
        temp = new int[array.length];//Массив temp для того, что бы не ходить еще раз циклом for по всему массиву

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                temp[counterPosNumb] = array[i];
                counterPosNumb++;
            }
        }
        if (counterPosNumb==0) {
            System.out.println("В данном массиве нет четных чисел");
        } else {
            arrayPosNumb = Arrays.copyOf(temp, counterPosNumb);
            System.out.println(Arrays.toString(arrayPosNumb));
        }


    }

    public static void initArray(int[] array, int n) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n + 1);
        }
    }
}
