package shapes;

public class Square extends Quadrilateral {

    public Square(double length) {
        super(length, length);
    }


    @Override
    void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
}
