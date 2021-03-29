package by.lamaka.homework.lesson3;

public class Task3 {
    /*3)Вычислить: 1+2+4+8+...+256*/
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 256; i = i * 2) {
            result += i;
        }

        System.out.println("Результат = " + result);
    }
}
