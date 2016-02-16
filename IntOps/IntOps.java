// This program shows the operations for integers in java

public class IntOps
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int r1 = x + y;
        int r2 = x - y;
        int r3 = x/y;
        int r4 = x%y;
        int r5 = x*y;

        System.out.println(x + " + " + y + " = " + r1);
        System.out.println(x + " - " + y + " = " + r2);
        System.out.println(x + " / " + y + " = " + r3);
        System.out.println(x + " % " + y + " = " + r4);
        System.out.println(x + " * " + y + " = " + r5);
    }
}
