// This program simulates the flipping of a coin

public class FlipCoin
{
    public static void main(String[] args)
    {
        double a = Math.random();
        if(a < 0.5)
            System.out.println("Tail");
        else
            System.out.println("Head");
    }
}
