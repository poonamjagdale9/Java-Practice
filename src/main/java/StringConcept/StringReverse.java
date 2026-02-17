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

       // Approch 2 without using string methos
        // first we need to convert string into char array

        String f= "Mango";
        String rev1 ="";

        char a []= f.toCharArray(); // it will return array

        for(int i= a.length-1; i>=0; i--){

            rev1= rev1+a[i];
        }
        System.out.println("Reverse value is: " + rev1);

        // we can use stringBuffer and StringBuilder methods
        //in stringBuffer and Builder we can not declare the value
        // directly as we declare in the string e.g String s= "Welcome"

        StringBuffer sb = new StringBuffer("Welcome");

    }
}
