package by.lamaka.homework.book;


public class Task5 {
    /*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
    различны?*/
    public static void main(String[] args) {
        int number = 1034;

        int a1 = number / 1000;
        int a2 = (number%1000)/ 100;
        int a3 = (number%100) / 10;
        int a4 = number % 10;


        if (a1 == a2 || a1 == a3 || a1 == a4) {
            System.out.println("В числе " + number + " есть одинаковые цифры");
        }else if (a2 == a3 || a2 == a4 || a3==a4) {
            System.out.println("В числе " + number + " есть одинаковые цифры");
        }else{
            System.out.println("В числе " + number + " все числа различны");
        }

    }
}
