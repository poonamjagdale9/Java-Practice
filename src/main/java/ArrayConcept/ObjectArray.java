package ArrayConcept;

public class ObjectArray {
    public static void main(String args[]){
        // we can store different data types in single array by creating Object array

        Object a[]={100, 200, "name", 'c', true};

        // we use enhanced for loop

        for (Object x:a){
            System.out.println(x);

        }
        // print the values using normal for loop

        for(int i=0; i<=a.length-1; i++){
            System.out.println(a[i]);

        }
    }
}


/* find sum of elements in array
a={1,2,3,4,5}
Sum=15 */

/* print even and odd number
* a={1,2,3,4,5,6}
* even=3
* odd =3
* */

// find prime number
