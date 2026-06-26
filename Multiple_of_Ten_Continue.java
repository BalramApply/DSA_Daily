/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [11/06/26] → #2  [12/06/26] → #3  [13/06/26]                    │
 * │  #4  [14/06/26] → #5  [15/06/26] → #6  [16/06/26]                    │
 * │  #7  [17/06/26] → #8  [18/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 54: Print User Input Except Multiples of 10                  ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Continuously accept integer input from the user.                    │
 * │ Print each entered number unless it is a multiple of 10.            │
 * │ Use the continue statement to skip printing multiples of 10 while   │
 * │ allowing the loop to continue accepting further input.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 5                                                          │
 * │ Output : number was : 5                                             │
 * │                                                                     │
 * │ Input  : 10                                                         │
 * │ Output : (No output)                                                │
 * │                                                                     │
 * │ Input  : 27                                                         │
 * │ Output : number was : 27                                            │
 * │                                                                     │
 * │ Explanation : Multiples of 10 are skipped using the continue        │
 * │ statement, while all other numbers are printed.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • User may enter any integer value.                                 │
 * │ • Program runs indefinitely using do-while(true).                   │
 * │ • Must use the continue statement.                                  │
 * │ • Multiples of 10 must not be printed.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object to read user input.                │
 * │ Step 2 : Use an infinite do-while loop.                             │
 * │ Step 3 : Read an integer from the user.                             │
 * │ Step 4 : Check if the number is divisible by 10.                    │
 * │ Step 5 : If divisible, execute continue to skip printing.           │
 * │ Step 6 : Otherwise, print the entered number.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration + Conditional Continue (Do-While Loop)                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(k)                                             │
 * │                    where k is the number of user inputs processed.  │
 * │                    Each iteration performs constant-time work.      │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;

public class Multiple_of_Ten_Continue {
    public static void main(String args[]){
       
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 54: Print User Input Except Multiples of 10                  ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Continuously accept integer input from the user.                    │
 * │ Print each entered number unless it is a multiple of 10.            │
 * │ Use the continue statement to skip printing multiples of 10 while   │
 * │ allowing the loop to continue accepting further input.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 5                                                          │
 * │ Output : number was : 5                                             │
 * │                                                                     │
 * │ Input  : 10                                                         │
 * │ Output : (No output)                                                │
 * │                                                                     │
 * │ Input  : 27                                                         │
 * │ Output : number was : 27                                            │
 * │                                                                     │
 * │ Explanation : Multiples of 10 are skipped using the continue        │
 * │ statement, while all other numbers are printed.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • User may enter any integer value.                                 │
 * │ • Program runs indefinitely using do-while(true).                   │
 * │ • Must use the continue statement.                                  │
 * │ • Multiples of 10 must not be printed.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object to read user input.                │
 * │ Step 2 : Use an infinite do-while loop.                             │
 * │ Step 3 : Read an integer from the user.                             │
 * │ Step 4 : Check if the number is divisible by 10.                    │
 * │ Step 5 : If divisible, execute continue to skip printing.           │
 * │ Step 6 : Otherwise, print the entered number.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration + Conditional Continue (Do-While Loop)                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(k)                                             │
 * │                    where k is the number of user inputs processed.  │
 * │                    Each iteration performs constant-time work.       │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║ public class Multiple_of_Ten_Continue {                              ║
* ║     public static void main(String args[]){                          ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║         do{                                                          ║
* ║             System.out.print("ENTER THE NUMBER :");                  ║
* ║             int n = sc.nextInt();                                    ║
* ║             if(n % 10 == 0){                                         ║
* ║                 continue;                                            ║
* ║             }                                                        ║
* ║             System.out.println("number was :"+ n);                   ║
* ║         }while(true);                                                ║
* ║         // Ans: Skips printing for multiples of 10, keeps looping    ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/