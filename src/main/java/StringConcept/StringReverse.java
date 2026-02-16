package StringConcept;

public class StringReverse {
    public static void main(String args[]){
        // we dont have direct methos to reverse a string

        String name= "Welcome";
        String rev="";

        for(int i= name.length()-1; i>=0; i--){
            rev= rev+name.charAt(i);
        }
        System.out.println(rev);


    }
}
