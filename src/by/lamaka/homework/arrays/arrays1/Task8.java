package by.lamaka.homework.arrays.arrays1;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    /*8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
    массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
    массива должен равняться отношению элемента из первого массива с i-ым
    индексом к элементу из второго массива с i-ым индексом. Вывести все три
    массива на экран (каждый на отдельной строке), затем вывести количество
    целых элементов в третьем массиве.*/
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] ratioByArrays = new double[10];
        int counter = 0;

        initArray(array1);
        initArray(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < ratioByArrays.length; i++) {
            if(array2[i]==0) {
                ratioByArrays[i] = 0;
                counter++;
            }else{
                ratioByArrays[i] = array1[i] / (double)array2[i];
                if(ratioByArrays[i]-(int)ratioByArrays[i]==0){
                    counter++;
                }
            }
        }

        System.out.println(Arrays.toString(ratioByArrays));
        System.out.println("Кол-во целых чисел : " + counter);
    }

    public static void initArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

}
