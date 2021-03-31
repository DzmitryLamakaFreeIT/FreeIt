package by.lamaka.homework.string;

public class Task1 {
    /*1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
    последнего вхождения сивола(B).*/
    public static void main(String[] args) {
        String str = "Hello, java";

        int a = str.indexOf("l");
        int b = str.lastIndexOf("v");

        String result = str.substring(0, a) + str.substring(b);
        System.out.println(result);
    }
}
