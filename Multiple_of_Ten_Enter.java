/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [11/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 52: Continue Input Until a Multiple of 10 is Entered         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Continuously accept integer input from the user until a number      │
 * │ divisible by 10 is entered.                                         │
 * │ Print every non-multiple of 10 and terminate the loop immediately   │
 * │ when a multiple of 10 is encountered.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 5, 23, 40                                                  │
 * │ Output :                                                            │
 * │ 5                                                                   │
 * │ 23                                                                  │
 * │ Explanation :                                                       │
 * │ 5 and 23 are printed because they are not divisible by 10.          │
 * │ When 40 is entered, the loop terminates without printing it.        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • User may enter any integer value.                                 │
 * │ • Loop continues indefinitely until n % 10 == 0.                    │
 * │ • A multiple of 10 is not printed before termination.               │
 * │ • Input is accepted using the Scanner class.                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for user input.                    │
 * │ Step 2 : Use an infinite do-while loop to repeatedly read input.    │
 * │ Step 3 : Check whether the entered number is divisible by 10.       │
 * │ Step 4 : If divisible, execute break to terminate the loop.         │
 * │ Step 5 : Otherwise, print the number and continue taking input.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration + Conditional Loop Termination (Do-While + Break)         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(k)                                             │
 * │                    where k is the number of user inputs before      │
 * │                    entering the first multiple of 10.               │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Multiple_of_Ten_Enter {
    public static void main(String args[]){
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 52: Continue Input Until a Multiple of 10 is Entered         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Continuously accept integer input from the user until a number      │
 * │ divisible by 10 is entered.                                         │
 * │ Print every non-multiple of 10 and terminate the loop immediately   │
 * │ when a multiple of 10 is encountered.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 5, 23, 40                                                  │
 * │ Output :                                                            │
 * │ 5                                                                   │
 * │ 23                                                                  │
 * │ Explanation :                                                       │
 * │ 5 and 23 are printed because they are not divisible by 10.          │
 * │ When 40 is entered, the loop terminates without printing it.        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • User may enter any integer value.                                 │
 * │ • Loop continues indefinitely until n % 10 == 0.                    │
 * │ • A multiple of 10 is not printed before termination.               │
 * │ • Input is accepted using the Scanner class.                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for user input.                    │
 * │ Step 2 : Use an infinite do-while loop to repeatedly read input.    │
 * │ Step 3 : Check whether the entered number is divisible by 10.       │
 * │ Step 4 : If divisible, execute break to terminate the loop.         │
 * │ Step 5 : Otherwise, print the number and continue taking input.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration + Conditional Loop Termination (Do-While + Break)         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(k)                                             │
 * │                    where k is the number of user inputs before      │
 * │                    entering the first multiple of 10.               │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║ public class Multiple_of_Ten_Enter {                                 ║
* ║     public static void main(String args[]){                          ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║         do{                                                          ║
* ║             System.out.print("ENTER THE NUMBER :");                  ║
* ║             int n = sc.nextInt();                                    ║
* ║             if(n % 10 == 0){                                         ║
* ║                 break;                                               ║
* ║             }                                                        ║
* ║             System.out.println(n);                                   ║
* ║         }while(true);                                                ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
