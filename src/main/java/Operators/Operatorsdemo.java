package Operators;

public class Operatorsdemo {
    public static void main( String args[]){
        // Arithmatic operators + - * / %

        int a= 20, b=10;

        System.out.println("Sum of a and b is" + (a+b));
        System.out.println("diff of a and b is" + (a-b));
        System.out.println("Multiplication of a and b is" + (a*b));
        System.out.println("Division of a and b is" + (a/b));
        System.out.println("Sum of a and b is" + (a%b));

        // Relational and comparison operators >- >= < <= != ==
        // always returns boolean value true/false
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        b=20;
        System.out.println(a>=b); // true
        System.out.println(a<=b); // true

        System.out.println(a!=b);  //false
        System.out.println(a==b); // true
        boolean res= a>b;
        System.out.println(res);

        // Logical operators && || !
        // returns boolean values, it works only with boolean true/false
        // work only with true or false







    }
}
