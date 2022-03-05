package Theme9;

public class Cat {

    // Задание 2 Подтема 9 (Создать класс Cat (кот) с пятью конструкторами)
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public Cat (String name){
        this.name = name;
        this.weight = 5;
        this.age = 0;
        this.color = "Colorless";
        this.address = null;
    }

    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Colorless";
        this.address = null;
    }

    public Cat (String name, int age){
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "Colorless";
        this.address = address;
    }

    public Cat (int weight, String color){
        this.name = null;
        this.weight = weight;
        this.age = 0;
        this.color = color;
        this.address = null;
    }

    public Cat (int weight, String color, String address){
        this.name = null;
        this.weight = weight;
        this.age = 0;
        this.color = color;
        this.address = address;
    }
}
