package StringConcept;

import java.util.Arrays;

public class StringMethods {
    public static void main(String args[]){
        String s= "Welcome";
        String n= new String("Welcome");
        System.out.println(s);
        // lenght method returns lenght of thesting number of charactors
        int strlenght = s.length();
        System.out.println(strlenght);

        //concat() -- joining the method

        String s1 ="welcome";
        String s2 ="to Java";
        String s3 ="Automation";

        // concat method at a time can join only two strings
        System.out.println(s1+s2);

        System.out.println(s1.concat(s2));   // will give the same result

        // to join 3 strings we can do this method
        System.out.println(s1.concat(s2).concat(s3));

        // we can also do this thing
        System.out.println(s1.concat(s2+s3));
        //we also can do this by using values
        System.out.println("welcome" + "java" +"Automation");

        System.out.println("Welcome".concat("to Java"));

        //trim method removes the spaces before and after the string
        String l = "   Welcome   ";
        System.out.println(l);
        System.out.println("Before triming string lenght : " + l.length() );

        System.out.println(l.trim());
        System.out.println("After triming the stream value is :"+ l.trim().length());

        //charAT() - returns character from string based on index
        //index starts from 0
        s ="Welcome";

        System.out.println(s.charAt(3)); // it will return c
        System.out.println(s.charAt(0)); // it will return W

        // contains() always returns true or false
        System.out.println(s.contains("Wel")); // True
        System.out.println(s.contains("com")); // true
        System.out.println(s.contains("wel")); // false string is case sensitive
        System.out.println(s.contains("COM")); // False

        //equals and equalsIgnorCase
         s= "Welcome";
         s1 = "welcome";
        System.out.println(s==s1); // false
         System.out.println(s.equals(s1)); // false case sensitive
        System.out.println(s.equalsIgnoreCase(s1)); // true

        //replace() - replace the sigle or multiple characters in a string
        s ="welcome to selenium java selenium python selenium c#";
        System.out.println(s.replace('e', 'X'));
        // output - wXlcomX to sXlXnium java sXlXnium python sXlXnium c#

        System.out.println(s.replace("selenium", "Playwright"));

        //substring() - extract substring from main string
        // starting index =0
        // ending index = always +1
        s = "selenium";

        System.out.println(s.substring(0,4)); //sele
        System.out.println(s.substring(2,6));// leni

        //toUpperCase()  toLowerCase()
        s= "Welcome";
        System.out.println(s.toUpperCase()); // WELCOME
        System.out.println(s.toLowerCase()); // welcome

        // split() most important
        // spit() method will split the string till annotation

        s="abc@gmail.com";    // @ is daily meter
        String a[] =s.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(Arrays.toString(a)); // will print the string

        //ex1
        String amount ="£15,20,55"; // we need to get 152055
        System.out.println(amount.replace("£",""));
        System.out.println(amount.replace("£","").replace(",", ""));

        //ex2 Split aal the values
        s= "abc,123@xyz";
        String arr1 []= s.split(","); // it will separate abc 123@xyz
        System.out.println(Arrays.toString(arr1)); // [abc, 123@xyz]
        String arr2[]= arr1[1].split("@"); // it will split 123 xyz
        System.out.println(Arrays.toString(arr2)); // [123, xyz]

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        // We can split based on the string also

        s= "abc 123";
        String ar[]= s.split(" ");
        System.out.println(Arrays.toString(ar));
        System.out.println(ar[0]);
        System.out.println(ar[1]);

        // in split method we can not use * % ^ & as a delimeters

        //ex4
        String name ="John kenedy";
        // without using equalIgnorecase
        // we need to check john is present in the string or not
        //System.out.println(name.contains("john");// will be false
        System.out.println(name.replace('J', 'j').contains("john"));

        //2
        System.out.println(name.toLowerCase().contains("john"));
        










    }
}
