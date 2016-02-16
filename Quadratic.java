// Program 1.2.3 Quadratic formula

public class Quadratic
{
    public static void main(String[] args)
    {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double r = Math.sqrt(b*b - 4*c);
        System.out.println("sqrt(b^2 - 4*c) = " + r);
    }
}
