package Assignment7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ShapeTest {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);
        Circle circle = new Circle(6);
        Hexagon hexagon = new Hexagon(4);
        Triangle triangle = new Triangle(6, 8);
        max(rectangle, triangle, circle, hexagon);
        min(rectangle, triangle, circle, hexagon);


        Shape shapes = new Shape() {
            @Override
            public double compute() {
                return 0;
            }
        };
        new Thread() {
            public void run() {
                shapes.compute();
            }
        }.start();


        try {
            FileOutputStream fileOut =
                    new FileOutputStream("obj1.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(rectangle.toString());
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in obj1.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }


    private static void max(Rectangle rectangle, Triangle triangle, Circle circle, Hexagon hexagon) {
        if (rectangle.computeArea(10, 5) > triangle.computeArea(6, 8) && rectangle.computeArea(10, 5) > circle.computeArea(6) && rectangle.computeArea(10, 5) > hexagon.computeArea(4)) {
            System.out.println("Rectangle has the largest area." + "\n" + rectangle.toString());
            System.out.println();
        } else if (triangle.computeArea(6, 8) > circle.computeArea(6) && triangle.computeArea(6, 8) > hexagon.computeArea(4)) {
            System.out.println("Triangle has the largest area." + "\n" + triangle.toString());
            System.out.println();
        } else if (circle.computeArea(6) > hexagon.computeArea(4)) {
            System.out.println("Circle has the largest area." + "\n" + circle.toString());
            System.out.println();
        } else {
            System.out.println("Hexagon has the largest area." + "\n" + hexagon.toString());
            System.out.println();
        }
    }

    private static void min(Rectangle rectangle, Triangle triangle, Circle circle, Hexagon hexagon) {
        if (rectangle.computeArea(10, 5) < triangle.computeArea(6, 8) && rectangle.computeArea(10, 5) < circle.computeArea(6) && rectangle.computeArea(10, 5) < hexagon.computeArea(4)) {
            System.out.println("Rectangle has the smallest area." + "\n" + rectangle.toString());
            System.out.println();
        } else if (triangle.computeArea(6, 8) < circle.computeArea(6) && triangle.computeArea(6, 8) < hexagon.computeArea(4)) {
            System.out.println("Triangle has the smallest area. " + "\n" + triangle.toString());
            System.out.println();
        } else if (circle.computeArea(6) < hexagon.computeArea(4)) {
            System.out.println("Circle has the smallest area." + "\n" + circle.toString());
            System.out.println();
        } else {
            System.out.println("Hexagon has the smallest area." + "\n" + hexagon.toString());
            System.out.println();
        }

    }
}
