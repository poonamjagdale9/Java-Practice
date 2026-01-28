package Operators;

public class DecrementalOperator {
    public static void main(String args[]){

        //Case 1
        int a=10;
        a--; //a==a-1; both are same
        System.out.println(a); //9

        //Case 2  Post decrement
        int b=100;
        int res=a--;

        System.out.println(res); //100;
        System.out.println(a);

        //Case 3 predecrement
        int c= 10;
        int res1=--c;

        System.out.println(res1); //9;
        System.out.println(c);


    }
}
