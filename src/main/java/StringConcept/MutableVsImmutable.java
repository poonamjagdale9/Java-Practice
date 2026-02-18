package StringConcept;

import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String args[]){

        // What is mutability and immutable
        // mutable means we can change
        // immutable means we can not change
        // String is immutable and String Buffer and Builder is mutable

        // Example of Mutable
        int a[]= {30,40,50,20,10};
        System.out.println("Before sorting the array" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting the Array" + Arrays.toString(a));
    }
}
