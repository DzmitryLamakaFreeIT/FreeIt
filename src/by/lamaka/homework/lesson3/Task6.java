package by.lamaka.homework.lesson3;

public class Task6 {
    /*6)Напишите программу вывода всех четных чисел от 2 до 100 включительно*/
    public static void main(String[] args) {
        int startIndex = 2;
        int endIndex = 100;

        for (int i = startIndex; i <= endIndex; i=i+2) {
            System.out.print(i+" ");
        }
    }
}
