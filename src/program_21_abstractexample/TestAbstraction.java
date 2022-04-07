package program_21_abstractexample;
/**
 * 3. Create a Third class name Circle1 which extends by Shape.
 */
public class TestAbstraction {
    public static void main(String[] args) {
        //In a real scenario, object is provided through method, e.g, getShape() method
        Shape s = new Circle();
        s.draw();
    }
}
