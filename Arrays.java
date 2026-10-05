//Find the the second largest element in an Array

// Brute force approach
-At first we are going to sort the array in an ascending order.
 -Then we are going to return the element in an array which is at the location arr[n-1] if we are starting from i=1.
  -And then we are goinn to compare the largest element with the second largest element if(largest == secondLargest then traverse the array from the end of the array and get the element which is less than the largest element.)


	1
 ---------------------------------------#Second Largest Element in the Array------------------------------------------------------------------------------------------------------------------------

 public class Main
{
	public static void main(String[] args) {
	    
	    int arr[] = {1,4,6,33,76,88};
	    int n = arr.length;
	    int Largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    
	    for(int num: arr){
	        if(num > Largest){
	            secondLargest = Largest;
	            Largest = num;
	        }else if(num > secondLargest && num != Largest){
	            throw new IllegalArgumentException("The array contains repeating elements ");
	        }
	    }
		System.out.println("Second Largest Element in the Array is: " + secondLargest);
	}
}


2
-------------------------------#Maximum Number of Consecutive Ones in an Array--------------------------------------------------------------------


public class Main
{
    
    public static int ConsecutiveOnes(int arr[]){
        int Count =0;
        int maxCount = 0;
        
        for(int val : arr){
            if(val == 1){
                Count++;
                if(Count > maxCount){
                    maxCount = Count;
                }
            }else{
                Count =0;
            }
        }   
        return maxCount;
    }
	public static void main(String[] args) {
	    
	    int arr[] = {1,1,0,0,1,1,1,1,0,1,};
		System.out.println("Consecutive number of ones is " + ConsecutiveOnes(arr));
	}
}


3
--------------------------------# Left Shift the array by 1 element------------------------------------------------------------------------


import java.util.Arrays;
public class Main
{
    
    public static void rotateShiftArray(int arr[]){
        if(arr == null || arr.length <=1){
            return;
        }
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        
        arr[arr.length-1] = temp;
        
    }
	public static void main(String[] args) {
	    
	    int arr[] = {1,2,5,7,8,2};
	    
	    
	    System.out.println("The original Array is " + Arrays.toString(arr));
	    rotateShiftArray(arr);
		System.out.println("The Shifted Array is " + Arrays.toString(arr));
	}
}

4.
-------------------------#Left Shift K elements in the arrray--------------------------------------------------------------------
	import java.util.Arrays;
public class Main
{
    public static void rotateShift(int arr[], int k){
        int n = arr.length;
        if(n == 0 || n ==1 ){
            return ;
        }
         k = k % n;
         if(k==0){
             return;
         }
         
         reverse(arr, 0, k-1);
         reverse(arr, k, n-1);
         reverse(arr, 0, n-1);
    }
    public static void reverse(int arr[], int start, int end){
        while(start < end){
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
    
	public static void main(String[] args) {
	    
	    int arr[] = {1,2,3,4,5,6};
	    int k = 3;
	    
		System.out.println("Original array: " + Arrays.toString(arr));
		rotateShift(arr, k);
		System.out.println("Rotated Array: " + Arrays.toString(arr));
	
	}
}

5.
---------------------------------------------------------------------#Reverse an array---------------------------------------------------------------------------

	import java.util.*;

public class Main {
    public static void main(String[] args) {

      int arr[] = {1,2,3,4,5,6};
      int n = arr.length;
      int right = n-1;
      int left = 0;

      while(left<right){
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        left++;
        right--;
        // System.out.print(arr[i]);

      }
      for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
    }
}
}


6.
-------------------------------------#Check-if-Palindrome------------------------------------------------------


	import java.util.*;

public class Main {
    public static void main(String[] args) {

      int arr[] = {1,2,3,2,1};
      

    boolean result = isPalindrome(arr);
    System.out.println("It is a palindrome " + result);
      
    }

    public static boolean isPalindrome(int arr[]){
      int n = arr.length;
      int right = n-1;
      int left = 0;

      while(left<right){
        int temp = arr[right];
        if(arr[right] != arr[left]){
          return false;
        };
        left++;
        right--;
        // System.out.print(arr[i]);

      }
      return true;
    
            // System.out.print(arr[i] + " ");
    
}
}


7.
---------------------------------#Move zeros to end of the array--------------------------------------------------------------

	import java.util.Arrays;
public class Main
{
    
    public static void reverseArray(int arr[]){
  int n = arr.length;
  int j =0;
  
  for(int i=0; i<n; i++){
      if(arr[i] != 0){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp; 
          j++;
      }
  }
  for(int num : arr){
      System.out.println(num);
  }
    }
	public static void main(String[] args) {
		
		
		int arr[] = {0, 0, 12,0,56,0,78,99,100,};
		reverseArray(arr);
		System.out.println("The reversed array is " + Arrays.toString(arr));
		
	}
}

8.
------------------------------------#Remove the duplicates in the sorted array and print the same----------------------- 

	import java.util.Arrays;
public class Main
{
    
    public static int removeDuplicates(int arr[]){
        int n = arr.length;
        int j = 0;
        
        if(n == 0){
            return 0;
        }
        
        for(int i = 1; i< n; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
 
    }
	public static void main(String[] args) {
		
		
		int arr[] = {12, 12,56,78,78,99,100};
		int uniqueCount = removeDuplicates(arr);
		System.out.print("The Array without duplicates is: [ " );
		for(int i=0; i< uniqueCount; i++){
		    System.out.print(arr[i] + (i < uniqueCount - 1 ? " , " : ""));
		    
		}
		System.out.print("]");
		
	}
}


8.
