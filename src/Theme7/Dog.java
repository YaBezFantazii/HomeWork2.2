package Theme7;

public class Dog {

    // Задание 3 Подтема 7 (Создать класс Dog (собака) с тремя инициализаторами:)
    private String name;
    private int height;
    private String color;

    public void initialize (String name){
        this.name = name;
    }

    public void initialize (String name,int height){
        this.name = name;
        this.height = height;
    }

    public void initialize (String name, int height, String colour){
        this.name = name;
        this.height = height;
        this.color = colour;
    }
}
