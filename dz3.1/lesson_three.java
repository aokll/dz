package ru.geekbrains.lesson_geekbrains;
/*Делать только одну задачу
1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю
дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить
больше ли указанное пользователем число чем загаданное, или меньше. После победы
или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot",
"avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
"mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы*/

import java.util.Random;
import java.util.Scanner;

public class lesson_three {
   public static void main(String[] args){

       Scanner scan = new Scanner(System.in);

       System.out.println("Я хочу поиграть с тобой в одну игру");
       System.out.println("Угадай число");
       System.out.println("Введи число от 0 до 9");

       do {
           String to = doCycle(scan);
           System.out.print(to);
           break;
       } while (true);
}
static String doCycle(Scanner scan) {
    Random ran = new Random();
    int x = ran.nextInt(9);

    int y = scan.nextInt();
    if (y != x) {
            if (y < x) System.out.print("Загаданное число больше ");
            else System.out.print("Загаданное число меньше ");
        int u = scan.nextInt();
        if (u != x) {
                if (u < x) System.out.print("Загаданное число больше ");
                else System.out.print("Загаданное число меньше ");
            int i = scan.nextInt();
            if (i != x) {
                System.out.println("Вы не угадали");
                System.out.println("Сыграем еще раз 1 - да; 0 - нет ");
                int b = scan.nextInt();
                    if (b == 1){
                        System.out.print("Введите число ");
                        doCycle(scan);
                    }
                else System.out.print("Конец игры");
                return " ";

            }else
                System.out.println("Мои поздравления, вы угадали!!");
                System.out.println("Сыграем еще раз 1 - да; 0 - нет ");
                int m = scan.nextInt();
                    if (m == 1){
                        System.out.print("Введите число ");
                        doCycle(scan);
                    }
                else System.out.print("Конец игры");
                return " ";// (" ") с этим я просто не знаю что делать?
        }else
            System.out.println("Мои поздравления, вы угадали!!");
            System.out.println("Сыграем еще раз 1 - да; 0 - нет ");
            int n = scan.nextInt();
                if (n == 1){
                    System.out.print("Введите число ");
                    doCycle(scan);
                }
            else System.out.print("Конец игры");
            return " ";
    }else
        System.out.println("Мои поздравления, вы угадали!!");
        System.out.println("Сыграем еще раз 1 - да; 0 - нет ");
        int l = scan.nextInt();
            if (l == 1){
                System.out.print("Введите число ");
                doCycle(scan);
                }
        else System.out.print("Конец игры");
        return " ";
}
}






