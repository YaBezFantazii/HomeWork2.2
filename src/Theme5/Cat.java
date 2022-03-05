package Theme5;

public class Cat {

    // Задание 1 Подтема 5 (Создать класс Cat)
    private String name;
    private int age;
    private int weight;
    private int strength;

    // Задание 2 Подтема 5 (Реализовать метод fight)
    public static boolean fight(Cat cat1, Cat cat2) {
        if ((cat1.weight + cat1.strength) >= (cat2.weight + cat2.strength)) {
            return true;
        } else  {return false;}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}

