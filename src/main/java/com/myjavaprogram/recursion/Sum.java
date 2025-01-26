package com.myjavaprogram.recursion;

//print sum of first n natural numbers, 1+2+3+....+n
public class Sum {

    public static void printNum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printNum(i + 1, n, sum);

    }

    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int sum = 0;
        printNum(1, 5, 0);

    }

}
