package org.example;

import java.net.StandardSocketOptions;

public class DataTypes {

    public static void main( String args[]){

        //Numeric data type
        int a= 30;
        int b = 40;

        int c=50, d=60;
        int f= a+b;

        //System .out.println("This is the value of f:" + (a+b));

        byte by =125;
        System .out.println(by);

        short sh =3535;
        System .out.println(sh);

        long l= 123456782227689l;  //we need to add l at the end f long digit
        System .out.println(l);

        // literal is used for two data types one is long and float

        //Decimal float and double
        float item_price= 15.05f;
        System .out.println(item_price);

        double dbl=1234.43435;
        System .out.println(dbl);

        char ch= 'a';

        String name= "Name";  // String is a non primitive data type

       // char ch2= 'abc'; // invalid
        // String ch3='A'; // invalid
        // String ch4= "abc" valid

        boolean bl = false; // allowed only true or false
        System.out.println(bl);

        //boolean bl1 ="true" not valid



    }
}
