// This program shows common functions applied on an array

public class FunctionOnArray
{
    // Find the maximum of an array
    public static double max(double[] a)
    {
        double a_max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > a_max)
                a_max = a[i];
        }
        return a_max;
    }

    // dot product of two arrays
    public static double dot(double[] a, double[] b)
    {
        int N = a.length;
        if (!(N == b.length))
        {
            StdOut.println("a and b do not have equal length");
            return 0;
        }
        else
        {
            double r = 0;
            for (int i = 0; i < N; i++)
                r += a[i]*b[i];
            return r;
        }
    }
    
    // exchange two elements in an array
    public static void exchange(double[] a, int i, int j)
    {
        double t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    
    // print 1D array
    public static void printArray(double[] a)
    {
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + ", ");
        StdOut.println();
    }

    // return an array
    public static double[] tone(double hz, double t)
    {
        int sps = 44100;
        int N = (int) (sps * t);
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++)
            a[i] = Math.sin(2 * Math.PI * i * hz/ sps);
        return a;
    }

    // main function
    public static void main(String[] args)
    {
        double[] a = {1, 5, 10, 9.8};
        double[] b = {2, 4, 2, 5};
        double r1 = max(a);
        double r2 = dot(a,b);
        StdOut.print("a = ");
        printArray(a);
        StdOut.print("b = ");
        printArray(b);
        StdOut.println("max(a) = " + r1);
        StdOut.println("dot(a,b) = " + r2);
        
        // test exchange
        exchange(a,0,2);
        StdOut.print("array a after exchange = ");
        printArray(a);
        
        // test return array
        double[] c = tone(100,5);
        printArray(c);
    }
}
