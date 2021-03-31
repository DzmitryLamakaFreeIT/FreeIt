package by.lamaka.homework.book;

import java.util.Random;

public class Task11 {
    /*Имеется целое число, определить является ли это число простым, т.е.
    делится без остатка только на 1 и себя.*/
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(50);
        int count = 0;

        if(number!=2 && number%2==0){
            System.out.println(number + " не является простым ");
            return;
        }

        for (int i = 1; i <= number ; i++) {
            if(number%i==0){
                count++;
            }
            if(count>2){
                System.out.println(number + " не является простым ");
                return;
            }
        }
        System.out.println(number + " является простым");
    }
}
