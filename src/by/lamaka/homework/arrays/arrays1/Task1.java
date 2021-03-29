package by.lamaka.homework.arrays.arrays1;

public class Task1 {
    /*1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
    массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
    затем в столбик (отделяя один элемент от другого началом новой строки). Перед
    созданием массива подумайте, какого он будет размера.*/
    public static void main(String[] args) {
        int[] array = new int[10];
        int startNumb = 2;

        for (int i = 0; i < array.length; i++) {
            array[i] = startNumb;
            System.out.print(array[i] + " ");
            startNumb += 2;
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
