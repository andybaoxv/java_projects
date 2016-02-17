//toString, plus, times, abs

public class MyComplex
{
    // instance variables
    private double re, im;

    // constructor
    public MyComplex(double re_0, double im_0)
    {
        re = re_0;
        im = im_0;
    }

    // access re and im
    public double re()
    {
        return re;
    }

    public double im()
    {
        return im;
    }

    // plus
    public MyComplex plus(MyComplex b)
    {
        MyComplex a = this;
        MyComplex c = new MyComplex(0,0);
        c.re = a.re + b.re;
        c.im = a.im + b.im;
        return c;
    }
    
    // main function
    public static void main(String[] args)
    {
        double[] x = new double[args.length];
        for (int i = 0; i < args.length; i++)
            x[i] = Double.parseDouble(args[i]);
        
        //constructor
        MyComplex a = new MyComplex(x[0],x[1]);
        MyComplex b = new MyComplex(x[2],x[3]);
        StdOut.println(a.re + " + i* " + a.im);
        StdOut.println(b.re + " + i* " + b.im);

        MyComplex c = a.plus(b);
        StdOut.println(c.re + " + i*" + c.im);
    }
}
