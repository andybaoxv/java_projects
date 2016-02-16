// This program takes the square root of each input number through Newton's
// method

public class Newton
{
    // square root function
    public static double sqrt(double c)
    {
        if (c < 0)
            return Double.NaN;
        double tol = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > tol * t)
            t = (c/t + t)/2.0;
        return t;
    }

    // main function
    public static void main(String[] args)
    {
        int N = args.length;
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
        {
            a[i] = Double.parseDouble(args[i]);
            StdOut.print(sqrt(a[i]) + "\t");
        }
        StdOut.println();

    }
}


