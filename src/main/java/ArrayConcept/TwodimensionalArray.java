package ArrayConcept;

public class TwodimensionalArray {
    public static void main(String args[]){
    //Approch 1
        int a [][] = new int[3][2];

        a [0] [0] =100;
        a[0][1] =200;

        a[1][0] =300;
        a[1][1] =400;

        a[2][0] =500;
        a[2][1] =600;


        // approch 2

        int b[][]= {{100, 200},
                {300, 400},
                {500, 600}
        };
        System.out.println("lenght of rows" + b.length); // will give us rows
        System.out.println("lenght od colums" + a[0].length); // will give us columns of 0 row

        // how to read values from an array
      //  System.out.println(a[2][1]); //600 we need to pass index number index will always start with 0

        // how to read all the data all the rows all the columns

        for(int row=0; row<=2;row++){
            for (int clm =0; clm<=1;clm++){
                System.out.println(a[row][clm]);
            }
        }

        }
}

