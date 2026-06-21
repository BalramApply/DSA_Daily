/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [08/06/26] → #2  [09/06/26] → #3  [10/06/26]                    │
 * │  #4  [11/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 38: Determine Whether a Number is Positive or Negative       ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer, determine whether it is positive or negative.     │
* │                                                                     │
* │ If the number is greater than or equal to 0, it is positive;        │
* │ otherwise, it is negative.                                          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : num = -7                                                   │
* │ Output : NUMBER IS NEGATIVE : -7                                    │
* │ Explanation : Since -7 < 0, it falls into negative category.        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • num is an integer                                                 │
* │ • Zero is considered positive (as per given condition)              │
* │ • Simple conditional check only                                     │
* │ • Input is taken from user via Scanner                              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Read integer input num                                     │
* │ Step 2 : Check condition (num >= 0)                                 │
* │ Step 3 : If true → print "POSITIVE"                                 │
* │ Step 4 : Else → print "NEGATIVE"                                    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Logic (Basic Sign Check)                                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (single comparison operation)              │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */

import java.util.Scanner;
public class Positive_Negative_Number {
    public static void main(String args[]){
        
    }
}

/*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 38: Determine Whether a Number is Positive or Negative       ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer, determine whether it is positive or negative.     │
* │                                                                     │
* │ If the number is greater than or equal to 0, it is positive;        │
* │ otherwise, it is negative.                                          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : num = -7                                                   │
* │ Output : NUMBER IS NEGATIVE : -7                                    │
* │ Explanation : Since -7 < 0, it falls into negative category.        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • num is an integer                                                 │
* │ • Zero is considered positive (as per given condition)              │
* │ • Simple conditional check only                                     │
* │ • Input is taken from user via Scanner                              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Read integer input num                                     │
* │ Step 2 : Check condition (num >= 0)                                 │
* │ Step 3 : If true → print "POSITIVE"                                 │
* │ Step 4 : Else → print "NEGATIVE"                                    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Logic (Basic Sign Check)                                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (single comparison operation)              │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Positive_Negative_Number {                              ║
* ║     public static void main(String args[]){                          ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║         System.out.print("ENTER THE NUMBER :");                      ║
* ║         int num = sc.nextInt();                                      ║
* ║                                                                      ║
* ║         if(num >= 0){                                                ║
* ║             System.out.print("NUMBER IS POSITIVE :"+num);            ║
* ║         }                                                            ║
* ║         else{                                                        ║
* ║              System.out.print("NUMBER IS NEGATIVE :"+num);           ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
