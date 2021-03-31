package by.lamaka.homework.arrays.arrays3;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    /*3)Проверить произведение элементов какой диагонали больше.*/
    public static void main(String[] args) {
        int[][] array;
        int size = 0;
        long multFirstDiag = 1;
        long multSecondDiag = 1;
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
            multFirstDiag *= array[i][i];
        }
        System.out.println();
        for (int i = 0, j = array[i].length - 1; i < array.length; i++, j--) {
            multSecondDiag *= array[i][j];
        }

        if(multFirstDiag==multSecondDiag){
            System.out.println("Произведение элементов матрицы равны " +multFirstDiag);
        }else if(multFirstDiag> multSecondDiag){
            System.out.println("Произведение элементов главной диагонали матрицы " +multFirstDiag
                    + " больше, чем произведение элементов побочной диагонали матрицы " + multSecondDiag);
        }else {
            System.out.println("Произведение элементов побочной диагоналиматрицы " +multSecondDiag
                    + " больше, чем произведение элементов главной диагонали матрицы " + multFirstDiag);
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
