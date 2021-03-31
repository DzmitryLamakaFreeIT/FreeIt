package by.lamaka.homework.book;

import java.util.Random;

public class Task6 {
    /*Создайте число. Определите, является ли число трехзначным. Определите, является
    ли его последняя цифра семеркой. Определите, является ли число четным.*/
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000);

        if(number>99 && number<1000){
            System.out.println("Число " + number + " является трехзнычным");
        }else{
            System.out.println("Число " + number + " не является трехзнычным");
        }

        if(number%10==7){
            System.out.println("Последней цифрой числа " + number + " является 7");
        }else {
            System.out.println("Последней цифрой числа " + number + " не является 7");
        }

        if(number!=0 && number%2==0){
            System.out.println("Число "+ number+ " является четным");
        }else{
            System.out.println("Число "+ number+ " является нечетным");
        }

    }
}
