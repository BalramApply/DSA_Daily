/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [03/06/26] → #2  [04/06/26] → #3  [05/06/26]                    │
 * │  #4  [06/06/26] → #5  [07/06/26] → #6  [08/06/26]                    │
 * │  #7  [09/06/26] → #8  [10/06/26] → #9  [11/06/26]                    │
 * │  #10 [12/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 13: Average of Three Numbers                                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read three numbers from the user, calculate their arithmetic        │
 * │ average, and display the result on the console.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : A = 10, B = 20, C = 30                                     │
 * │ Output : Average: 20                                                │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Average = (10 + 20 + 30) / 3                                        │
 * │         = 60 / 3                                                    │
 * │         = 20                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Inputs must be valid integers.                                      │
 * │ Values should be within the range of the int data type.             │
 * │ Integer division may truncate decimal values.                       │
 * │ Scanner object should be closed after use.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for user input.                    │
 * │ Step 2 : Read three integer values from the user.                   │
 * │ Step 3 : Add all three numbers together.                            │
 * │ Step 4 : Divide the sum by 3 to calculate the average.              │
 * │ Step 5 : Store the result in a variable.                            │
 * │ Step 6 : Print the calculated average.                              │
 * │ Step 7 : Close the Scanner object.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Input / Output Handling + Arithmetic Operations                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 13: Average of Three Numbers                                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read three numbers from the user, calculate their arithmetic        │
 * │ average, and display the result on the console.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : A = 10, B = 20, C = 30                                     │
 * │ Output : Average: 20                                                │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Average = (10 + 20 + 30) / 3                                        │
 * │         = 60 / 3                                                    │
 * │         = 20                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Inputs must be valid integers.                                      │
 * │ Values should be within the range of the int data type.             │
 * │ Integer division may truncate decimal values.                       │
 * │ Scanner object should be closed after use.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for user input.                    │
 * │ Step 2 : Read three integer values from the user.                   │
 * │ Step 3 : Add all three numbers together.                            │
 * │ Step 4 : Divide the sum by 3 to calculate the average.              │
 * │ Step 5 : Store the result in a variable.                            │
 * │ Step 6 : Print the calculated average.                              │
 * │ Step 7 : Close the Scanner object.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Input / Output Handling + Arithmetic Operations                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.*;                                                  ║
* ║ public class Average {                                               ║
* ║     public static void main(String[] args) {                         ║
* ║         Scanner sc = new Scanner(System.in); // Create Scanner object║
* ║                                                                      ║
* ║         // Taking three integer inputs from the user                 ║
* ║         System.out.print("Enter first number: ");                    ║
* ║         int a = sc.nextInt();                                        ║
* ║                                                                      ║
* ║         System.out.print("Enter second number: ");                   ║
* ║         int b = sc.nextInt();                                        ║
* ║                                                                      ║
* ║         System.out.print("Enter third number: ");                    ║
* ║         int c = sc.nextInt();                                        ║
* ║                                                                      ║
* ║         // Calculating the average                                   ║
* ║         int avg = (a + b + c) / 3;                                   ║
* ║                                                                      ║
* ║         // Displaying the average                                    ║
* ║         System.out.println("Average: " + avg);                       ║
* ║                                                                      ║
* ║         sc.close(); // Closing the Scanner to prevent resource leak  ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
