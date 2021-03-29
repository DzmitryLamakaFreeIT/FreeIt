package by.lamaka.homework.book;

import java.util.Random;

public class Task9 {
    /*Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
    произведение, т.е. факториал числа.*/
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        int count = 1;
        long fact = 1;

        if (number == 0 || number == 1) {
            System.out.println(number + "! = 1");
            return;
        }
        while (count <= number) {
            fact = fact * count;
            count++;
        }
        System.out.println(number + "! = " + fact);
    }
}
