1.
-------------------------#reverse the String---------------------------------------------------

import java.util.*;
public class Main {

   public static String reverseString(String str){
       
       if(str.length() == 0 || str.isEmpty()){
           return "Empty String";
       }
       
       char[] Character = str.toCharArray();
       int n = Character.length;
       int right = n-1;
       int left = 0;
       
       while(left<right){
           char temp = Character[left];
           Character[left] = Character[right];
           Character[right] = temp;
           
           left++;
           right--;
       }
       
       return new String(Character);
        
      }
    public static void main(String[] args) {
      
     String original = "abcd";
     String Reversed = reverseString(original);
     System.out.println("The original string is "+ original);
     System.out.println("The reversed string is "+ Reversed);
    }
}

