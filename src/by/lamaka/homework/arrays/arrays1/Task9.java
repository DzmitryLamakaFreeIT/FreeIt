package by.lamaka.homework.arrays.arrays1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    /*9)Пользователь должен указать с клавиатуры положительное число, а
    программа должна создать массив указанного размера из случайных целых
    чисел из [0;15] и вывести его на экран в строку. После этого программа должна
    определить и сообщить пользователю о том, сумма какой половины массива
    больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
    пользователь введёт неподходящее число, то выдать соответствующее
    сообщение*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength;
        int[] array;
        int midPos;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        System.out.println("Введите число от 2 и более...");

        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели текст");
                scanner.next();
            }
            arrayLength = scanner.nextInt();
            if (arrayLength < 2) {
                System.out.println("Вы ввели число меньше 2");
            }
        }
        while (arrayLength < 2);

        array = new int[arrayLength];
        initArray(array);
        System.out.println(Arrays.toString(array));
        midPos = arrayLength / 2;

        for (int i = 0; i < midPos; i++) {
            sumFirstHalf += array[i];
        }

        for (int i = midPos; i < arrayLength; i++) {
            sumSecondHalf += array[i];
        }

        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Сумма первого подмассива " + sumFirstHalf + " равна сумме второго подмассива " + sumSecondHalf);
        } else if (sumFirstHalf > sumSecondHalf) {
            System.out.println("Сумма первого подмассива " + sumFirstHalf + " больше, чем сумма второго подмассива " + sumSecondHalf);
        } else {
            System.out.println("Сумма второго подмассива " + sumSecondHalf + " больше, чем сумма первого подмассива " + sumFirstHalf);
        }

    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
    }
}
