package Assignment7;

import java.util.ArrayList;

public interface Shape {

    double compute();

    ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public static void add(ArrayList<Shape> shapes) {
        shapeList.add((Shape) shapes);
    }


    public static void remove(ArrayList<Shape> shapes) {
        shapeList.remove((Shape) shapes);
    }
}
