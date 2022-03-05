package Theme7;

public class Circle {

    // Задание 4 Подтема 7 (Создать класс (Circle) круг, с тремя инициализаторами:)
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public void initialize (int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize (int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize (int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
