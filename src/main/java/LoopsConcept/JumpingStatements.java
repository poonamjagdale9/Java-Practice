package LoopsConcept;

public class JumpingStatements {
    public static void main(String args[]){

       // Control statements
        // Conditional statements -- if,  if-else,  nested ifelse, switchcase
        //Looping/itetatice statements whilw loop, do while loop, for loop
        //jumping statements -- break, continue

        for(int i=1; i<=10; i++){
            if(i==5){
                break;
            }
          //  System.out.println(i); // it will not print no.5,6,7,8,9,10
        }

        // Continue statement

        for(int i =1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i); // it will skip 5 only
        }


    }
}
