package ArrayConcept;

public class FindMissingNumberInArray {
    public static void main(String args[]){

        // To find missing number in the Array there should not be any duplicates
        // Array no need to be sorted order
        // Array should be in range

        int a[] ={1,2,4,5};
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Total of Array is ...." + sum);

        int sum2=0;
        for(int k=1; k<=5; k++){
            sum2=sum2+k;
        }
        System.out.println("Sum of 1 to 5 is...." + sum2);

        System.out.println("Missing number is ....." + (sum2-sum));
    }
}
