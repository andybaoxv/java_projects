// This class implement Student

public class Student
{
    // variables
    private String name, address;
    private int numCourses;
    private String[] courses;
    private int[] grades;

    // constants
    public static int MAX_COURSES = 30;

    // constructor
    public Student(String name, String address)
    {
        this.name = name;
        this.address = address;
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
        this.grades = new int[MAX_COURSES];
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
        return "name = " + name + "; address = " + address + "; numCourses = "
            + numCourses;
    }

    public void addCourseGrade(String course, int grade)
    {
        this.courses[numCourses] = course;
        this.grades[numCourses] = grade;
        numCourses += 1;
    }

    public double getAverageGrade()
    {
        double sum = 0.0;
        for (int i = 0; i < numCourses; i++)
            sum += grades[i];
        return sum/numCourses;
    }

    // test main function
    public static void main(String[] args)
    {
        Student s1 = new Student("Jerry", "NYC");
        System.out.println(s1);
        s1.addCourseGrade("Math", 80);
        s1.addCourseGrade("Physics", 85);
        s1.addCourseGrade("Chemistry", 90);
        System.out.println(s1);
        System.out.println(s1.getAverageGrade());
    }
}
