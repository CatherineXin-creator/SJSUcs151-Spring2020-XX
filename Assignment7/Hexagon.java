package Assignment7;

public class Hexagon implements Shape {
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    public double computeArea(double side) {
        return (6 * (side * side)) / (4 * Math.tan(Math.PI / 6));
    }

    public String toString() {
        return "The side of the hexagon is " + getSide() + " cm;" + "\nThe area is " + computeArea(computeArea(side)) + " cm square";
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double compute() {
        return (6 * (side * side)) / (4 * Math.tan(Math.PI / 6));
    }
}
