package com.company;

import Theme5.Cat;

public class Main {

    public static void main(String[] args) {
//////////  Задачи из 5 лекции 5 подтемы. ///////////////////////////////////////////////////////////////////

        // Задание 4 Подтема 5 (Создать три объекта типа Cat)
        Theme5.Cat cat1 = new Cat();
        Theme5.Cat cat2 = new Cat();
        Theme5.Cat cat3 = new Cat();
        cat1.setName("Мурзик");
        cat1.setAge(1);
        cat1.setWeight(6);
        cat1.setStrength(7);
        cat2.setName("Барсик");
        cat2.setAge(2);
        cat2.setWeight(4);
        cat2.setStrength(2);
        cat3.setName("Лунтик");
        cat3.setAge(4);
        cat3.setWeight(5);
        cat3.setStrength(5);

        // Задание 5 Подтема 5 (Провести три боя попарно между котами)
        if (Cat.fight(cat1,cat2)) {
            System.out.println("Победа. Кот1 сильнее Кот2");
        } else {System.out.println("Поражение. Кот1 слабее Кот2");}

        if (Cat.fight(cat1,cat3)) {System.out.println("Победа. Кот1 сильнее Кот3");
        } else {System.out.println("Поражение. Кот1 слабее Кот3");}

        if (Cat.fight(cat2,cat3)) {System.out.println("Победа. Кот2 сильнее Кот3");
        } else {System.out.println("Поражение. Кот2 слабее Кот3");}


    }
}
