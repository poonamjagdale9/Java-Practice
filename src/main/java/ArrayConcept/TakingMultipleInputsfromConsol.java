package ArrayConcept;

import java.util.Scanner;

public class TakingMultipleInputsfromConsol {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //exmp1
        System.out.println("please enter first number");
        int num1 = sc.nextInt();

        System.out.println("please enter second number");
        int num2 = sc.nextInt();

        System.out.println("total bo both number is : " + (num1+num2));

        // if you want to pass different type of data
        // exmpl 2

        System.out.println("please enter your number ");
        int num = sc.nextInt();
        System.out.println("Your number is " + num);

        System.out.println("please enter your name");
        String Name = sc.next();

        System.out.println("please enter the value");
        Object value= sc.next(); // if you dont know the data type you can use object variable
        System.out.println(" you enter the value :" + value);
    }

}
