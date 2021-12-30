import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hm1 = new HashMap<>(); 
        hm1.put(1, "This"); 
        hm1.put(2, "is"); 
        hm1.put(3, "Map");
        hm1.put(4,"Demo") ;
        System.out.println(hm1); 
        String rmd=hm1.remove(new Integer(2));
        System.out.println("Map after removing element at key 2 "+hm1);
        hm1.put(2,"is");
        System.out.println("Map after adding 'is' back at key 2 "+hm1);
        System.out.println("Size of the map is "+ hm1.size());
        System.out.println("Element at key 4 is "+hm1.get(4));
        System.out.println("Is Map empty  "+hm1.isEmpty());
        hm1.clear();
        System.out.println("Clearing all elements and value in map "+hm1);
        System.out.println("Is Map empty  "+hm1.isEmpty());
    } 
    }
