package by.lamaka.homework.arrays.arrays3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    /* Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
     случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
      матрицы). Почитать сумму четных элементов стоящих на главной диагонали.*/
    public static void main(String[] args) {
        int[][] array;
        int size = 0;
        int sumEvenElem = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер квадратной матрицы...");
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели текст");
                scanner.next();
            }
            size = scanner.nextInt();
            if (size < 1) {
                System.out.println("Размер не может быть меньше 1");
            }
        }
        while (size < 1);

        array = createMultiArray(size);
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i][i] % 2 == 0 && array[i][i] != 0) {
                sumEvenElem += array[i][i];
            }
        }
        if (sumEvenElem != 0) {
            System.out.println("Cумма четных элементов стоящих на главной диагонали " + sumEvenElem);
        } else {
            System.out.println("На главной диагонали нет четных элементов");
        }

    }

    public static int[][] createMultiArray(int size) {
        Random random = new Random();
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
