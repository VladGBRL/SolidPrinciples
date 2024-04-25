public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 6);

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(circle, square, rectangle);
        System.out.println("Total Area: " + totalArea);
    }
}