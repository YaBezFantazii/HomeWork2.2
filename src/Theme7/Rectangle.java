package Theme7;

public class Rectangle {

    private int top = 0;
    private int left = 0;
    private int width = 0;
    private int height = 0;

    public void initialize (int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize (int top, int left){
        this.top = top;
        this.left = left;
    }

    // Квадрат
    public void initialize (int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    // Копия другого прямоугольника
    public void initialize (Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.width;
    }

    // Известна только верхняя координата (базовое значение левой координаты - 1)
    public void initialize (int top){
        this.top = top;
        this.left = 1;
    }


}
