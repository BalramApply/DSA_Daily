/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [15/06/26] → #2  [16/06/26] → #3  [17/06/26]                    │
 * │  #4  [18/06/26] → #5  [19/06/26] → #6  [20/06/26]                    │
 * │  #7  [21/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 73: Check Whether a Number is Even or Odd                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer, determine whether it is even or odd.              │
 * │ Return true if the number is divisible by 2; otherwise return false.│
 * │ Input: A single integer. Output: Even or Odd.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 18                                                         │
 * │ Output : NUMBER IS EVEN : 18                                        │
 * │ Explanation : Since 18 % 2 == 0, the number is even.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Input can be any valid integer (positive, negative, or zero).       │
 * │ Even numbers are exactly divisible by 2.                            │
 * │ Odd numbers leave a remainder of 1 or -1 when divided by 2.         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Read an integer from the user.                             │
 * │ Step 2 : Pass the number to the isEven() method.                    │
 * │ Step 3 : Check whether number % 2 == 0.                             │
 * │ Step 4 : Return true if divisible by 2; otherwise return false.     │
 * │ Step 5 : Print whether the number is Even or Odd.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematics | Modulo Arithmetic                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 15                                                          │
 * │ 15 % 2 = 1                                                          │
 * │ Result : false                                                      │
 * │ Output : NUMBER IS ODD : 15                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Even_Odd {
    
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
 * ║ PROBLEM 73: Check Whether a Number is Even or Odd                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer, determine whether it is even or odd.              │
 * │ Return true if the number is divisible by 2; otherwise return false.│
 * │ Input: A single integer. Output: Even or Odd.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 18                                                         │
 * │ Output : NUMBER IS EVEN : 18                                        │
 * │ Explanation : Since 18 % 2 == 0, the number is even.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Input can be any valid integer (positive, negative, or zero).       │
 * │ Even numbers are exactly divisible by 2.                            │
 * │ Odd numbers leave a remainder of 1 or -1 when divided by 2.         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Read an integer from the user.                             │
 * │ Step 2 : Pass the number to the isEven() method.                    │
 * │ Step 3 : Check whether number % 2 == 0.                             │
 * │ Step 4 : Return true if divisible by 2; otherwise return false.     │
 * │ Step 5 : Print whether the number is Even or Odd.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematics | Modulo Arithmetic                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 15                                                          │
 * │ 15 % 2 = 1                                                          │
 * │ Result : false                                                      │
 * │ Output : NUMBER IS ODD : 15                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║ public class Even_Odd {                                              ║
* ║     public static boolean isEven(int number){                        ║
* ║             if(number % 2 == 0){                                     ║
* ║                 return true;                                         ║
* ║             }else{                                                   ║
* ║                 return false;                                        ║
* ║             }                                                        ║
* ║         }                                                            ║
* ║     public static void main(String args[]){                          ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║         System.out.print("ENTER THE INTEGER :");                     ║
* ║         int num = sc.nextInt();                                      ║
* ║         if(isEven(num)){                                             ║
* ║             System.out.println("NUMBER IS EVEN : "+num);             ║
* ║         }else{                                                       ║
* ║              System.out.println("NUMBER IS ODD : "+num);             ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Execution Trace & Logic:                                            ║
* ║  - The program reads an integer from user input.                     ║
* ║  - It invokes the isEven() helper method, passing the input value.   ║
* ║  - Inside isEven(), the remainder operator (%) checks divisibility   ║
* ║    by 2. If number % 2 evaluates to 0, it confirms an even integer.  ║
* ║                                                                      ║
* ║  Code Optimization Note:                                             ║
* ║  The conditional block inside isEven() can be safely simplified to:  ║
* ║  return number % 2 == 0;                                             ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
