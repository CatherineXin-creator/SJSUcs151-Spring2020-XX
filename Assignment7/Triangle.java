package Assignment7;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeArea(double base, double height) {
        return (base * height) / 2;

    }

    public String toString() {
        return "The base of the triangle is " + getBase() + " cm; and the height is " + getHeight() + " cm;" + "\nThe area is " + computeArea(base, height) + " cm square";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double compute() {
        return (base * height) / 2;
    }
}
