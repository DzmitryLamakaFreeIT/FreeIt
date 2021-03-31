package by.lamaka.homework.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    /*1) Найти в строке не только запятые, но и другие знаки препинания.
    Подсчитать общее их количество.*/
    public static void main(String[] args) {
        int count = 0;
        String str = "Привет. Как дела? У меня все хорошо, а ты как?";

        Pattern pattern = Pattern.compile("[,\\.!?]");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            count++;
        }

        System.out.println(count);
    }
}
