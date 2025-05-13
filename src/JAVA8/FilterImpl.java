package JAVA8;

import java.util.List;

public class FilterImpl implements MyFilter {
    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }

    public static void display(MyFilter filter, List<Integer> list) {
        for (Integer number : list) {
            if (filter.test(number)) {
                System.out.println(number);
            }
        }

    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
       list.stream().filter(n->n%2==0).toList().forEach(System.out::println);
       list.stream().map(n->n+">=5"+(n>=5)).toList().forEach(System.out::println);
       //printing even values
       display(new FilterImpl(),list);
       //printing odd values by using anonymous inner class
       display(new MyFilter() {
           @Override
           public boolean test(Integer number) {
               return number%2!=0;
           }
       },list);

    }
}
