// This program implements Vector class

public class Vector
{
    private final double[] coords;

    // constructor: make a defensive copy
    public Vector(double[] x)
    {
        coords = new double[x.length];
        for (int i = 0; i < x.length; i++)
            coords[i] = x[i];
    }

    // sum of this vector and b
    public Vector plus(Vector b)
    {
        Vector a = this;
        double[] t = new double[coords.length];
        for (int i = 0; i < coords.length; i++)
            t[i] = a.coords[i] + b.coords[i];
        Vector c = new Vector(t);
        return c;
    }

    // difference of this vector and b
    public Vector minus(Vector b)
    {
        Vector a = this;
        double[] t = new double[coords.length];
        for (int i = 0; i < coords.length; i++)
            t[i] = a.coords[i] - b.coords[i];
        Vector c = new Vector(t);
        return c;
    }

}
