/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [02/06/26] → #2  [03/06/26] → #3  [04/06/26]                    │
 * │  #4  [05/06/26] → #5  [06/06/26] → #6  [07/06/26]                    │
 * │  #7  [08/06/26] → #8  [09/06/26] → #9  [10/00/00]                    │
 * │  #10 [11/00/00]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 07: Addition of Two User Input Numbers                       ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read two integers from the user through the console, calculate      │
 * │ their sum, and display the result.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 1 2                                                        │
 * │ Output : Sum: 3                                                     │
 * │                                                                     │
 * │ Explanation : 1 + 2 = 3                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Inputs must be valid integers.                                      │
 * │ Values should be within the range of the int data type.             │
 * │ Scanner object should be closed after use.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for user input.                    │
 * │ Step 2 : Read the first integer from the user.                      │
 * │ Step 3 : Read the second integer from the user.                     │
 * │ Step 4 : Add both integers using the '+' operator.                  │
 * │ Step 5 : Store the result in a variable.                            │
 * │ Step 6 : Print the calculated sum.                                  │
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
public class Sum {
    public static void main(String[] args) {
        
    }
}

/* ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 08: Addition of Two User Input Numbers                       ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read two integers from the user through the console, calculate      │
 * │ their sum, and display the result.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 1 2                                                        │
 * │ Output : Sum: 3                                                     │
 * │                                                                     │
 * │ Explanation : 1 + 2 = 3                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Inputs must be valid integers.                                      │
 * │ Values should be within the range of the int data type.             │
 * │ Scanner object should be closed after use.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for user input.                    │
 * │ Step 2 : Read the first integer from the user.                      │
 * │ Step 3 : Read the second integer from the user.                     │
 * │ Step 4 : Add both integers using the '+' operator.                  │
 * │ Step 5 : Store the result in a variable.                            │
 * │ Step 6 : Print the calculated sum.                                  │
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
* ║ import java.util.Scanner;                                            ║
* ║                                                                      ║
* ║ public class Sum {                                                   ║
* ║     public static void main(String[] args) {                         ║
* ║         // Create a Scanner object to take user input                ║
* ║         Scanner scanner = new Scanner(System.in);                    ║
* ║                                                                      ║
* ║         // Prompt the user for input                                 ║
* ║         System.out.print("Enter first number: ");                    ║
* ║         int firstNumber = scanner.nextInt();                         ║
* ║                                                                      ║
* ║         System.out.print("Enter second number: ");                   ║
* ║         int secondNumber = scanner.nextInt();                        ║
* ║                                                                      ║
* ║         // Calculate the sum                                         ║
* ║         int sum = firstNumber + secondNumber;                        ║
* ║                                                                      ║
* ║         // Display the result                                        ║
* ║         System.out.println("Sum: " + sum);                           ║
* ║                                                                      ║
* ║         // Close the scanner                                         ║
* ║         scanner.close();                                             ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
