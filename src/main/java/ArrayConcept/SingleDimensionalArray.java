package ArrayConcept;

/*
1 How to declare an array
2 add values into array
3 Find size/ lenght of array
4 read single value from an array
5 read multiple values from array
 */
public class SingleDimensionalArray {
    public static void main(String args[])
    {
 // declaring array
        //Approch 1 Fixed size
       int a[]= new int[5];
       /*  a[0]=100;
        a[1] =200;
        a[2] =300;
        a[3] =400;
        a[4] =500; */

        //Approch 2 dynamic
        int b[] ={100,200,300,400,500};
        System.out.println(b.length + "lenght of an array");
        System.out.println(b[4]); // 4 is index number

        // how to read multiple values
        // we need to use loop
        for (int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
        //enhanced for loop / for each loop
        for(int x:b){
            System.out.println(x);
        }
    }

}
