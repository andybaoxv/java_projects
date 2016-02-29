// This class extend the super class Circle

public class Cylinder extends Circle
{
    private double height;

    // constructor
    public Cylinder()
    {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius)
    {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }

    // getter
    public double getHeight()
    {
        return height;
    }
    
    // override the getArea() method inherited from superclass Circle
    @Override
    public double getArea()
    {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    public double getVolumn()
    {
        return super.getArea() * height;
    }
    
    @Override
    public String toString()
    {
        return "Radius = " + getRadius() + "; Height = " + height + "; Volumn = "
            + getVolumn(); 
    }

    // test main function
    public static void main(String[] args)
    {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(2.0);
        Cylinder c3 = new Cylinder(3.0,4.0);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    } 
}
