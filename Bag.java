// This class implement the Bag data structure

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item>
{
    // variables
    // maximal number of items in the Bag
    public static final int MAX_SIZE = 100;
    private Item[] itemCollection;
    private int numItem;

    // constructor
    public Bag()
    {
        itemCollection = (Item[]) new Object[MAX_SIZE];
        numItem = 0;
    }

    // methods
    public void add(Item item)
    {
        itemCollection[numItem] = item;
        numItem ++;
    }

    public boolean isEmpty()
    {
        return numItem == 0;
    }

    public int size()
    {
        return numItem;
    }
   
    public Iterator<Item> iterator()
    {
        return new ListIterator<Item>(first);  
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }

    public String toString()
    {
        String str = "";
        for (int i = 0; i < numItem; i++)
            str += (itemCollection[i] + ", ");
        str += "\n";
    }

    public static void main(String[] args)
    {
        Bag<Double> numbers = new Bag<Double>();
        numbers.add(100.);
        System.out.println(numbers);

        numbers.add(200.);
        System.out.println(numbers);
        
    }
}
