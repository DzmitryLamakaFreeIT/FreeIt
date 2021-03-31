package by.lamaka.homework.arrays.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] field = createField(3);
        printField(field);
        String coordinate = "";
        boolean gameEnd = false;

        String namePlayer1;
        String signPlayer1;
        String namePlayer2;
        String signPlayer2;

        namePlayer1 = readByConsole("Пользователь №1 введите ваше имя..");
        namePlayer2 = readByConsole("Пользователь №2 введите ваше имя..");
        signPlayer1 = readByConsole(namePlayer1 + " введи X или 0");
        if (signPlayer1.equals("X")) {
            signPlayer2 = "0";
            System.out.println(namePlayer1 + " вы играете \"X\" ");
            System.out.println(namePlayer2 + " вы играете \"0\" ");
        } else {
            signPlayer2 = "X";
            System.out.println(namePlayer1 + " вы играете \"0\" ");
            System.out.println(namePlayer2 + " вы играете \"X\" ");
        }

        while (!gameEnd) {
            coordinate = readByConsole(namePlayer1 + " введите координаты хода через запятую от 0 до 2(Например : 0,2)");
            stepByPlayer(field,signPlayer1,coordinate);
            printField(field);
            gameEnd = checkForWin(field);
            if(gameEnd==true){
                System.out.println(namePlayer1+ " Победитель!!!");
                return;
            }
            coordinate = readByConsole(namePlayer2 + " введите координаты хода через запятую от 0 до 2(Например : 0,2)");
            stepByPlayer(field,signPlayer2,coordinate);
            printField(field);
            gameEnd = checkForWin(field);
            if(gameEnd==true){
                System.out.println(namePlayer2+ " Победитель!!!");
                return;
            }

        }


    }

    public static String[][] createField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = "-";
            }
        }
        return field;
    }

    public static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.printf("%3s", field[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static String readByConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        String result = null;
        System.out.println("***" + message + "***");
        result = scanner.nextLine();
        return result;
    }

    public static void stepByPlayer(String[][] field, String sign, String coordinate) {
        int coordinateA;
        int coordinateB;

        coordinateA = Integer.valueOf(coordinate.split(",")[0]);
        coordinateB = Integer.valueOf(coordinate.split(",")[1]);


        field[coordinateA][coordinateB] = sign;

    }

    public static boolean checkForWin(String[][] field) {
        if (field[0][0].equals("X") && field[0][1].equals("X") && field[0][2].equals("X")) {
            return true;
        } else if ((field[0][0].equals("0") && field[0][1].equals("0") && field[0][2].equals("0"))) {
            return true;
        } else if (field[0][0].equals("X") && field[1][0].equals("X") && field[2][0].equals("X")) {
            return true;
        } else if (field[0][0].equals("0") && field[1][0].equals("0") && field[2][0].equals("0")) {
            return true;
        } else if (field[2][0].equals("X") && field[2][1].equals("X") && field[2][2].equals("X")) {
            return true;
        } else if (field[2][0].equals("0") && field[2][1].equals("0") && field[2][2].equals("0")) {
            return true;
        } else if (field[0][2].equals("X") && field[1][2].equals("X") && field[2][2].equals("X")) {
            return true;
        } else if (field[0][2].equals("0") && field[1][2].equals("0") && field[2][2].equals("0")) {
            return true;
        } else if (field[0][0].equals("X") && field[1][1].equals("X") && field[2][2].equals("X")) {
            return true;
        } else if (field[0][0].equals("0") && field[1][1].equals("0") && field[2][2].equals("0")) {
            return true;
        }
        return false;
    }
}
