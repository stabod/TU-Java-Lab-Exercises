public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14159*(radius*radius);
    }

    double perimeter() {
        return 2*3.14159*radius;
    }
    
}
