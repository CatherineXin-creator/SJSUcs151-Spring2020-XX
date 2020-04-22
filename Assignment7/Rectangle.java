package Assignment7;

public class Rectangle implements Shape {
    private double breadth;
    private double length;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double computeArea(double breadth, double length) {
        return breadth * length;
    }

    public String toString() {
        return "The breadth of the rectangle is " + getBreadth() + " cm; and the length is " + getLength() + " cm;" + "\nThe area is " + computeArea(breadth, length) + " cm square";
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double compute() {
        return breadth * length;
    }
}
