package ru.geekbrains.lesson_geekbrains;
/*
1. Расширить задачу про котов и тарелки с едой (задача в методичке)

2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного
количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)

3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true

4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то
есть не может быть наполовину сыт (это сделано для упрощения логики программы)

5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой
тарелки и потом вывести информацию о сытости котов в консоль

6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 */
public class lesson_seven {


    public static void main (String[] args) {

        Plate plate = new Plate(100);
        Catt[] Group = new Catt[5];
        Group[0] = new Catt("foggy", 3, false, 15);
        Group[1] = new Catt("murka", 4, false, 12);
        Group[2] = new Catt("foxi", 6, false, 15);
        Group[3] = new Catt("roki", 3, false, 10);
        Group[4] = new Catt("mikki", 6, false, 21);


            for (int i = 0; i <Group.length ; i++) {
                Group[i].eat(plate);
                plate.info();
        }
        Catt cat = new Catt("котан",10,false,20);
        Catt cat1 = new Catt("васька",10,false,30);

        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.additive();
        plate.info();


    }
}


