package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLamdaExpression {
    public static void main(String[] args) {
        ArrayList<String>subjects = new ArrayList<>();

        subjects.add("Physics");
        subjects.add("Chemistory");
        subjects.add("Mathematics");
        subjects.add("Biology");


        System.out.println("Arraylist:"+ subjects);

        subjects.removeAll(subjects);
        System.out.println("Array list after removing all subjects:"+subjects);

       // subjects.forEach((it )-> {
          //  System.out.println(it);


        //});


    }
}
