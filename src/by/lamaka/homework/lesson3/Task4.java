package by.lamaka.homework.lesson3;

public class Task4 {
    /*4)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.*/
    public static void main(String[] args) {
        int a = 16;
        int b = 16;

        int result = 0;

        for (int i = 0; i < b; i++) {
            result+=a;
        }

        System.out.println(a+" x "+ b+" = " +result);
    }
}
