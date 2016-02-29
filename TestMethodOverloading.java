public class TestMethodOverloading {
   public static int average(int n1, int n2) {          // A
      return (n1+n2)/2;
   }
 
   public static double average(double n1, double n2) { // B
      return (n1+n2)/2;
   }
 
   public static int average(int n1, int n2, int n3) {  // C
      return (n1+n2+n3)/3;
   }

   public static void main(String[] args) {
      System.out.println(average(1, 2));     // Use A
      System.out.println(average(1.0, 2.0)); // Use B
      System.out.println(average(1, 2, 3));  // Use C
      System.out.println(average(1.0, 2));   // Use B - int 2 implicitly casted to double 2.0
      // average(1, 2, 3, 4); // Compilation Error - No matching method
   }
}
