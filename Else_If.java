/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [07/06/26] → #2  [08/06/26] → #3  [09/06/26]                    │
 * │  #4  [10/06/26] → #5  [11/06/26] → #6  [12/06/26]                    │
 * │  #7  [13/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 31: Age Category Classification using Else-If Ladder         ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer age, classify the person into one of three groups: │
* │ child, teenager, or adult based on defined age ranges.              │
* │                                                                     │
* │ The program should use an else-if ladder to determine the category. │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : age = 22                                                   │
* │ Output : adult                                                      │
* │ Explanation : Since age is greater than or equal to 18, it falls    │
* │ into the adult category.                                            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • age is a non-negative integer                                     │
* │ • Mutually exclusive conditions using else-if ladder                │
* │ • Only one category is printed                                      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Read integer age                                           │
* │ Step 2 : If age >= 18 → print "adult"                               │
* │ Step 3 : Else if age >= 13 and age < 18 → print "teenager"          │
* │ Step 4 : Else → print "child"                                       │
* │ Step 5 : Execute conditions sequentially until one matches          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Logic (Else-If Ladder / Range Classification)           │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant number of comparisons)           │
* │ Space Complexity : O(1)  (no extra memory used)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */


public class Else_If {
    public static void main(String[] args) {
        
    }
}

/* 
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 31: Age Category Classification using Else-If Ladder         ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer age, classify the person into one of three groups: │
* │ child, teenager, or adult based on defined age ranges.              │
* │                                                                     │
* │ The program should use an else-if ladder to determine the category. │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : age = 22                                                   │
* │ Output : adult                                                      │
* │ Explanation : Since age is greater than or equal to 18, it falls    │
* │ into the adult category.                                            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • age is a non-negative integer                                     │
* │ • Mutually exclusive conditions using else-if ladder                │
* │ • Only one category is printed                                      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Read integer age                                           │
* │ Step 2 : If age >= 18 → print "adult"                               │
* │ Step 3 : Else if age >= 13 and age < 18 → print "teenager"          │
* │ Step 4 : Else → print "child"                                       │
* │ Step 5 : Execute conditions sequentially until one matches          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Logic (Else-If Ladder / Range Classification)           │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant number of comparisons)           │
* │ Space Complexity : O(1)  (no extra memory used)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Odd_Even {                                              ║
* ║     public static void main(String args[]){                          ║
* ║         int n = 5;                                                   ║
* ║         if(n % 2 == 0){                                              ║
* ║             System.out.println("NUMBER IS EVEN");                    ║
* ║         }else{                                                       ║
* ║             System.out.println("NUMBER IS ODD");                     ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
