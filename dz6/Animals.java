package ru.geekbrains.lesson_geekbrains;

public abstract class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract boolean runAway(int runningDistance, int ranningLimit);

    public abstract boolean sail(int swimmingDistance, int swimmingLimit);

    public abstract boolean jampOverObstacles(double theHeightOfTheJamp, int jampingLimit);
}
