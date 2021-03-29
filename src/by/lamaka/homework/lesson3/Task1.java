package by.lamaka.homework.lesson3;

public class Task1 {
    /*1)Начав тренировки, спортсмен в первый день пробежал 10 км.
    Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
    Какой суммарный путь пробежит спортсмен за 7 дней?*/
    public static void main(String[] args) {
        double kmPerDay = 10;
        double result = kmPerDay;

        for (int i = 1; i < 7; i++) {
            kmPerDay = kmPerDay + (kmPerDay * 0.1);
            result = result + kmPerDay;
        }

        System.out.println("За 7 дней спортсмен пробегает " + result + " км");
    }
}
