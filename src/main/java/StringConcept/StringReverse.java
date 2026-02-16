package StringConcept;

public class StringReverse {
    public static void main(String args[]){
        // we dont have direct methos to reverse a string
        //Approch 1 lenght() and charAt()
       String s= "Welcome";
       String rev= "";

       for(int i = s.length()-1; i>=0;i--){
            rev= rev+s.charAt(i);
       }
       System.out.println("reverse string is :" + rev);
    }
}
