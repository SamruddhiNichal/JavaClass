package ClassPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Link {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        List<String> list1 = Arrays.asList("one","two","three","four");

        List list2 = new ArrayList();
        list2.addAll(list);
        list2.addAll(list1);



        list2.forEach(s->{
            System.out.println(s);
        });

    }
}
