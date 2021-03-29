package by.lamaka.homework.book;

import java.util.Scanner;

public class Task2 {
    /*Изменить данный пример так, что бы при запуске программы ваша программа
    выводила следующее: “Hello, <Ваше имя>!”.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.println("Введите ваше имя...");
        name = scanner.nextLine();
        System.out.println("“Hello, <" + name + ">!”");
        scanner.close();
    }
}
