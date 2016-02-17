// This program implements Stopwatch

public class Stopwatch
{   
    private final double t0;

    public Stopwatch()
    {
        t0 = System.currentTimeMillis();
    }

    public double elapsedTime()
    {
        return System.currentTimeMillis() - t0;
    }

    public static void main(String[] args)
    {
        Stopwatch s1 = new Stopwatch();
        int N = Integer.parseInt(args[0]);
        double sum = 0;
        for (int i = 0; i < N; i++)
            sum += Math.sqrt(i);
        StdOut.println("elapsedTime = " + s1.elapsedTime());
    }
}
