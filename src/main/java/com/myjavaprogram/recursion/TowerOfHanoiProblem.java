
package com.myjavaprogram.recursion;

public class TowerOfHanoiProblem {
    public static void towerOfHanoi(int n, String src, String helper,String dest){
        if(n==1){
            System.out.println("transfer disk" + n + " from " + src + " to " +dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk" + n + " from " + src+ " to "+dest);
        
    }
    
    
    public static void main(String args[]){
        int n=3;
        towerOfHanoi(n,"S","H","D");
    }
    
}
