package ArrayConcept;

import java.util.Arrays;

public class SortingElimentsinArray {
    public static void main(String args[]){
        int a[]={200,500,600,100,400};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(a));


        System.out.println("After sorting");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
