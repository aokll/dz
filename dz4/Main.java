package ru.geekbrains.lesson_geekbrains;

import java.util.Random;
import java.util.Scanner;

/*1. Полностью разобраться с кодом, попробовать переписать с нуля,
стараясь не подглядывать в методичку;
  2. Доработать проверку побегу по диагоналям.
  3. * Попробовать переписать программу так, чтобы она работала с
       разным равномерным размером полей. При этом пользователю предоставляется
       возможность задать размер поля. Например, 5х5, 10х10 и так далее. 4х3 считает недопустимым.
  4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] field = getField();
        do {
            doPlayer(scanner, field);
            if (checkWinHorizontalVerticalDiagonal(field, 'X')) {
                System.out.print("YOU WIN");
                break;
            }
            doIMove(random, field);
            if (checkWinHorizontalVerticalDiagonal (field, 'O')) {
                System.out.print("COMPUTER WIN");
                break;
            }
            drawField(field);
        }
        while(true);}


    static boolean checkWinHorizontalVerticalDiagonal(char[][] field, char sign){
        for (int i = 0; i < field.length; i++) {
            if(field[i][0] == sign && field[i][1] == sign && field[i][2] == sign){
                return true;
            }
        else if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
                return true;
            } }
        if(field[0][0] == sign && field[1][1] == sign && field[2][2] == sign){
            return true;}
        else if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
            return true;
        }

        return false;}


    static boolean isDrow(char[][] field){
        int count = field.length * field.length;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != '-')
                count--;
            }
        }return count == 0;
    }
    static void doIMove(Random random, char[][] field) {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }while(field[x][y] != '-');
        field[x][y] = 'O';
    }
    static void doPlayer(Scanner scanner, char[][] field){
        int x,y;
        do {
            x = doPlayerMove(scanner, 'X');
            y = doPlayerMove(scanner, 'Y');
        }while(field[x][y] != '-');
        field[x][y] = 'X';
    }
    static int doPlayerMove(Scanner scanner, char cordName) {
        int cord;
        do {
            System.out.println(String.format("Please input %s",cordName));
            cord = scanner.nextInt() - 1;
        } while (cord < 0 || cord > 2);
        return cord;
    }
            static void drawField(char[][] field){
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }
        }
        static char[][] getField(){
               return new char[][]{
                        {'-','-','-'},
                        {'-','-','-'},
                        {'-','-','-'}
                };
    }
        }



