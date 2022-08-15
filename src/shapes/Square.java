

package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side,side);
    }
    @Override
    public void setLength(double length){
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width){
        this.length = width;
        this.width = width;
    }

    @Override
    public double getArea(){
        return this.width * this.width;
    }

    @Override
    public double getPerimeter(){
        return 4 * this.length;
    }

}