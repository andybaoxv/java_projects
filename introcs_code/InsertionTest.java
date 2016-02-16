/******************************************************************************
 *  Compilation:  javac InsertionTest.java
 *  Execution:    java InsertionTest 10
 *  
 *  The method timeTrials() runs InsertionSort.sort() for arrays of random 
 *  double values. The first argument is the number of trials; the second
 *  argument is the length of the array. Multiple trials produce more
 *  accurate results because insertion sort's running time depends on
 *  the input and various system effects.
 *
 *  % java InsertionTest 10  
 *   1024 1.89 
 *   2048 5.00 
 *   4096 3.58 
 *   8192 4.09 
 *  16384 4.83 
 *  32768 3.96
 *
 ******************************************************************************/


public class InsertionTest {
    public static double timeTrials(int N, int TRIALS) {
        Double[] a = new Double[N];
        double total = 0;
        for (int t = 0; t < TRIALS; t++) { 
            for (int i = 0; i < N; i++)
                a[i] = StdRandom.uniform();
            Stopwatch s = new Stopwatch();
            Insertion.sort(a);
            total += s.elapsedTime();
        }
        return total;
    }

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        double prev = timeTrials(512, T);
        for (int N = 1024; true; N += N) {
            double curr =  timeTrials(N, T);
            StdOut.printf("%7d %4.2f\n", N, curr / prev);
            prev = curr;
        }
    }
} 

