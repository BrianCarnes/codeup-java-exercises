package shapes;

public class Rectangle {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public int getArea() {
        return length * width;
    }
}
