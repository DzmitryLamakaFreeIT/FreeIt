package by.lamaka.homework.arrays.arrays3;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    /*5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
            строкой и т. д.)*/
    public static void main(String[] args) {
        int[][] array;
        int size = 0;
        int temp = 0;
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
            for (int j = 1 + i; j < array.length; j++) {
                temp = array[j][i];
                array[j][i] = array[i][j];
               array[i][j] = temp;
            }
        }
        System.out.println("*********************");
        printArray(array);

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
