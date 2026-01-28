package LoopsConcept;

public class ForLoop {
    public static void main(String args[]){
        for(int i=1; i<=10;i++){
           System .out.println(i);
        }

        // print 1 t0 10 even numbers

        for(int j=2; j<=10; j+=2){
            System.out.println(j);
        }
        // even or odd number
        for(int k=1; k<=10; k++ ){
            if(k%2 ==0){
                System.out.println( k + " is even number");
            }
            else {
                System.out.println( k + " is odd number");
            }
        }

        // 1 to 10 in decending order

        for(int h=10; h>0; h--){
            System.out.println(h);
        }
    }
}
