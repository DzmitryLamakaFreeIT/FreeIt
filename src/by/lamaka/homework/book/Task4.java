package by.lamaka.homework.book;

public class Task4 {
    /*Определить число, полученное выписыванием в обратном порядке цифр
    любого 4-х значного натурального числа n.*/
    public static void main(String[] args) {
        int result;
        int number = 6708;

        int a1 = (number % 10);
        int a2 =(number / 10) %10;
        int a3 = (number /100) %10;
        int a4 = number/1000;

        result = (a1*1000) + (a2*100) + (a3*10) + a4;
        System.out.println("result  = " +result);



    }
}
