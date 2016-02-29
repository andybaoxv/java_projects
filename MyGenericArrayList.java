// A dynamically allocated array with generics
public class MyGenericArrayList<E> {
   private int size;     // number of elements
   private Object[] elements;
   
   public MyGenericArrayList() {  // constructor
      elements = new Object[10];  // allocate initial capacity of 10
      size = 0;
   }
   
   public void add(E e) {
      if (size < elements.length) {
         elements[size] = e;
      } else {
         // allocate a larger array and add the element, omitted
      }
      ++size;
   }
   
   public E get(int index) {
      if (index >= size)
         throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
      return (E)elements[index];
   }
   
   public int size() { return size; }
}
