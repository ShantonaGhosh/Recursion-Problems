package com.myjavaprogram.recursion;

// First And Last Occurance of an element in string
public class FirstAndLastOccurance {

    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int index, char element) {
        if (index == str.length()) {
            System.out.print(first);
             System.out.print(last);

        }
        char currChar = str.charAt(index);
        if (currChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
            findOccurance(str, index + 1, element);
        }

    }

    public static void main(String args[]) {
        String str="abaacdaefaah";
        findOccurance(str,0,'a');

    }

}
