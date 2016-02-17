// This program shows operations on a two-dimensional array in Java

public class MatrixOps
{
    public static void main(String[] args)
    {
        // initialize data matrix
        int[][] a = 
        {
            {99, 85, 98, 0},
            {98, 57, 78, 0},
            {92, 77, 76, 0},
            {94, 32, 11, 0},
            {99, 32, 11, 0}
        };

        // print out the matrix
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 4; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println("");
        }
        //System.out.println(a[0]);
        //System.out.println(a[1]);
    }
}
