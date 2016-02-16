// This program shows basic input-output operations for Java

public class IOOpts
{
    public static void main(String[] args)
    {
        // Standard Output formatting
        /*
        double c = 2.0;
        double t = Math.sqrt(c);
        StdOut.printf("The square root of %.1f is %.4f",c,t);
        StdOut.println();*/

        // Standard Input
        /*
        int N = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i < N; i++)
        {
            int value = StdIn.readInt();
            sum += value;
        }
        StdOut.println("Sum is " + sum);*/

        // StdIn.isEmpty
        double sum = 0;
        int cnt = 0;
        while (!StdIn.isEmpty())
        {
            double value = StdIn.readDouble();
            sum += value;
            cnt ++;
        }
        double average = sum / cnt;
        StdOut.println("Average value is " + average);
    }
}
