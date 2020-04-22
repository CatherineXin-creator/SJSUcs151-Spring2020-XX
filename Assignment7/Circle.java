package Assignment7;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea(double radius) {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "The radius of the circle is " + getRadius() + " cm;" + "\nThe area is " + computeArea(computeArea(radius)) + " cm square";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double compute() {
        return Math.PI * radius * radius;
    }
}
