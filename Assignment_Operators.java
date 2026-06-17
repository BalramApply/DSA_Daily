/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [05/06/26] → #2  [06/06/26] → #3  [07/06/26]                    │
 * │  #4  [08/06/26] → #5  [09/06/26] → #6  [10/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 21: Assignment Operators                                     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate the use of compound assignment operators (+=, -=, *=,   │
 * │ /=, %=) on an integer variable and observe how its value changes    │
 * │ after each operation.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input : a = 50                                                      │
 * │                                                                     │
 * │ a += 2  → 52                                                        │
 * │ a -= 3  → 49                                                        │
 * │ a *= 2  → 98                                                        │
 * │ a /= 5  → 19                                                        │
 * │ a %= 2  → 1                                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 1. Variable must be initialized before applying compound operators. │
 * │ 2. Division operator requires divisor ≠ 0.                          │
 * │ 3. Variable should be of a numeric data type.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize integer variable a with value 50.               │
 * │ Step 2 : Apply += operator and print updated value.                 │
 * │ Step 3 : Apply -= operator and print updated value.                 │
 * │ Step 4 : Apply *= operator and print updated value.                 │
 * │ Step 5 : Apply /= operator and print updated value.                 │
 * │ Step 6 : Apply %= operator and print updated value.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Compound Assignment Operators / Variable State Mutation             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Assignment_Operators {
    public static void main(String args[]){
        
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 21: Compound Assignment Operators & Variable Mutation        ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate the use of compound assignment operators (+=, -=, *=,   │
 * │ /=, %=) on an integer variable and observe how its value changes    │
 * │ after each operation.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input : a = 50                                                      │
 * │                                                                     │
 * │ a += 2  → 52                                                        │
 * │ a -= 3  → 49                                                        │
 * │ a *= 2  → 98                                                        │
 * │ a /= 5  → 19                                                        │
 * │ a %= 2  → 1                                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 1. Variable must be initialized before applying compound operators. │
 * │ 2. Division operator requires divisor ≠ 0.                          │
 * │ 3. Variable should be of a numeric data type.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize integer variable a with value 50.               │
 * │ Step 2 : Apply += operator and print updated value.                 │
 * │ Step 3 : Apply -= operator and print updated value.                 │
 * │ Step 4 : Apply *= operator and print updated value.                 │
 * │ Step 5 : Apply /= operator and print updated value.                 │
 * │ Step 6 : Apply %= operator and print updated value.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Compound Assignment Operators / Variable State Mutation             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Assignment_Operators {                                  ║
* ║     public static void main(String args[]){                          ║
* ║         int a = 50;                                                  ║
* ║         a += 2;                                                      ║
* ║         System.out.println("ADDITION ASSIGNMENT : "+a);              ║
* ║                                                                      ║
* ║         a -= 3;                                                      ║
* ║         System.out.println("SUBTRACTION ASSIGNMENT : "+a);           ║
* ║                                                                      ║
* ║         a *= 2;                                                      ║
* ║         System.out.println("MULTIPLICATION ASSIGNMENT : "+a);        ║
* ║                                                                      ║
* ║         a /= 5;                                                      ║
* ║         System.out.println("DIVISION ASSIGNMENT : "+a);              ║
* ║                                                                      ║
* ║         a %= 2;                                                      ║
* ║         System.out.println("MODULAS ASSIGNMENT : "+a);               ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
