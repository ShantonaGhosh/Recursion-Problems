package com.myjavaprogram.recursion;

public class StringInReverse {

    public static void stringReverse(int index, String str) {

        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        stringReverse(index - 1, str);

    }

    public static void main(String args[]) {

        String str = "abcd";
        stringReverse(str.length() - 1, str);

    }

}
