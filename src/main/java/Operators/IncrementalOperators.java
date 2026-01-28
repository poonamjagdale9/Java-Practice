package Operators;

public class IncrementalOperators {
    public static void main(String args[]){
        int a=10;
        System.out.println(a); //10

       // a=a+1;
        System.out.println("new value of a is:"+ a); //11
       // a=a+1; // we can also write
        a++; // it will give the same result
        System.out.println("new value of a is:"+ a);

        //Post incrementation
        int b=10;
        int res=b++;
        System.out.println("value of B is" + res);

        //Pre increment
        int c=10;
        int res1= ++c; // first it will increase the value then it will asign
        System.out.println("value of res1 is:" +res1);


    }
}
