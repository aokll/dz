package ru.geekbrains.lesson_geekbrains;

import java.util.Arrays;

/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон,
зарплата, возраст;
 * Конструктор класса должен заполнять эти поля при создании объекта;
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте
 в консоль;
 * Создать массив из 5 сотрудников
 Пример:
 Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
 "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект

 persArray[1] = new Person(...);
 ...
 persArray[4] = new Person(...);

 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
*/
public class lesson_five {
    public static void main(String[] args) {

        employee[] empl = new employee[5];
            empl[0] = new employee("Николай Семенович Дубов","Менеджер","DuboNic_%@mail.ru",
                    "89874938761",34,20000);
            empl[1] = new employee("Иван Иванович Иванов","Инженер","Ivanov_@mail.ru",
                    "89567341234", 45, 35000);
            empl[2] = new employee("Леонид Николаевич Лыков","IT - специалист",
                    "LeonNick(!@mail.ru","89165316521",32, 35000);
            empl[3] = new employee("Александр Алксандрович Князев","Техник",
                    "AlexKnazev+@mail.ru","89458760001",54,20000);
            empl[4] = new employee("Печкин Иван Иванович","Почтальен",
                    "Pechkin@mail.ru","89567103434",41,15000);


        for (int i = 0; i < empl.length; i++) {
            if (empl[i].ages() < 40) {
                i++;}
            System.out.println(empl[i].infoObject());
            }
            }
        }

