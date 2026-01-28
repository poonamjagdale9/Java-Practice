package Operators;

public class TurneryOperator {
    public static void main(String args[]){
        //var=exp ? result1:result2;

        //example 1
        int a=200, b=100;

        int num= (a>b)? a:b;  // if the expression is true then a val
        //value will be assign to the num, if expression is false then
        // b value will be assign to the num

        System.out.println(num);

        //example 2
        int x=(1==1)? 100:200;
        System.out.println(x); //100

        int v= (1==2)? 200:100;
        System.out.println(v); //100 because condition is not true so second value will be assign

        // example 3
        int personage=30;
        String res=(personage>18)? "eligible for vote": "Not eligible for vote";
        System.out.println(res);


        // largest number of two
        int f=400, g=300;

        int h=(f>g)? f:g;
        System.out.println(h); //400
    }
}
