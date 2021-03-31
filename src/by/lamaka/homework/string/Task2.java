package by.lamaka.homework.string;

public class Task2 {
    /* 2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
     позиции 0*/
    public static void main(String[] args) {
        String str = "Hello, world";

        char chr1 = str.charAt(3);
        char chr2 = str.charAt(0);

        String result = str.replace(chr1, chr2);

        System.out.println(result);
    }
}
