/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [09/06/26] → #2  [10/06/26] → #3  [11/06/26]                    │
 * │  #4  [12/06/26] → #5  [13/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 42: Leap Year Detection using Logical Operators              ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given a year, determine whether it is a leap year based on the      │
* │ Gregorian calendar rules.                                           │
* │                                                                     │
* │ A year is a leap year if it is divisible by 4 and either not        │
* │ divisible by 100 or divisible by 400.                               │
* │ Print intermediate boolean evaluations and the final result.        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : year = 2000                                                │
* │ Output : true                                                       │
* │          false                                                      │
* │          true                                                       │
* │          2000 IS A LEAP YEAR                                        │
* │ Explanation :                                                       │
* │ x = (2000 % 4 == 0)      → true                                     │
* │ y = (2000 % 100 != 0)    → false                                    │
* │ z = (2000 % 100 == 0 && 2000 % 400 == 0) → true                     │
* │ Final Condition: x && (y || z)                                      │
* │                 = true && (false || true)                           │
* │                 = true                                              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • year is a positive integer                                        │
* │ • Gregorian leap year rules are applied                             │
* │ • Uses modulo (%) and logical operators                             │
* │ • No loops or additional data structures required                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize the year value                                  │
* │ Step 2 : Check divisibility by 4 and store in x                     │
* │ Step 3 : Check non-divisibility by 100 and store in y               │
* │ Step 4 : Check divisibility by both 100 and 400 and store in  z     │
* │ Step 5 : Evaluate x && (y || z)                                     │
* │ Step 6 : Print whether the year is a leap year or not               │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Mathematical Validation (Leap Year Rule Evaluation)                 │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (fixed number of modulo and logical checks)│
* │ Space Complexity : O(1)  (constant auxiliary variables)             │
* └─────────────────────────────────────────────────────────────────────┘
  */

public class Calendar_Year {
    public static void main(String args[]){
        
    }
}

/* 
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 42: Leap Year Detection using Logical Operators              ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given a year, determine whether it is a leap year based on the      │
* │ Gregorian calendar rules.                                           │
* │                                                                     │
* │ A year is a leap year if it is divisible by 4 and either not        │
* │ divisible by 100 or divisible by 400.                               │
* │ Print intermediate boolean evaluations and the final result.        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : year = 2000                                                │
* │ Output : true                                                       │
* │          false                                                      │
* │          true                                                       │
* │          2000 IS A LEAP YEAR                                        │
* │ Explanation :                                                       │
* │ x = (2000 % 4 == 0)      → true                                     │
* │ y = (2000 % 100 != 0)    → false                                    │
* │ z = (2000 % 100 == 0 && 2000 % 400 == 0) → true                     │
* │ Final Condition: x && (y || z)                                      │
* │                 = true && (false || true)                           │
* │                 = true                                              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • year is a positive integer                                        │
* │ • Gregorian leap year rules are applied                             │
* │ • Uses modulo (%) and logical operators                             │
* │ • No loops or additional data structures required                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize the year value                                  │
* │ Step 2 : Check divisibility by 4 and store in x                     │
* │ Step 3 : Check non-divisibility by 100 and store in y               │
* │ Step 4 : Check divisibility by both 100 and 400 and store in  z     │
* │ Step 5 : Evaluate x && (y || z)                                     │
* │ Step 6 : Print whether the year is a leap year or not               │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Mathematical Validation (Leap Year Rule Evaluation)                 │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (fixed number of modulo and logical checks)│
* │ Space Complexity : O(1)  (constant auxiliary variables)             │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Calendar_Year {                                         ║
* ║     public static void main(String args[]){                          ║
* ║         int year = 2000;                                             ║
* ║                                                                      ║
* ║         boolean x = (year % 4 ) == 0;                                ║
* ║         System.out.println(x); // Output: true                       ║
* ║                                                                      ║
* ║         boolean y = (year % 100 ) != 0;                              ║
* ║         System.out.println(y); // Output: false                      ║
* ║                                                                      ║
* ║         boolean z = ((year % 100 == 0 ) && (year % 400 == 0));       ║
* ║         System.out.println(z); // Output: true                       ║
* ║                                                                      ║
* ║         if(x && (y || z)){                                           ║
* ║             System.out.println(year+" IS A LEAP YEAR :");            ║
* ║             // Output: 2000 IS A LEAP YEAR :                         ║
* ║         }                                                            ║
* ║         else{                                                        ║
* ║             System.out.println(year+" IS NOT A LEAP YEAR :");        ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
