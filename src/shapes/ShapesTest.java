package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape1 = new Square(5);
        Measurable myShape2 = new Rectangle(5,6);

        System.out.println(myShape1.getPerimeter());
    }
}
