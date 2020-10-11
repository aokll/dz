package ru.geekbrains.lesson_geekbrains;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }
    public void info(){
        System.out.println("plate " + food);
    }
    public void decreaseFood(int n){
        food -= n;
        if (food <= 0){food = 0;}
        }
        public void littleFood(int y){
         if (food < y){
             System.out.println("КОТУ МАЛО ЕДЫ");
         }
        }
        public void additive(){
            Scanner scan = new Scanner(System.in);
            food = (food + 10) + scan.nextInt();
        }

        }




