public class Circle{

    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public void printArea() {
        System.out.println("Area: " + area());
    }

    public void printCircumference() {
        System.out.println("Circumference: " + circumference());
    }
}