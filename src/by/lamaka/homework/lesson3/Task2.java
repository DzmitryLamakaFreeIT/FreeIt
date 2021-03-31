package by.lamaka.homework.lesson3;

public class Task2 {
    /*2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
            Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/
    public static void main(String[] args) {
        int countOfCells = 2;
        int result = countOfCells;

        for (int i = 3; i <= 24 ; i=i+3) {
            result= result*2;
            System.out.println("Через " + i +" ч. ко-во клеток : " + result);
        }
    }
}
