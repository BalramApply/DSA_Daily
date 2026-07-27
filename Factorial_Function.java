/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [13/06/26] → #2  [14/06/26] → #3  [15/06/26]                    │
 * │  #4  [16/06/26] → #5  [17/06/26] → #6  [18/06/26]                    │
 * │  #7  [19/06/26] → #8  [20/06/26] → #9  [21/06/26]                    │
 * │  #10 [22/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 65: Factorial Using Function Call                            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a program to calculate the factorial of a given number using  │
 * │ a separate function. The function should accept an integer n and    │
 * │ return n!.                                                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input : 5                                                           │
 * │                                                                     │
 * │ Output :                                                            │
 * │ FACTORIAL IS : 120                                                  │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ 5! = 5 × 4 × 3 × 2 × 1 = 120                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • n ≥ 0                                                             │
 * │ • Factorial of 0 is 1.                                              │
 * │ • Suitable for small integer values.                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a function factorial(int n).                        │
 * │ Step 2 : Initialize f = 1.                                          │
 * │ Step 3 : Multiply f by every integer from 1 to n.                   │
 * │ Step 4 : Return the computed factorial.                             │
 * │ Step 5 : Call the function from main() and print the result.        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : n = 5                                                       │
 * │                                                                     │
 * │ f = 1                                                               │
 * │ i = 1 → f = 1                                                       │
 * │ i = 2 → f = 2                                                       │
 * │ i = 3 → f = 6                                                       │
 * │ i = 4 → f = 24                                                      │
 * │ i = 5 → f = 120                                                     │
 * │                                                                     │
 * │ Return 120                                                          │
 * │ Output : FACTORIAL IS : 120                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iterative Function (Loop-Based)                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │                    The loop executes n times.                       │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses only one extra variable.                    │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Factorial_Function {
    
    public static void main(String args[]){
        int num = 5;
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 65: Factorial Using Function Call                            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a program to calculate the factorial of a given number using  │
 * │ a separate function. The function should accept an integer n and    │
 * │ return n!.                                                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input : 5                                                           │
 * │                                                                     │
 * │ Output :                                                            │
 * │ FACTORIAL IS : 120                                                  │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ 5! = 5 × 4 × 3 × 2 × 1 = 120                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • n ≥ 0                                                             │
 * │ • Factorial of 0 is 1.                                              │
 * │ • Suitable for small integer values.                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a function factorial(int n).                        │
 * │ Step 2 : Initialize f = 1.                                          │
 * │ Step 3 : Multiply f by every integer from 1 to n.                   │
 * │ Step 4 : Return the computed factorial.                             │
 * │ Step 5 : Call the function from main() and print the result.        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : n = 5                                                       │
 * │                                                                     │
 * │ f = 1                                                               │
 * │ i = 1 → f = 1                                                       │
 * │ i = 2 → f = 2                                                       │
 * │ i = 3 → f = 6                                                       │
 * │ i = 4 → f = 24                                                      │
 * │ i = 5 → f = 120                                                     │
 * │                                                                     │
 * │ Return 120                                                          │
 * │ Output : FACTORIAL IS : 120                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iterative Function (Loop-Based)                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │                    The loop executes n times.                       │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses only one extra variable.                    │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Factorial_Function {                                    ║
* ║     public static int factorial(int n){                              ║
* ║         int f = 1;                                                   ║
* ║         for(int i=1; i<=n; i++){                                     ║
* ║             f = f * i;                                               ║
* ║         }                                                            ║
* ║         return f;                                                    ║
* ║     }                                                                ║
* ║     public static void main(String args[]){                          ║
* ║         System.out.println("FACTORIAL IS : " + factorial(5));        ║
* ║                                                                      ║
* ║         // Output: FACTORIAL IS : 120                                ║
* ║         // Note: Properly encapsulates iterative factorial logic     ║
* ║         // inside a reusable method block.                           ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
