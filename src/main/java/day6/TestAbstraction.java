package day6;

public class TestAbstraction
{
    // Shape is abstractclss or interface
    // Square is regular class
    public static void main(String[] args) {
        Shape shape = new Square();
        shape.drawing();

        Shape shape1 = new Circle();
        shape .drawing();

        Shape shape2 = new Rectangle();
        shape .drawing();

    }
}
