package ArrayConcept;

public class FindMaximumAndMinimumvaluesInArray {
    public static void main(String args[]) {
        int a[] = {50, 20, 40, 70, 80};
        int max=a[0];

        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum value of Array is....." + max);

        // minimum value of Array

        int b[] = {20,30,60,10,5};
        int min=b[0];
        for(int i=1; i<b.length; i++){
            if (b[i]<min){
                min=b[i];
            }
        }
        System.out.println("minimum value of Array is ...."+ min);
        
    }
}
