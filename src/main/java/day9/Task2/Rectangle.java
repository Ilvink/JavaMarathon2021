package day9.Task2;

public class Rectangle extends Figure{
    double width, height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }
}
