import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class IteratorEx {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>() ;
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        for (Integer i : set) {
            System.out.println(i);
        }
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()) {
            int value=iterator.next();
            if(value%2==0)
                iterator.remove();

        }
        System.out.println(set);
    }

}
