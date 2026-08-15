#two right angled triangles facing each others having 1-4 numbers------------------------------------------------------------------------
ex.
1      1
12    12
123  123
12341234
  
public class NumberPattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) { //taking care of the number of rows we are printing in thsi case there are 4 rows
            // 1. Print the left-side numbers from 1 to i
            for (int j = 1; j <= i; j++) { // here we took care of the numers that are goin to be print from 1 to 4, if taken n in place of i it won't work.
                System.out.print(j);
            }

            // 2. Print the decreasing spaces between the two sets of numbers
            int spaces = 2 * (n - i); // This is the formula to print spaces in the fassion of decreasing order less by 2 
            for (int j = 1; j <= spaces; j++) { // here acutually we printed spaces in between
                System.out.print(" ");
            }

            // 3. Print the right-side numbers from 1 to i
            for (int j = 1; j <= i; j++) { // again printing the right sideed numbers in the inverted right angled triangle.
                System.out.print(j);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

#Prints the pattern like a right angled triangle with numbers from 1 to n --------------------------------------------------------------------------
  ex. 
  1 
  2 3
  4 5 6
  7 8 9 10

  public class NumberPattern {
    public static void main(String[] args) {
        int n = 4; //declared the int n to run the loop four times , it doesn't matter you start with 1 or 4
        int num = 1; // declared the starting number from the number is going to start.

    
    for(int i=0; i<=n; i++){ // outer loop that defines the number of rows in a right angled triangle.
        for(int j=1; j<=i; j++){ // the inner loop that defines 
            System.out.print(num + " ");
            num += 1;
        }
        System.out.println();
    }
}
}

#Printing the ABCD triangle starting from A ----------------------------------------------------------------------------------------------------------
  ex.
  A
  B C
  D E F
  G H I J

  public class NumberPattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows

    
    for(int i=0; i<=n; i++){
      for(char ch='A';ch <= 'A'+i; ch++){
        System.out.print(ch+ " ");
      }
        System.out.println();
    }
    }
}


#Printing the ABCD triangle starting from J to A basically invert of the above pattern-----------------------------------------------------------------------
 ex. 
  J I H G
  F E D
  B C
  A

  public class NumberPattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows

    
    for(int i=n; i>=0; i--){ // this loop is used to print the the inverted triangle it does not engage with any of the printing 
      for(char ch='A';ch <= 'A'+i; ch++){ // this loop prints the characters from A to G cuz only 4 rows are we printing 
        System.out.print(ch+ " "); //This prints character and spaces
      }
        System.out.println();
    }
    }
}

#Printing the following pattern ---------------------------------------------------------------------------------------------------
  ex.
  A
  B B
  C C C
  D D D D
  E E E E E


  public class NumberPattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 0; i <= n; i++) {
            char ch = (char) ('A' + i); // Note: Type casting 'A' + i to char
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

#Printing the following pattern
  ex.

  import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        // Upper half (including the middle tip)
        for (int i = 0; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half (mirroring the upper half)
        for (int i = n - 1; i >= 0; i--) {
            // Left stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
  


  
