public class Person
{
    // variables
    private String name, address;

    // constructors
    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    // methods
    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String toString()
    {
        return "name = " + name + "; address = " + address;
    }
    
    public static void main(String[] args)
    {
        Person p1 = new Person("Yale", "Xuchang");
        Person p2 = new Person("Ying", "Qianjiang");

        System.out.println(p1);
        System.out.println(p2);
        
        p2.setAddress("Boston");
        System.out.println(p2);

    }

}
