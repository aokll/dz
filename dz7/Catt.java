package ru.geekbrains.lesson_geekbrains;

public class Catt {
    private String name;
    private int appetite;
    private boolean satiety;
    private int limit;
    private int app;

    public Catt (String name, int appetite,boolean satiety,int limit){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        this.limit = limit;
    }
    public void eat(Plate p){
        p.decreaseFood(appetite);
        System.out.println("cat satiety " + name + " " + satiety);
        app = app + appetite;
        if (app >= limit){
            satiety = true;
        }
        p.littleFood(limit);
}
    public boolean getSatiety(){
        return satiety;
    }


        }




