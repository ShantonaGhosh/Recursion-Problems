
package com.myjavaprogram.recursion;

import java.util.HashSet;


public class UniqueSubsequence {
    
    
    public static void printUniqueSub(String str, int index,String newString,HashSet set){
        if(index==str.length()){
            
            if(set.contains(newString)){
                return;
            }else{
                  
            System.out.println(newString);
            set.add(newString);
            return;
            }
            
          
        }
        
        char currChar= str.charAt(index);
        //to be
        printUniqueSub(str,index+1,newString+currChar,set);
         //not to be
        printUniqueSub(str,index+1,newString,set);
        
    }
    
    
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        
        printUniqueSub(str,0,"",set);
    }
    
    
    
    
}
