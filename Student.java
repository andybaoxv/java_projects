// This class inherite Person

public class Student extends Person
{
    // maximal number of courses for one student
    public static final int MAX_COURSES = 20;

    // variables
    private int numCourses;
    private String[] courses;
    private int[] grades;

    // constructors
    public Student(String name, String address)
    {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    // methods
    @Override
    public String toString()
    {
        return super.toString() + "; numCourses = " + numCourses;
    }

    public void addCourseGrade(String course, int grade)
    {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses += 1;
    }

    public void printGrades()
    {
        for (int i = 0; i < numCourses; i++)
            System.out.print(grades[i] + ", ");
        System.out.println("");
    }

    public double getAverageGrade()
    {
        double sum = 0.0;
        for (int i = 0; i < numCourses; i++)
            sum += grades[i];
        return sum/numCourses;
    }

    // test function
    public static void main(String[] args)
    {
        Student s1 = new Student("Ying", "Boston");
        System.out.println("name is " + s1.getName());
        System.out.println("address is " + s1.getAddress());
        
        // upcasting is safe
        Person s2 = new Student("Yale", "Malden");
        System.out.println(s2.toString());
        System.out.println(s2.getName());
        System.out.println(s2.getAddress());
        //System.out.println(s2.addCourseGrade("MachineLearning",100)); 
        
        System.out.println(s1 instanceof Person);

        /*
        s1.addCourseGrade("Optimization", 90);
        System.out.println(s1);
        s1.addCourseGrade("Algorithm",92);
        System.out.println(s1);
        s1.addCourseGrade("Vision", 93);
        System.out.println(s1);
        s1.printGrades();
        System.out.println(s1.getAverageGrade());*/
    }
}
