/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [05/06/26] → #2  [06/06/26] → #3  [07/06/26]                    │
 * │  #4  [08/06/26] → #5  [09/06/26] → #6  [10/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 23: ANALYSE OUTPUT OPERATORS                                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate the behavior of multiple independent if statements      │
 * │ using compound logical conditions (&&) and observe which blocks     │
 * │ execute based on the evaluated boolean expressions.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input : x = 200, y = 500, z = 200                                   │
 * │ Output:                                                             │
 * │ JAVA                                                                │
 * │                                                                     │
 * │ Explanation:                                                        │
 * │ (x > y && y > z)          → false                                   │
 * │ (z < y && z <= x)         → true  → Prints "JAVA"                   │
 * │ ((y+200)<x && (y+150)<z)  → false                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 1. x, y, and z must be valid integer values.                        │
 * │ 2. Each if statement executes independently.                        │
 * │ 3. Logical AND (&&) requires both conditions to be true.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize variables x, y, and z.                          │
 * │ Step 2 : Evaluate the first compound condition.                     │
 * │ Step 3 : Evaluate the second compound condition.                    │
 * │ Step 4 : Evaluate the third compound condition.                     │
 * │ Step 5 : Print messages for conditions that evaluate to true.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Conditional Statements / Logical AND Evaluation                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Analyse_Output_Operators {
    public static void main(String arga[]){
        int x = 200, y = 500, z = 200;

        if(x > y && y > z){
            System.out.println("HELLO");    // ans = ?
        }

         if(z < y && z <= x){
            System.out.println("JAVA"); // ans = ?
        }

         if((y + 200) < x && (y + 150) < z){
            System.out.println("HELLO JAVA");   // ans = ?
        }
    }
}
/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 23: Independent Conditionals & Compound Logic                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate the behavior of multiple independent if statements      │
 * │ using compound logical conditions (&&) and observe which blocks     │
 * │ execute based on the evaluated boolean expressions.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input : x = 200, y = 500, z = 200                                   │
 * │ Output:                                                             │
 * │ JAVA                                                                │
 * │                                                                     │
 * │ Explanation:                                                        │
 * │ (x > y && y > z)          → false                                   │
 * │ (z < y && z <= x)         → true  → Prints "JAVA"                   │
 * │ ((y+200)<x && (y+150)<z)  → false                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 1. x, y, and z must be valid integer values.                        │
 * │ 2. Each if statement executes independently.                        │
 * │ 3. Logical AND (&&) requires both conditions to be true.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize variables x, y, and z.                          │
 * │ Step 2 : Evaluate the first compound condition.                     │
 * │ Step 3 : Evaluate the second compound condition.                    │
 * │ Step 4 : Evaluate the third compound condition.                     │
 * │ Step 5 : Print messages for conditions that evaluate to true.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Conditional Statements / Logical AND Evaluation                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Analyse_Output_Operators {                              ║
* ║     public static void main(String arga[]){                          ║
* ║         int x = 200, y = 500, z = 200;                               ║
* ║                                                                      ║
* ║         if(x > y && y > z){                                          ║
* ║             System.out.println("HELLO");    // No Output (False)     ║
* ║         }                                                            ║
* ║                                                                      ║
* ║          if(z < y && z <= x){                                        ║
* ║             System.out.println("JAVA"); // Output: JAVA (True)       ║
* ║         }                                                            ║
* ║                                                                      ║
* ║          if((y + 200) < x && (y + 150) < z){                         ║
* ║             System.out.println("HELLO JAVA");   // No Output (False) ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
