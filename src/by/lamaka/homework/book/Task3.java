package by.lamaka.homework.book;

import java.util.Arrays;

public class Task3 {
    /*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
    А) минут + секунд,
    В) часов + минут + секунд,
    С) дней + часов + минут + секунд,
    D) недель + дней + часов + минут + секунд.
    по аналогии с примером выше.*/
    public static void main(String[] args) {
        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int w = (d - day) / 7;
        System.out.println(min + " мин " + sec + " сек");
        System.out.println(hour + " ч " + min + " мин " + sec + " сек");
        System.out.println(day + " дн " + hour + " час " + min + " мин " + sec + " сек");
        System.out.println(w + " нед " + day + " дн " + hour + " ч " + min + " мин " + sec + " сек");
    }
}
