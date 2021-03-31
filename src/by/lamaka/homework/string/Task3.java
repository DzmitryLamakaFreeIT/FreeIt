package by.lamaka.homework.string;

import java.io.*;

public class Task3 {
    /* 3)В исходном файле находятся слова, каждое слово на новой стороке. После
     запуска программы должен создать файл, который будет содержать в себе
     только полиндромы*/
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String nextLine = "";
        try {
            reader = new BufferedReader(new FileReader("resources/task1.txt"));
            writer = new BufferedWriter(new FileWriter("resources/resultTask1.txt", true));
            while (reader.ready()) {
                nextLine = reader.readLine();
                if (nextLine.equals(reverseString(nextLine))) {
                    writer.write(nextLine);
                    writer.flush();
                    writer.newLine();

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

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
