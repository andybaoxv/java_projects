// This programs shows a sequence of operations applied to an array

public class ArrayOps
{
    public static void main(String[] args)
    {
        // input integer value as the length of the array to be created
        int N = Integer.parseInt(args[0]);

        // create an array with random values and print each value
        double[] a = new double[N];
        System.out.print("a = [");
        int i = 0;
        for(i=0; i<N; i++)
        {
            a[i] = Math.random();
            System.out.print(a[i] + ", ");
        }
        System.out.println("");
        
        // find the maximum of the array values
        // compute the average of the array values
        // copy array a to another array b
        double[] b = new double[N];
        double a_max = a[0];
        double a_avg = a[0]/N;
        b[0] =a [0];
        for(i=1; i<N; i++)
        {
            a_avg += a[i]/N;
            if(a[i] > a_max)
                a_max = a[i];
            b[i] = a[i];
        }
        
        // print out results
        System.out.println("Max value = " + a_max);
        System.out.println("Average value = " + a_avg);
        System.out.print("Copy is: [");
        for(i=0; i<N; i++)
            System.out.print(b[i] + ", ");
        System.out.println("]");
    }
}
