package com.myjavaprogram.recursion;

public class CheckArraySorted {

    public static boolean isArraySorted(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }

//        if (arr[index] < arr[index+1]) {
//            return isArraySorted(arr, index + 1);
//
//        } else {
//            return false;
//        }
        if (arr[index] >= arr[index + 1]) {
            return false;
        }
        return isArraySorted(arr, index + 1);

    }

    public static void main(String[] args) {
        int[] n = {1, 2, 2, 4, 5};
        int index = 0;
        boolean result = isArraySorted(n, index);
        System.out.println(result);

    }

}
