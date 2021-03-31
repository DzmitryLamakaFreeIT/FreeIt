package by.lamaka.homework.book;

import java.util.Arrays;

public class Task17 {
    /*Создать двухмерный квадратный массив, и заполнить его «бабочкой».*/
    public static void main(String[] args) {
        int sizeA = 6;
        int sizeB = 6;


        int[][] butterfly = new int[sizeA][sizeB];

        if (sizeA != sizeB) {
            System.out.println("Массив не квадратный!!!");
            return;
        }

        int startPos = 0;
        int endPos = butterfly.length;
        int midPos = butterfly.length / 2;


        for (int i = 0; i < butterfly.length; i++) {
            if(startPos==endPos){
                startPos--;
                endPos++;
            }
            for (int j = startPos; j < endPos; j++) {
                butterfly[i][j] = 1;
            }
            if (i > midPos || i == midPos) {
                startPos--;
                endPos++;
            } else {
                startPos++;
                endPos--;
            }
        }


        for (int i = 0; i < butterfly.length; i++) {
            System.out.println(Arrays.toString(butterfly[i]));
        }
    }
}
