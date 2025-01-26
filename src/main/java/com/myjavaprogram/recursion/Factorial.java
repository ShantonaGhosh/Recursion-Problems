package com.myjavaprogram.recursion;

public class Factorial {

    public static int calculateFactorial(int n) {
        if(n==1 || n==0){
           return 1;
        }
        int factNumber1 = calculateFactorial(n-1);
        int factNumber = n * factNumber1;
        return factNumber;
         

    }

    public static void main(String args[]) {
        int n = 5;
       

        calculateFactorial(n);
    }

}
