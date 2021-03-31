package by.lamaka.homework.lesson3;

public class Task7 {
    /*7)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99*/
    public static void main(String[] args) {
        int startIndex = 1;
        int endIndex = 99;

        int sumNegNumbs = 0;

        for (int i = startIndex; i < endIndex; i+=2) {
            sumNegNumbs+=i;
        }

        System.out.println("Сумма нечетных чисел от " + startIndex+" до "+ endIndex+" = " + sumNegNumbs);
    }
}
