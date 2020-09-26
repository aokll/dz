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
       int y = scan.nextInt();

        String cycle = doCycle(y);
        System.out.print(cycle);

   }

   static String doCycle(int y) {
       while (true) {

           Random random = new Random();
           int x;

           x = random.nextInt(9);
           if (x != y) {
               if (x > y) System.out.print("Загаданноне число больше");
               else System.out.print("Загаданноне число меньше");
               System.out.println("\n");
               Scanner scan1 = new Scanner(System.in);
               int q = scan1.nextInt();
               if (q != x) {
                   if (x > y) System.out.print("Загаданноне число больше");
                   else System.out.print("Загаданноне число меньше");
                   System.out.println("\n");
                   Scanner scan2 = new Scanner(System.in);
                   int a = scan2.nextInt();
                   if (a != x) {
                       System.out.println("Ты проиграл");
                       Scanner scan3 = new Scanner(System.in);
                       System.out.println("Играть еще");
                       System.out.println("1 - да; 0 - нет");
                       int z = scan3.nextInt();
                       if (z == 1) { doCycle(y);
                       } else break;
                   } else System.out.println ("Ты угадал!");
                   Scanner scan4 = new Scanner(System.in);
                   System.out.println("Играть еще");
                   System.out.println("1 - да; 0 - нет");
                   int b = scan4.nextInt();
                   if (b == 1) { doCycle(y);
                   } else break;
               } else System.out.println ("Ты угадал!");
               Scanner scan5 = new Scanner(System.in);
               System.out.println("Играть еще");
               System.out.println("1 - да; 0 - нет");
               int c = scan5.nextInt();
               if (c == 1) { doCycle(y);
               } else break;
           } else System.out.println ("Ты угадал!");
           Scanner scan6 = new Scanner(System.in);
           System.out.println("Играть еще");
           System.out.println("1 - да; 0 - нет");
           int v = scan6.nextInt();
           if (v == 1) { doCycle(y);
           } else break;
       }
       return "КОНЕЦ ИГРЫ";
   }
}






