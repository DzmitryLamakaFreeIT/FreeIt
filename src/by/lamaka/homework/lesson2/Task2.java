package by.lamaka.homework.lesson2;

import java.util.Random;

public class Task2 {
    /*2) Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
    Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
    Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
    Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.*/
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);

        if (a + b < c || a + c < b || c + b < a) {
            System.out.println("Треугольник со сторонами " + a + " " + b + " " + c + " не существует");
        } else {
            System.out.println("Треугольник со сторонами " + a + " " + b + " " + c + " существует");
        }
    }
}
