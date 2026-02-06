package ArrayConcept;

import java.util.Scanner;

public class TakingInputFromKeyBoard {
    public static void main(String args[]){
        int num=20;
        System.out.println(num); // it will give 20
        // for taking number from consol we need to use Scanner class

        // take integer number
        Scanner sc = new Scanner(System.in);  // we need to used System.in param in order to take number
      /*  System.out.println("Please enter the number ");
        int numb = sc.nextInt();
        System.out.println("user entered "+ numb);*/

        // to take decimal number
        System.out.println("please enter the number");
        Double d= sc.nextDouble();
        // even if you enter the int number system will convert it to the double
        System.out.println("user entered "+ d);


    }
}
