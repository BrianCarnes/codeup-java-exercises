package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle[] group = new Rectangle[2];

        group[0] = new Rectangle(4, 5);

        Measurable myShape = new Rectangle(3,4);
        System.out.println("Rectangle Area - " + myShape.getArea());
        System.out.println("Rectangle Perimeter - " + myShape.getPerimeter());

        myShape = new Square(7);
        // myShape.getLength(5);
        System.out.println("Square Area - " + myShape.getArea());
        System.out.println("Square Perimeter - " + myShape.getPerimeter());
    }
}
