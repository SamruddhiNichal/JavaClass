package practice;

import java.util.LinkedList;

public class RemoveElementUsingRemove {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

      list.add("45");
      list.add("95");
      list.add("56");
      list.add("65");

        System.out.println("LinkedList:"+list);


        String str = list.remove(2);
        System.out.println("Remove Element");

        System.out.println("Updated Linkedlist :"+ list);


    }
}
