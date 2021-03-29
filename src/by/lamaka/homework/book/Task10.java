package by.lamaka.homework.book;

public class Task10 {
    /*Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/
    public static void main(String[] args) {
        int number = 10;
        long fact;

        while (number <= 15) {
            fact = 1;
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println(number + "! = " + fact);
            number++;
        }
    }
}
