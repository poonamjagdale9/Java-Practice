package ArrayConcept;

import java.util.Arrays;

public class SortingElimentsinArray {
    public static void main(String args[]){
        int a[]={200,500,600,100,400};
        System.out.println("before sorting");

       /* for (int value: a){
            System.out.println(value);
        }*/

        // just print array using predifine methos
        System.out.println(Arrays.toString(a)); // print array without for loop

       System.out.println("After sorting");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
