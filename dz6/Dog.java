package ru.geekbrains.lesson_geekbrains;

public class Dog extends Animals{

    public Dog (String name){
        super(name);
    }
    @Override
    public boolean runAway(int runningDistance, int ranningLimit){
        if (runningDistance <= ranningLimit){
            return true;
        }
        else return false;
    }
    @Override
    public boolean sail(int swimmingDistance,int swimmingLimit){
        if (swimmingDistance <= swimmingLimit){
            return true;
        }
        else return false;
    }

    @Override
    public boolean jampOverObstacles(double theHeightOfTheJamp, int jampingLimit){
        if (theHeightOfTheJamp <= jampingLimit){
            return true;
        }
        else return false;
    }
}
