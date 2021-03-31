package by.lamaka.homework.book;

public class Task7 {
    /*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
    полностью закрыть круглой картонкой радиусом r.*/
    public static void main(String[] args) {
        double sizeA = 3.3;
        double sizeB = 5.1;
        double radius = 6;

        double diameter = radius * 2;

        double diagonal = Math.sqrt(Math.pow(sizeA, 2) + Math.pow(sizeB, 2));

        if (diameter > diagonal) {
            System.out.println("Прямоугольное отверстие " + sizeA + "x" + sizeB + " можно закрыть круглой картонкой " +
                    " радиусом " + radius);
        } else {
            System.out.println("Прямоугольное отверстие " + sizeA + "x" + sizeB + " нельзя закрыть круглой картонкой " +
                    " радиусом " + radius);
        }
    }
}
