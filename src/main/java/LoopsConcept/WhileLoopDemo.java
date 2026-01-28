package LoopsConcept;

public class WhileLoopDemo {
    public static void main(String args[]){

        //Example 1 print 1to 10

        int i=1; // initilization

        while(i<=10)    //condition
        {
           // System.out.println(i);
            i++;
        }
        // example 2

        int j=1;
        while (j<=10){
           // System.out.println("Hello");
            j++;
        }
        // example 3 print even numbers between 1 o 10

        int k=2;
        while(k<=10){
          //  System.out.println(k);
           k+=2; // or we can write k=k+2
        }

        //Approch 2
        int l=1;

        while (l<=10){
            if(l%2==0){
              //  System.out.println(l);
            }
            l++;
        }

        // print odd and even numbers 1-10
       /* int m=1;
        while(m<=10){
            if(m%2==0){
                System.out.println(m + "is even number");
            }
            else {
                System.out.println(m +" is odd number");
            }
            m++;
        }*/

        // example 5
        // print numbers in decending order 10-1

        int g=10;

        while (g>=1) // or we can write g>0
             {
            System.out.println(g);
            g--;

        }
    }
}
