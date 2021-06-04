package day9.Task2;

public class Triangle extends Figure{
    double length1, length2, length3;

    public Triangle(String color, double length1, double length2, double length3){
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        double halfP = perimeter() /2;
        return Math.sqrt(halfP * (halfP -length1) * (halfP - length2) * (halfP - length3));
    }

    @Override
    public double perimeter() {
        return length1 + length2 + length3;
    }
}
