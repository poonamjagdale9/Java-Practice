package IfElseConditions;

public class IfElseCondition {
    public static void main(String args[]){
        //int person_age=25;
        int person_age=15;

      /*  if (person_age>=18){
            System.out.println("Eligible for vote");
        }
        else {
            System.out.println("Not eligible for vote");
        }*/

       // if we have only one condition we do not
        //need to write curly braces we can write under main method

        if (person_age>=18)
            System.out.println("Eligible for vote");
            else
            System.out.println("Not eligible for vote");

            //smalest number of 3
        int h=10, j=8, k=5;

        if(h<j && h<k){
            System.out.println("h is smallest number");
        }
        else if(j<h && j<k){
            System.out.println("j is smallest number");
        }
        else {
            System.out.println("k is smallest number");
        }


    }
}
