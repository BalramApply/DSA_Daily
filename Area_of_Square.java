/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [03/06/26] → #2  [04/06/26] → #3  [05/06/26]                    │
 * │  #4  [06/06/26] → #5  [07/06/26] → #6  [08/06/26]                    │
 * │  #7  [09/06/26] → #8  [10/06/26] → #9  [11/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 14: Area of a Square                                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read the side length of a square from the user, calculate its       │
 * │ area using the formula Area = side × side, and display the result.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : side = 4                                                   │
 * │ Output : Area of the square: 16                                     │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Area = side × side                                                  │
 * │      = 4 × 4                                                        │
 * │      = 16                                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Side length must be a non-negative integer.                         │
 * │ Input should be within the valid range of the int data type.        │
 * │ Scanner object should be closed after use.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for user input.                    │
 * │ Step 2 : Read the side length of the square.                        │
 * │ Step 3 : Calculate area using side × side.                          │
 * │ Step 4 : Store the calculated area in a variable.                   │
 * │ Step 5 : Print the area of the square.                              │
 * │ Step 6 : Close the Scanner object.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematical Formula / Geometry Calculation                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Area_of_Square {
    public static void main(String[] args) {
        
    }
}
/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 14: Area of a Square                                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read the side length of a square from the user, calculate its       │
 * │ area using the formula Area = side × side, and display the result.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : side = 4                                                   │
 * │ Output : Area of the square: 16                                     │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Area = side × side                                                  │
 * │      = 4 × 4                                                        │
 * │      = 16                                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Side length must be a non-negative integer.                         │
 * │ Input should be within the valid range of the int data type.        │
 * │ Scanner object should be closed after use.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for user input.                    │
 * │ Step 2 : Read the side length of the square.                        │
 * │ Step 3 : Calculate area using side × side.                          │
 * │ Step 4 : Store the calculated area in a variable.                   │
 * │ Step 5 : Print the area of the square.                              │
 * │ Step 6 : Close the Scanner object.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematical Formula / Geometry Calculation                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.*;                                                  ║
* ║ public class Area_of_Square {                                        ║
* ║     public static void main(String[] args) {                         ║
* ║         Scanner sc = new Scanner(System.in); // Create Scanner object║
* ║                                                                      ║
* ║         // Prompting the user for input                              ║
* ║         System.out.print("Enter the side length of the square: ");   ║
* ║                                                                      ║
* ║         // Taking integer input for the side of the square           ║
* ║         int side = sc.nextInt();                                     ║
* ║                                                                      ║
* ║         // Calculating the area of the square                        ║
* ║         int area = side * side;                                      ║
* ║                                                                      ║
* ║         // Displaying the area                                       ║
* ║         System.out.println("Area of the square: " + area);           ║
* ║                                                                      ║
* ║         sc.close(); // Closing the Scanner to prevent resource leak  ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
