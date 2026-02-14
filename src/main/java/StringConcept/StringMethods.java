package StringConcept;

public class StringMethods {
    public static void main(String args[]){
        String s= "Welcome";
        String n= new String("Welcome");
        System.out.println(s);
        // lenght method returns lenght of thesting number of charactors
        int strlenght = s.length();
        System.out.println(strlenght);

        //concat() -- joining the method

        String s1 ="welcomw";
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

    }
}
