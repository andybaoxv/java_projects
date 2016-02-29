// This class implements Circle class

public class Circle
{
    // public constants
    public static final double DEFAULT_RADIUS = 8.0;
    public static final String DEFAULT_COLOR = "red";

    // private variables
    private double radius;
    private String color;

    // constructor
    public Circle()
    {
        radius = DEFAULT_RADIUS;
        color = DEFAULT_COLOR;
    }
    public Circle(double radius)
    {
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }
    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    // getRadius
    public double getRadius()
    {
        return radius;
    }

    // getColor
    public String getColor()
    {
        return color;
    }

    // get Area
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    public String toString()
    {
        return "Radius = " + radius + "; Color = " + color + 
                "; Area = " + getArea();
    }
    
    // set color
    public void setColor(String color)
    {
        this.color = color; 
    }

    // set radius
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    // Test function
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle(2.0, "blue");
    
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        /*
        System.out.println("Radius = " + c1.getRadius() + " Color = " + 
                c1.getColor() +  " Area = " + c1.getArea());
        System.out.println("Radius = " + c2.getRadius() + " Color = " + 
                c2.getColor() +  " Area = " + c2.getArea());
        System.out.println("Radius = " + c3.getRadius() + " Color = " + 
                c3.getColor() +  " Area = " + c3.getArea());*/
    }

}
