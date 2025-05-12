import java.util.ArrayList;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        System.out.println("Original list:");
        list.forEach(System.out::println);
        
        java.util.ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value%2==0) {
                iterator.remove();
            } else {
                iterator.set(value);
                iterator.add(value);
            }
        }
        
        System.out.println("\nModified list:");
        list.forEach(System.out::println);
        System.out.println("-------------------");

        // Traverse backwards
        while (iterator.hasPrevious()) {
            Integer value = iterator.previous();
            System.out.println(value);
        }
        
        System.out.println("\nFinal list:");
        System.out.println(list);
    }
}