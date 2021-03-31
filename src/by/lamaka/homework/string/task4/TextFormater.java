package by.lamaka.homework.string.task4;

public class TextFormater {
    /*Создаём класс TextFormater
    в котором два статических метода:
            1. Метод принимает строку и возвращает кол-во слов в строке.
            2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
    есть возвращает true, если нет false*/

    public static int getNumberOfWords(String str) {
        int result = 0;

        result = str.split("[\\-\\s,:]\\s*").length;

        return result;
    }

    public static boolean checkStringForPalindromes(String str) {
        boolean result = false;
        String[] words = str.split("\\s*[\\-\\s,:]\\s*");
        String reverseWord;

        for (int i = 0; i < words.length; i++) {
            reverseWord = reverseString(words[i]);
            if (words[i].equalsIgnoreCase(reverseWord) && words[i].length() > 1) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
