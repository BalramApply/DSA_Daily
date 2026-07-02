/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐*
 * │  #1  [12/06/26] → #2  [13/06/26] → #3  [14/06/26]                    │
 * │  #4  [15/06/26] → #5  [16/06/26] → #6  [17/06/26]                    │
 * │  #7  [18/06/26] → #8  [19/06/26] → #9  [20/06/26]                    │
 * │  #10 [21/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 57: Calculate the Sum of Even and Odd Numbers Separately     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Continuously accept integers from the user and maintain separate    │
 * │ sums for even and odd numbers. After the user chooses to stop,      │
 * │ display the total sum of even numbers and the total sum of odd      │
 * │ numbers entered.                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 2, 5, 8, 7                                                 │
 * │ Choice : 1, 1, 1, 0                                                 │
 * │ Output :                                                            │
 * │ SUM OF EVEN NUMBERS : 10                                            │
 * │ SUM OF ODD NUMBERS  : 12                                            │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Even numbers (2 + 8) = 10                                           │
 * │ Odd numbers (5 + 7) = 12                                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • User can enter any integer value.                                 │
 * │ • Enter 1 to continue entering numbers.                             │
 * │ • Enter 0 to terminate the program.                                 │
 * │ • Even and odd sums are maintained separately.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize evenSum and oddSum to 0.                        │
 * │ Step 2 : Read an integer from the user.                             │
 * │ Step 3 : Check whether the number is even or odd.                   │
 * │ Step 4 : Add it to the corresponding sum.                           │
 * │ Step 5 : Ask the user whether to continue or exit.                  │
 * │ Step 6 : Repeat while the choice is 1.                              │
 * │ Step 7 : Print both accumulated sums after the loop ends.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 2 → evenSum = 2,  oddSum = 0                                │
 * │ Input : 5 → evenSum = 2,  oddSum = 5                                │
 * │ Input : 8 → evenSum = 10, oddSum = 5                                │
 * │ Input : 7 → evenSum = 10, oddSum = 12                               │
 * │ Choice = 0 → Stop                                                   │
 * │ Output : Even = 10, Odd = 12                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration + Conditional Accumulation (Do-While Loop)                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │                    n = number of integers entered by the user.      │
 * │                    Each input is processed once.                    │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses only constant extra variables.              │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Odd_Even_Sum {
    public static void main(String args[]){
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 57: Calculate the Sum of Even and Odd Numbers Separately     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Continuously accept integers from the user and maintain separate    │
 * │ sums for even and odd numbers. After the user chooses to stop,      │
 * │ display the total sum of even numbers and the total sum of odd      │
 * │ numbers entered.                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 2, 5, 8, 7                                                 │
 * │ Choice : 1, 1, 1, 0                                                 │
 * │ Output :                                                            │
 * │ SUM OF EVEN NUMBERS : 10                                            │
 * │ SUM OF ODD NUMBERS  : 12                                            │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Even numbers (2 + 8) = 10                                           │
 * │ Odd numbers (5 + 7) = 12                                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • User can enter any integer value.                                 │
 * │ • Enter 1 to continue entering numbers.                             │
 * │ • Enter 0 to terminate the program.                                 │
 * │ • Even and odd sums are maintained separately.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize evenSum and oddSum to 0.                        │
 * │ Step 2 : Read an integer from the user.                             │
 * │ Step 3 : Check whether the number is even or odd.                   │
 * │ Step 4 : Add it to the corresponding sum.                           │
 * │ Step 5 : Ask the user whether to continue or exit.                  │
 * │ Step 6 : Repeat while the choice is 1.                              │
 * │ Step 7 : Print both accumulated sums after the loop ends.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 2 → evenSum = 2,  oddSum = 0                                │
 * │ Input : 5 → evenSum = 2,  oddSum = 5                                │
 * │ Input : 8 → evenSum = 10, oddSum = 5                                │
 * │ Input : 7 → evenSum = 10, oddSum = 12                               │
 * │ Choice = 0 → Stop                                                   │
 * │ Output : Even = 10, Odd = 12                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration + Conditional Accumulation (Do-While Loop)                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │                    n = number of integers entered by the user.      │
 * │                    Each input is processed once.                    │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses only constant extra variables.              │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/* ╔══════════════════════════════════════════════════════════════════════╗

* ║ import java.util.Scanner;                                            ║
* ║ public class Odd_Even_Sum {                                          ║
* ║     public static void main(String args[]){                          ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║         int number;                                                  ║
* ║         int choice;                                                  ║
* ║         int evenSum = 0;                                             ║
* ║         int oddSum = 0;                                              ║
* ║                                                                      ║
* ║         do{                                                          ║
* ║             System.out.print("ENTER THE INTEGER :");                 ║
* ║             number = sc.nextInt();                                   ║
* ║                                                                      ║
* ║             if(number % 2 == 0){                                     ║
* ║                 evenSum += number;                                   ║
* ║             } else {                                                 ║
* ║                 oddSum += number;                                    ║
* ║             }                                                        ║
* ║                                                                      ║
* ║             System.out.print("ENTER 0 FOR EXIT AND 1 TO CONTINUE: ");║
* ║             choice = sc.nextInt();                                   ║
* ║         } while(choice == 1);                                        ║
* ║                                                                      ║
* ║         System.out.println("SUM OF EVEN NUMBERS : " + evenSum);      ║
* ║         System.out.print("SUM OF ODD NUMBERS : " + oddSum);          ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
