package com.myjavaprogram.recursion;

//Qs.  Move all 'x' to the string 
public class MoveElement {

    public static void moveAllX(String str, int index, int count, String newString) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString = newString + "x";
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if (currChar == 'x') {
            count++;
            moveAllX(str, index + 1, count, newString);
        } else {
            newString += currChar;
            //newString =newString + currIndex;
            moveAllX(str, index + 1, count, newString);
        }

    }

    public static void main(String args[]) {
        String s = "axbcxxd";
        int count = 0;
        int index = 0;
        String newString = "";
        moveAllX(s, index, count, newString);

    }

}
