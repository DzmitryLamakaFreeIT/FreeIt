package by.lamaka.homework.arrays.arrays3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    /*4)Посчитать сумму четных элементов стоящих над побочной диагональю (невключительно)*/
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

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1 - i; j++) {
                if (array[i][j] % 2 == 0 && array[i][j] != 0) {
                    sumEvenElem += array[i][j];
                }
            }
        }
        System.out.println("Сумма элементов над побочной диагональю : " + sumEvenElem);

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
