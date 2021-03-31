package by.lamaka.homework.string.task4;

import java.io.*;

public class Main {
    /*4)Текстовый файл содержит текст. После запуска программы в другой файл
    должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
    предложении присутствует слово-палиндром, то не имеет значения какое кол-во
    слов в предложении, оно попадает в новый файл.*/
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        StringBuilder stringBuilder = new StringBuilder();
        String[] partOfText;
        int countForWords = 0;

        try {
            reader = new BufferedReader(new FileReader("resources/task4.txt"));
            writer = new BufferedWriter(new FileWriter("resources/resultTask4.txt", true));

            while (reader.ready()) {
                stringBuilder.append(reader.readLine() + " ");

            }
            partOfText = stringBuilder.toString().split("[!?\\.]\\s*");

            for (int i = 0; i < partOfText.length; i++) {
                countForWords = TextFormater.getNumberOfWords(partOfText[i]);

                if (TextFormater.checkStringForPalindromes(partOfText[i])) {
                    writer.write(partOfText[i] + ". ");
                    writer.flush();
                    continue;
                } else if (countForWords > 2 && countForWords < 6) {
                    writer.write(partOfText[i] + ". ");
                    writer.flush();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e);
        } catch (IOException e) {
            System.out.println("IOException " + e);
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                System.out.println("IOException " + e);
            } catch (NullPointerException e) {
                System.out.println("NullPointerException " + e);
            }
        }
    }
}
