/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [16/06/26] → #2  [17/06/26] → #3  [18/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 76: Find the Sum of Digits of a Number                       ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a positive integer n, calculate and return the sum of all     │
 * │ its digits.                                                         │
 * │ Each digit is extracted individually and added to a running total.  │
 * │ Input: A positive integer. Output: Sum of its digits.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 1234                                                       │
 * │ Output : 10                                                         │
 * │ Explanation : 1 + 2 + 3 + 4 = 10                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n should be a non-negative integer.                                 │
 * │ Digits are processed from right to left.                            │
 * │ The number must fit within the integer range.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize sumOfDigit to 0.                                │
 * │ Step 2 : Extract the last digit using n % 10.                       │
 * │ Step 3 : Add the extracted digit to sumOfDigit.                     │
 * │ Step 4 : Remove the last digit using n /= 10.                       │
 * │ Step 5 : Repeat until n becomes 0.                                  │
 * │ Step 6 : Return the final sum.                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematics | Number Manipulation | Digit Extraction                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 567                                                         │
 * │ sum = 0                                                             │
 * │ Digit = 7 → sum = 7                                                 │
 * │ Digit = 6 → sum = 13                                                │
 * │ Digit = 5 → sum = 18                                                │
 * │ Output : 18                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(log₁₀n)                                        │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Sum_of_Digit {
    

    public static void main(String args[]){
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 76: Find the Sum of Digits of a Number                       ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a positive integer n, calculate and return the sum of all     │
 * │ its digits.                                                         │
 * │ Each digit is extracted individually and added to a running total.  │
 * │ Input: A positive integer. Output: Sum of its digits.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 1234                                                       │
 * │ Output : 10                                                         │
 * │ Explanation : 1 + 2 + 3 + 4 = 10                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n should be a non-negative integer.                                 │
 * │ Digits are processed from right to left.                            │
 * │ The number must fit within the integer range.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize sumOfDigit to 0.                                │
 * │ Step 2 : Extract the last digit using n % 10.                       │
 * │ Step 3 : Add the extracted digit to sumOfDigit.                     │
 * │ Step 4 : Remove the last digit using n /= 10.                       │
 * │ Step 5 : Repeat until n becomes 0.                                  │
 * │ Step 6 : Return the final sum.                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematics | Number Manipulation | Digit Extraction                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 567                                                         │
 * │ sum = 0                                                             │
 * │ Digit = 7 → sum = 7                                                 │
 * │ Digit = 6 → sum = 13                                                │
 * │ Digit = 5 → sum = 18                                                │
 * │ Output : 18                                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(log₁₀n)                                        │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║                                                                      ║
* ║ public class Sum_of_Digit {                                          ║
* ║     public static int digitSum(int n){                               ║
* ║         int sumOfDigit = 0;                                          ║
* ║                                                                      ║
* ║         while(n > 0){                                                ║
* ║             int lastDigit = n % 10;                                  ║
* ║             sumOfDigit += lastDigit;                                 ║
* ║             n /= 10;                                                 ║
* ║         }                                                            ║
* ║         return sumOfDigit;                                           ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String args[]){                          ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║                                                                      ║
* ║         System.out.print("ENTER THE NUMBER :");                      ║
* ║         int digit = sc.nextInt();                                    ║
* ║         System.out.println("SUM OF DIGIT IS :" + digitSum(digit));   ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace for digit = 345:                          ║
* ║                                                                      ║
* ║  Iter |   n   |  lastDigit (n % 10)  |  sumOfDigit (sum + lastDigit) ║
* ║  -----|-------|----------------------|-----------------------------  ║
* ║   1   |  345  |         5            |      0 + 5 = 5                ║
* ║   2   |   34  |         4            |      5 + 4 = 9                ║
* ║   3   |    3  |         3            |      9 + 3 = 12               ║
* ║   4   |    0  |  Loop terminates (n > 0 evaluates to false)          ║
* ║                                                                      ║
* ║  Output:                                                             ║
* ║  SUM OF DIGIT IS :12                                                 ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Key Concepts Applied:                                               ║
* ║  - Modulo Operator (% 10): Extracts the rightmost digit of a number. ║
* ║  - Integer Division (/= 10): Chops off the rightmost digit from the  ║
* ║    number, driving the condition toward termination.                 ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
