// This programs aims to output the number of prime numbers between 2 and N,
// which is used as input to the algorithm

public class PrimeSieve
{
    public static void main(String[] args)
    {
        // range of integers to search for primes
        int N = Integer.parseInt(args[0]);
        // boolean array indicating whether an element is a prime number
        boolean[] isPrime = new boolean[N+1];
        for (int i = 2; i <= N; i++)
            isPrime[i] = true;
        for(int i = 2; i <= N/i; i++)
        {
            if (isPrime[i])
            {
                for(int j = i; j <= N/i; j++)
                    isPrime[i * j] = false;
            }
        }

        // count the number of primes
        int numPrime = 0;
        for (int i = 0; i <= N; i++)
        {
            if (isPrime[i])
                numPrime ++;
        }

        // print out the result
        System.out.println(numPrime);

    }
}
