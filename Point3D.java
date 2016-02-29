public class Point3D extends Point
{
    private int z;

    // constructor
    public Point3D()
    {
        super();
        z = 0;
    }

    public Point3D(int x, int y, int z)
    {
        super(x,y);
        this.z = z;
    }

    // methods
    public int getZ()
    {
        return z;
    }

    public void setZ(int z)
    {
        this.z = z;
    }

    // override toString in Point
    @Override
    public String toString()
    {
        return "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }

    // test function
    public static void main(String[] args)
    {
        Point p1 = new Point();
        System.out.println(p1);

        Point p2 = new Point3D();
        System.out.println(p2);
        
        p2.setX(10);
        System.out.println(p2);
        
        p2.setY(20); System.out.println(p2);

    }
}
