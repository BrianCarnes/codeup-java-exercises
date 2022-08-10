package shapes;

public class Square extends Rectangle{
    private final int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getArea() {
        System.out.println("The area of this square is: " + side * side);
        return side * side;
    }

    public int getPerimeter() {
        System.out.println("The perimeter of this square is: " + side * 4);
        return side * 4;
    }

}
