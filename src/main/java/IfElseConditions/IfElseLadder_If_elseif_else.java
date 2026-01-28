package IfElseConditions;

public class IfElseLadder_If_elseif_else {
    public static void main(String []args){
        //Check num is positive negative or zero
       // int num= 10;
      /*  int num=-10;
        if(num>=0){
            System.out.println("Positive number");
        }
        else if(num <=0){
            System.out.println("Negative number");
        }
        else {
            System.out.println("Number is zero");
        } */

        //Find out the largest number
        // a>b and a>c -- then a is largest number
        // b>a and b>c ---- then b is largest number
        // c>a and c>b --- then c is largest number

        int a=10, b=20, c=30;

        if( a>b && a>c){
            System.out.println("a is largest number" +10);

        }
        else if (b>a && b>c){
            System.out.println("b is largest number" +20);
        }

        else {
            System.out.println("C is largest number" +30);
        }

    }
}
