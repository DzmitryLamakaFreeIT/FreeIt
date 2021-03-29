package by.lamaka.homework.book;

import java.util.Arrays;
import java.util.Random;

public class Task16 {
    /*Определите сумму элементов одномерного массива, расположенных между
    минимальным и максимальным значениями.*/
    public static void main(String[] args) {
        int[] array = new int[10];
        initArray(array);
        int sumElem = 0;

        System.out.println(Arrays.toString(array));

        int max = array[0];
        int indexMax = 0;
        int min = array[0];
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
             if(array[i]>max){
                 max = array[i];
                 indexMax = i;
             }else if(array[i]<min){
                 min = array[i];
                 indexMin = i;
             }
        }
        if(indexMax-indexMin==1 || indexMin-indexMax==1) {
            System.out.println("Сумма элементов между числами " + array[indexMin] + " и " + array[indexMax]+" равна 0");
            return;
        }else if(indexMin>indexMax){
            for (int i = indexMax+1; i < indexMin; i++) {
                 sumElem+=array[i];
            }
        }else {
            for (int i = indexMin+1; i < indexMax; i++) {
                sumElem+=array[i];
            }
        }

        System.out.println("Сумма элементов между числами " + array[indexMin] + " и " + array[indexMax]+" равна " + sumElem);



    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
