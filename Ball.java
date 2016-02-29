// This class implement Ball

public class Ball
{   
    public static final double DEFAULT_X = 0.0;
    public static final double DEFAULT_Y = 0.0;

    // variables
    private double x,y;

    // constructors
    public Ball()
    {
        x = DEFAULT_X;
        y = DEFAULT_Y;
    }

    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // instance methods
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp)
    {
        this.x += xDisp;
        this.y += yDisp;
    }

    public String toString()
    {
        return "x = " + x + ";      y = " + y;
    }

    // test main function
    public static void main(String[] args)
    {
        Ball b1 = new Ball();
        System.out.println("b1: " + b1.toString());
        Ball b2 = new Ball(1.3, 2.6);
        System.out.println("b2: " + b2.toString());

        b2.setX(10); System.out.println(b2);
        b2.setY(20); System.out.println(b2);
        b2.setXY(30,40); System.out.println(b2);
        b2.move(5,10); System.out.println(b2);
    }

}
