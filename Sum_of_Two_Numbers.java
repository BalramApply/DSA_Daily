/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [13/06/26] → #2  [14/06/26] → #3  [15/06/26]                    │
 * │  #4  [16/06/26] → #5  [17/06/26] → #6  [18/06/26]                    │
 * │  #7  [19/06/26] → #8  [20/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 62: Calculate the Sum of Two Numbers Using a Function        ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read two integers from the user, pass them to a function, and       │
 * │ return their sum. Display the returned result in the main() method. │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  :                                                            │
 * │ 5                                                                   │
 * │ 7                                                                   │
 * │                                                                     │
 * │ Output :                                                            │
 * │ SUM IS : 12                                                         │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ The function receives 5 and 7, computes their sum (12),             │
 * │ returns it to main(), and the result is printed.                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Both inputs must be integers.                                     │
 * │ • The function must return the computed sum.                        │
 * │ • No additional data structures are required.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Define a function calculate(int num1, int num2).           │
 * │ Step 2 : Add the two numbers inside the function.                   │
 * │ Step 3 : Return the computed sum.                                   │
 * │ Step 4 : Read two integers in main() using Scanner.                 │
 * │ Step 5 : Call calculate() with the input values.                    │
 * │ Step 6 : Store and print the returned result.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : a = 5, b = 7                                                │
 * │ calculate(5, 7)                                                     │
 * │ → sum = 5 + 7 = 12                                                  │
 * │ → Return 12                                                         │
 * │ main() prints : SUM IS : 12                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Function Call + Arithmetic Computation                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    Performs one addition operation.                 │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Sum_of_Two_Numbers {
    
    public static void main(String args[]){
      
    }
}
/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 62: Calculate the Sum of Two Numbers Using a Function        ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read two integers from the user, pass them to a function, and       │
 * │ return their sum. Display the returned result in the main() method. │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  :                                                            │
 * │ 5                                                                   │
 * │ 7                                                                   │
 * │                                                                     │
 * │ Output :                                                            │
 * │ SUM IS : 12                                                         │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ The function receives 5 and 7, computes their sum (12),             │
 * │ returns it to main(), and the result is printed.                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Both inputs must be integers.                                     │
 * │ • The function must return the computed sum.                        │
 * │ • No additional data structures are required.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Define a function calculate(int num1, int num2).           │
 * │ Step 2 : Add the two numbers inside the function.                   │
 * │ Step 3 : Return the computed sum.                                   │
 * │ Step 4 : Read two integers in main() using Scanner.                 │
 * │ Step 5 : Call calculate() with the input values.                    │
 * │ Step 6 : Store and print the returned result.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : a = 5, b = 7                                                │
 * │ calculate(5, 7)                                                     │
 * │ → sum = 5 + 7 = 12                                                  │
 * │ → Return 12                                                         │
 * │ main() prints : SUM IS : 12                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Function Call + Arithmetic Computation                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    Performs one addition operation.                 │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║ public class Sum_of_Two_Numbers {                                    ║
* ║     public static int calculate(int num1, int num2){                 ║
* ║         int sum = num1 + num2;                                       ║
* ║         return sum;                                                  ║
* ║     }                                                                ║
* ║     public static void main(String args[]){                          ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║         int a = sc.nextInt();                                        ║
* ║         int b = sc.nextInt();                                        ║
* ║                                                                      ║
* ║         int sum = calculate(a, b);                                   ║
* ║         System.out.println("SUM IS :"+sum);                          ║
* ║         // Note: Takes two inputs, passes them to calculate method,  ║
* ║         // and returns their arithmetic sum correctly.               ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/