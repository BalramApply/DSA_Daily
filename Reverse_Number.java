/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [10/06/26] → #2  [11/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 49: Reverse an Integer Number Using Digit Extraction         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a positive integer, reverse its digits and print the          │
 * │ resulting number.                                                   │
 * │ Repeatedly extract the last digit until the original number         │
 * │ becomes zero, then return/print the reversed number.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ─────────────────────────────────────────────────────────┐
 * │ Input  : 2783                                                      │
 * │ Output : 3872                                                      │
 * │ Explanation :                                                      │
 * │ 2783 → 3 → rev = 3                                                 │
 * │ 278  → 8 → rev = 38                                                │
 * │ 27   → 7 → rev = 387                                               │
 * │ 2    → 2 → rev = 3872                                              │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ─────────────────────────────────────────────────────┐
 * │ • Input should be a positive integer.                              │
 * │ • Process digits until the number becomes zero.                    │
 * │ • Uses integer arithmetic (%, /, *).                               │
 * │ • Extra space should remain constant.                              │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ──────────────────────────────────────────────────┐
 * │ Step 1 : Initialize rev = 0.                                       │
 * │ Step 2 : Extract the last digit using n % 10.                      │
 * │ Step 3 : Append the digit to rev using rev = rev * 10 + digit.     │
 * │ Step 4 : Remove the last digit using n = n / 10.                   │
 * │ Step 5 : Repeat until n becomes 0 and print rev.                   │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iterative Algorithm (Digit Extraction using While Loop)             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(d)                                             │
 * │                     where d = number of digits in the integer.      │
 * │ Space Complexity : O(1)                                             │
 * │                     Uses only a constant number of variables.       │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Reverse_Number {
    public static void main(String args[]){
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 49: Reverse an Integer Number Using Digit Extraction         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a positive integer, reverse its digits and print the          │
 * │ resulting number.                                                   │
 * │ Repeatedly extract the last digit until the original number         │
 * │ becomes zero, then return/print the reversed number.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ─────────────────────────────────────────────────────────┐
 * │ Input  : 2783                                                      │
 * │ Output : 3872                                                      │
 * │ Explanation :                                                      │
 * │ 2783 → 3 → rev = 3                                                 │
 * │ 278  → 8 → rev = 38                                                │
 * │ 27   → 7 → rev = 387                                               │
 * │ 2    → 2 → rev = 3872                                              │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ─────────────────────────────────────────────────────┐
 * │ • Input should be a positive integer.                              │
 * │ • Process digits until the number becomes zero.                    │
 * │ • Uses integer arithmetic (%, /, *).                               │
 * │ • Extra space should remain constant.                              │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ──────────────────────────────────────────────────┐
 * │ Step 1 : Initialize rev = 0.                                       │
 * │ Step 2 : Extract the last digit using n % 10.                      │
 * │ Step 3 : Append the digit to rev using rev = rev * 10 + digit.     │
 * │ Step 4 : Remove the last digit using n = n / 10.                   │
 * │ Step 5 : Repeat until n becomes 0 and print rev.                   │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iterative Algorithm (Digit Extraction using While Loop)             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(d)                                             │
 * │                     where d = number of digits in the integer.      │
 * │ Space Complexity : O(1)                                             │
 * │                     Uses only a constant number of variables.       │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Reverse_Number {                                        ║
* ║     public static void main(String args[]){                          ║
* ║         int rev = 0;                                                 ║
* ║         int n = 2783;                                                ║
* ║         while(n > 0){                                                ║
* ║             int lastDigit = n%10;                                    ║
* ║             rev = (rev*10)+lastDigit;                                ║
* ║             n /= 10;                                                 ║
* ║         }                                                            ║
* ║         System.out.println("REVERSE NUMBER IS :"+rev);               ║
* ║         // Ans: REVERSE NUMBER IS :3872                              ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/