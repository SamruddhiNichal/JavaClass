package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AraayList {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

              list.forEach((it)->{
              System.out.println(it);
              });


    }
}
