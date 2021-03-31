package by.lamaka.homework.lesson2;

import java.util.Random;

public class Task7 {
    /*7)  В переменную записываете количество программистов.
    В зависимости от количества программистов необходимо вывести правильно окончание.
        Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.*/
    public static void main(String[] args) {
        Random random = new Random();

        int countOfProgrammer = random.nextInt(50);

        if(countOfProgrammer==1){
            System.out.println(countOfProgrammer+" программист");
        }else if(countOfProgrammer==2 || countOfProgrammer==3 || countOfProgrammer==4){
            System.out.println(countOfProgrammer+" программиста");
        }else{
            System.out.println(countOfProgrammer+" программистов");
        }

        int number = random.nextInt(1 - -9);
        System.out.println(1 - -9);
    }
}
