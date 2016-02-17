// This program implements the Charge class defined on Page 318 of the book

public class MyCharge
{
    // define variables for this class
    private final double x0;
    private final double y0; 
    private final double q0;

    // constructor
    public MyCharge(double x, double y, double q)
    {
        x0 = x;
        y0 = y;
        q0 = q;
    }

    // methods 
    public double potentialAt(double x, double y)
    {
        double r = Math.sqrt(Math.pow(x-x0,2) + Math.pow(y-y0,2));
        double V = 8.99e9 * q0/r;
        return V;
    }

    // method 2
    public String toString()
    {
        String r = "x0 = " + x0 + ",   y0 = " + y0 + ",    q0 = " + q0;
        return r;
    }

    // main function
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        MyCharge mc1 = new MyCharge(0.51, 0.63, 21.3);
        MyCharge mc2 = new MyCharge(0.13,0.94,81.9);

        // test method 1
        double v1 = mc1.potentialAt(x,y);
        double v2 = mc2.potentialAt(x,y);
        StdOut.printf("%.1e\n", v1+v2);

        // test method 2
        StdOut.println(mc1.toString());
        StdOut.println(mc2.toString());
    }
}
