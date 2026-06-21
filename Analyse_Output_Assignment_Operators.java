/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [05/06/26] → #2  [06/06/26] → #3  [07/06/26]                    │
 * │  #4  [08/06/26] → #5  [09/06/26] → #6  [10/06/26]                    │
 * │  #7  [11/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 24: ANALYSE OUTPUT ASSIGNMENT OPERATORS                      ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate how multiple variables are affected by sequential       │
 * │ compound assignment operations and observe how earlier mutations    │
 * │ influence later calculations.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Initial Values : x = 2, y = 2, z = 2                                │
 * │                                                                     │
 * │ x += y  → x = 4                                                     │
 * │ y -= z  → y = 0                                                     │
 * │ z /= (x + y) → 2 / 4 = 0                                            │
 * │                                                                     │
 * │ Output:                                                             │
 * │ X IS : 4                                                            │
 * │ Y IS : 0                                                            │
 * │ Z IS : 0                                                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 1. Variables must be initialized before use.                        │
 * │ 2. Denominator (x + y) must not be zero.                            │
 * │ 3. Integer division truncates decimal values.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize x, y, and z with value 2.                       │
 * │ Step 2 : Update x using compound addition assignment.               │
 * │ Step 3 : Update y using compound subtraction assignment.            │
 * │ Step 4 : Update z using compound division assignment.               │
 * │ Step 5 : Print the final values of x, y, and z.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Compound Assignment Operators / State Transition Analysis           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Analyse_Output_Assignment_Operators {
    public static void main(String args[]){
        int x, y, z;

        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(" X IS :" +x+"\n Y IS :"+y+"\n Z IS :"+z); // Ans x : , y : , z : ,
    }
}

/* ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 24: ANALYSE OUTPUT ASSIGNMENT OPERATORS                      ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate how multiple variables are affected by sequential       │
 * │ compound assignment operations and observe how earlier mutations    │
 * │ influence later calculations.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Initial Values : x = 2, y = 2, z = 2                                │
 * │                                                                     │
 * │ x += y  → x = 4                                                     │
 * │ y -= z  → y = 0                                                     │
 * │ z /= (x + y) → 2 / 4 = 0                                            │
 * │                                                                     │
 * │ Output:                                                             │
 * │ X IS : 4                                                            │
 * │ Y IS : 0                                                            │
 * │ Z IS : 0                                                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 1. Variables must be initialized before use.                        │
 * │ 2. Denominator (x + y) must not be zero.                            │
 * │ 3. Integer division truncates decimal values.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize x, y, and z with value 2.                       │
 * │ Step 2 : Update x using compound addition assignment.               │
 * │ Step 3 : Update y using compound subtraction assignment.            │
 * │ Step 4 : Update z using compound division assignment.               │
 * │ Step 5 : Print the final values of x, y, and z.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Compound Assignment Operators / State Transition Analysis           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Analyse_Output_Assignment_Operators {                   ║
* ║     public static void main(String args[]){                          ║
* ║         int x, y, z;                                                 ║
* ║                                                                      ║
* ║         x = y = z = 2;                                               ║
* ║         x += y;                                                      ║
* ║         y -= z;                                                      ║
* ║         z /= (x + y);                                                ║
* ║         System.out.println("X IS :" +x+"\n Y IS :"+y+"\n Z IS :"+z); ║
* ║         // Ans x : 4, y : 0, z : 0                                   ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
