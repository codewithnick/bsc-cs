import java.util.*;
public class CollectionDemo {
    public static void main(String[] args) {
        List a1 = new ArrayList();
        a1.add("Anand");
        a1.add("Shivam");
        a1.add("Akash");
        a1.add(2, "Nikhil");
        a1.set(1, "Sophia");
        System.out.println("ArrayList Elements");
        System.out.print("\t" + a1);
        System.out.println("\nValue at 1st position is:  " + a1.get(1));

        List l1 = new LinkedList();
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Papaya");
        l1.add("Orange");
        l1.add("Apple");
        l1.add("Grapes");
        l1.addAll(3, a1);
        System.out.println();
        System.out.println("LinkedList Elements");
        System.out.print("\t" + l1);
        System.out.println("\nIndex of Banana is:  " + l1.indexOf("Banana"));
        System.out.println("Last index of Apple is:  " + l1.lastIndexOf("Apple"));
        l1.remove(8);
        System.out.println("Removed element from 8th position");
        System.out.print("\nNew Linked List is...\t" + l1);

        System.out.println("\nSublist is..." + l1.subList(4, 7));
    }
}