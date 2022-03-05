package Theme9;

public class Dog {

    // Задание 3 Подтема 9 (Создать класс Dog (собака) с тремя конструкторами)
    private String name;
    private int height;
    private String color;

    public Dog (String name){
        this.name = name;
    }

    public Dog (String name,int height){
        this.name = name;
        this.height = height;
    }

    public Dog (String name, int height, String colour){
        this.name = name;
        this.height = height;
        this.color = colour;
    }
}
