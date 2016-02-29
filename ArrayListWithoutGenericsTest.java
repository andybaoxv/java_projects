// Pre-JDK 1.5
import java.util.*;
public class ArrayListWithoutGenericsTest {
   public static void main(String[] args) {
      List strLst = new ArrayList();  // List and ArrayList holds Objects
      strLst.add("alpha");            // String upcast to Object implicitly
      strLst.add("beta");
      strLst.add("charlie");
      Iterator iter = strLst.iterator();
      while (iter.hasNext()) {
         String str = (String)iter.next(); // need to explicitly downcast Object back to String
         System.out.println(str);
      }
      strLst.add(new Integer(1234));       // Compiler/runtime cannot detect this error
      String str = (String)strLst.get(3);  // compile ok, but runtime ClassCastException
   }
}
