package ArrayConcept;

public class SearchingElimentsInArray {
    public static void main(String args[]){
        int a[] ={10,20,30,40,50};
        int search_num = 30;
        boolean status =false;
        for (int i=0;i<a.length;i++){

            if (a[i]==search_num){
                System.out.println("num matches");
                status= true;
                break;
            }}
        if(status==false) {
            System.out.println("element not found");
        }

    }}
