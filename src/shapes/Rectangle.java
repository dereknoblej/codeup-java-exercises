package shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter() {
        return (this.width * 2) + (this.length * 2);
    }
}
