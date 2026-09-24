//Find the the second largest element in an Array

// Brute force approach
-At first we are going to sort the array in an ascending order.
 -Then we are going to return the element in an array which is at the location arr[n-1] if we are starting from i=1.
  -And then we are goinn to compare the largest element with the second largest element if(largest == secondLargest then traverse the array from the end of the array and get the element which is less than the largest element.)

 -----------------------------------------------------------#Second Largest Element in the Array------------------------------------------------------------------------------------------------------------------------

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


----------------------------------------------------------#Maximum Number of Consecutive Ones in an Array--------------------------------------------------------------------


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


----------------------------------------------------------# Left Shift the array by 1 element------------------------------------------------------------------------

	*******************************************************************************/
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

