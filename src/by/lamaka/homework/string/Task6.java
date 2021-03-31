package by.lamaka.homework.string;

public class Task6 {
    /*Имеется строка с текстом. Вывести текст, составленный из последних букв
    всех слов.*/
    public static void main(String[] args) {
        String str = "Имеется строка с текстом. Вывести текст," +
                " составленный из последних букв всех слов.";
        StringBuilder result = new StringBuilder();

        String[] words = str.split("\\s");

        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[a-zA-Zа-яА-Я]+[\\.,!\\?]")) {
                result.append(words[i].charAt(words[i].length() - 2));
                result.append(words[i].charAt(words[i].length() - 1));
            } else {
                result.append(words[i].charAt(words[i].length() - 1));
            }
        }

        System.out.println(result);
    }
}
