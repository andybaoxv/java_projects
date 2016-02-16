// This programs accepts an integer as input and test whether it is a prime

public class PrimeNumberTest
{
    public static void main(String[] args)
    {
        // N is the integer to be tested
        int N = Integer.parseInt(args[0]);
        int i = 2;
        // check whether N can be divied by any integer besides 1 and itself
        for(i = 2; i < N; i++)
        {
            if(N % i == 0)
            {
                System.out.println(N + " is a prime number.");
                break;
            }
        }
        if(i == N)
            System.out.println(N + " is not a prime number.");
    }
}

