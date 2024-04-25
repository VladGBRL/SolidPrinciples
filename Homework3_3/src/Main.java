import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();

        shapesList.add(new Circle(2));
        shapesList.add(new Rectangle(1, 3));
        shapesList.add(new Circle(1));

        double totalArea = calculateTotalArea(shapesList);

        System.out.println("Total Area: " + totalArea);
    }

    public static double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }
}