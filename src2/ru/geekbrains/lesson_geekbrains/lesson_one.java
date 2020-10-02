package ru.geekbrains.lesson_geekbrains;

public class lesson_one {
    public static void main(String[] args) {
        int a = 2999999;
        String g = "ссылочный тип";
        double f = 2.0943;
        char sd = 'h';
        float s = 5.7f;
        boolean p = true;
        long l = -93939393;
        short sh = 2000;
        byte b = -128;

        int j = primer(2,2,2,2);
        System.out.println(j);

        boolean summ = two(64,5);
        System.out.println(summ);

        String otr = h(3);
        System.out.println(otr);

        boolean lean = bool(2);
        System.out.println(lean);

        String em = name("Влад");
        System.out.println(em);

        String year = leap(1458);
        System.out.println("Этот год является " + year);
    }
static String name(String st){
        return "Привет! "+ st;
}
static boolean bool(int i){
        if(i<0) return true;
        else return false;
}
static String h(int m){
        if (m >= 0) return "положительное число";
        else return "отрицательное число";
    }
static boolean two(int q, int w){
        int qw = q+w;
        if (qw <= 20 && qw > 10) {
            return true;}
         else return false;
}

static int primer(int a,int b,int c,int d){
       return a*(b+(c/d));
}
static String leap(int x){
       if (x % 400 == 0){
           return "високосным";}
   else if (x % 100 == 0){
       return "невисокосным";}
   else if (x % 4 == 0){
       return "високосным";
       }
   else return "невисокосным";
}}
