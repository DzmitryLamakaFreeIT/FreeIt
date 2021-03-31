package by.lamaka.homework.lesson3;

public class Task5 {
   /* 5)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
    для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/
   public static void main(String[] args) {
       double cm = 2.54;
       double result = 0;

       for (int i = 1; i < 21 ; i++) {
           result = i*cm;
           System.out.println(i +" in. = " + result+"cm");
       }
   }
}
