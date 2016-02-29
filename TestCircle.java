// Test the Circle class

public class TestCircle
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle(2.0, "blue");

        // print out the initializations
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // set color
        c3.setColor("yellow");
        System.out.println(c3);
        c3.setRadius(100.0);
        System.out.println(c3);

    }
}
