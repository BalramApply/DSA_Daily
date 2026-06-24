/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [15/06/26] → #2  [16/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 74: Check Whether a Number is a Palindrome                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer, determine whether it is a palindrome.             │
 * │ A palindrome number reads the same forward and backward.            │
 * │ Input: A single integer. Output: true if palindrome, else false.    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 121                                                        │
 * │ Output : true                                                       │
 * │ Explanation : Reversing 121 gives 121, which is equal to the        │
 * │ original number. Hence, it is a palindrome.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Input should be a valid integer.                                    │
 * │ The algorithm reverses the number digit by digit.                   │
 * │ Negative numbers are not handled explicitly in this implementation. │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Store the original number in a temporary variable.         │
 * │ Step 2 : Initialize reverse as 0.                                   │
 * │ Step 3 : Extract the last digit using modulo (%) operation.         │
 * │ Step 4 : Build the reversed number by multiplying reverse by 10     │
 * │          and adding the extracted digit.                            │
 * │ Step 5 : Remove the last digit from the original number using       │
 * │          integer division.                                          │
 * │ Step 6 : Repeat until all digits are processed.                     │
 * │ Step 7 : Compare the reversed number with the original number.      │
 * │ Step 8 : Return true if both are equal; otherwise return false.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematics | Number Manipulation | Digit Reversal                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 121                                                         │
 * │ reverse = 0                                                         │
 * │ Extract 1 → reverse = 1                                             │
 * │ Extract 2 → reverse = 12                                            │
 * │ Extract 1 → reverse = 121                                           │
 * │ Compare 121 == 121 → true                                           │
 * │ Output : NUMBER :121 IS A PALINDROME                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(log₁₀n)                                        │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Palindrome {
    

    public static void main(String args[]){
        
    }
}

/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [15/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 74: Check Whether a Number is a Palindrome                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer, determine whether it is a palindrome.             │
 * │ A palindrome number reads the same forward and backward.            │
 * │ Input: A single integer. Output: true if palindrome, else false.    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 121                                                        │
 * │ Output : true                                                       │
 * │ Explanation : Reversing 121 gives 121, which is equal to the        │
 * │ original number. Hence, it is a palindrome.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Input should be a valid integer.                                    │
 * │ The algorithm reverses the number digit by digit.                   │
 * │ Negative numbers are not handled explicitly in this implementation. │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Store the original number in a temporary variable.         │
 * │ Step 2 : Initialize reverse as 0.                                   │
 * │ Step 3 : Extract the last digit using modulo (%) operation.         │
 * │ Step 4 : Build the reversed number by multiplying reverse by 10     │
 * │          and adding the extracted digit.                            │
 * │ Step 5 : Remove the last digit from the original number using       │
 * │          integer division.                                          │
 * │ Step 6 : Repeat until all digits are processed.                     │
 * │ Step 7 : Compare the reversed number with the original number.      │
 * │ Step 8 : Return true if both are equal; otherwise return false.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematics | Number Manipulation | Digit Reversal                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 121                                                         │
 * │ reverse = 0                                                         │
 * │ Extract 1 → reverse = 1                                             │
 * │ Extract 2 → reverse = 12                                            │
 * │ Extract 1 → reverse = 121                                           │
 * │ Compare 121 == 121 → true                                           │
 * │ Output : NUMBER :121 IS A PALINDROME                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(log₁₀n)                                        │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔════════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                              ║
* ║                                                                        ║
* ║ public class Palindrome {                                              ║
* ║     public static boolean isPalindrome(int number){                    ║
* ║         int palindrome = number;                                       ║
* ║         int reverse = 0;                                               ║
* ║                                                                        ║
* ║         while(palindrome != 0){                                        ║
* ║             int remender = palindrome % 10;                            ║
* ║             reverse = reverse * 10 + remender;                         ║
* ║             palindrome /= 10;                                          ║
* ║         }                                                              ║
* ║                                                                        ║
* ║         if(number == reverse){                                         ║
* ║             return true;                                               ║
* ║         }else{                                                         ║
* ║             return false;                                              ║
* ║         }                                                              ║
* ║     }                                                                  ║
* ║                                                                        ║
* ║     public static void main(String args[]){                            ║
* ║         System.out.print("ENTER THE NUMBER :");                        ║
* ║         Scanner sc = new Scanner(System.in);                           ║
* ║         int palindrome = sc.nextInt();                                 ║
* ║                                                                        ║
* ║         if(isPalindrome(palindrome)){                                  ║
* ║             System.out.println("NUMBER :"+palindrome+" IS PALINDROME");║
* ║         }else{                                                         ║
* ║              System.out.println("NUMBER :"+palindrome+" IS NOT...");   ║
* ║         }                                                              ║
* ║     }                                                                  ║
* ║ }                                                                      ║
* ╠════════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace for number = 121:                           ║
* ║                                                                        ║
* ║  Iter | palindrome | remender (%10) | reverse (reverse*10 + rem)       ║
* ║  -----|------------|----------------|------------------------------    ║
* ║   1   |    121     |       1        |   0 * 10 + 1 = 1                 ║
* ║   2   |     12     |       2        |   1 * 10 + 2 = 12                ║
* ║   3   |      1     |       1        |  12 * 10 + 1 = 121               ║
* ║                                                                        ║
* ║  Comparison: (number == reverse) -> (121 == 121) -> returns true       ║
* ╠════════════════════════════════════════════════════════════════════════╣
* ║  Code Optimization Note:                                               ║
* ║  - The conditional block at the end of isPalindrome can be cleanly     ║
* ║    simplified to a single expression:                                  ║
* ║    return number == reverse;                                           ║
* ║  - Handles negative numbers correctly because (palindrome != 0) is     ║
* ║    used instead of (palindrome > 0).                                   ║
* ╚════════════════════════════════════════════════════════════════════════╝
*/