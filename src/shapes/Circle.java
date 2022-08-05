package shapes;

public class Circle {
    private final double radius;
    public static int numberOfCircles = 0;


    public Circle(double userRadius) {
        this.radius = userRadius;
        numberOfCircles++;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}