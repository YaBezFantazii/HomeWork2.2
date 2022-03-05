package Theme7;

public class Friend {

    // Задание 1 Подтема 7 (Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize))
    private String name;
    private int age;
    private String gender;


    // Инициализаторы
    public void initialize (String name){
        this.name = name;
    }

    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialize (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
