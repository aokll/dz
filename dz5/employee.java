package ru.geekbrains.lesson_geekbrains;

public class employee{
    public String full_name;
    public String position;
    public String email;
    public String tel;
    public int age;
    public int salary;

    public employee(String full_name,String position, String email, String tel, int age, int salary){
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.age = age;
        this.salary = salary;
    }
    public String infoObject(){
        return "ful name - " + full_name + "  Position - " + position + "  Phone - " +  tel +
                "  Age - " + age + "  Salary - " + salary;
    }
    public int ages(){
        return age;
    }

}
