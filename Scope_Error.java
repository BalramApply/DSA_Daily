/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [12/06/26] → #2  [13/06/26] → #3  [14/06/26]                    │
 * │  #4  [15/06/26] → #5  [16/06/26] → #6  [17/06/26]                    │
 * │  #7  [18/06/26] → #8  [19/06/26] → #9  [20/06/26]                    │
 * │  #10 [21/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 60: Find the Scope Error in a For Loop Variable              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Analyze the given Java program and identify why it fails to         │
 * │ compile. The program attempts to print the value of the loop        │
 * │ variable after the for loop has finished executing.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Code :                                                              │
 * │ for(int i = 0; i <= 5; i++) {                                       │
 * │     System.out.println(i);                                          │
 * │ }                                                                   │
 * │ System.out.println(i);                                              │
 * │                                                                     │
 * │ Result : Compilation Error                                          │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ The variable 'i' is declared inside the for loop and has            │
 * │ block scope. It cannot be accessed after the loop ends.             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Variables declared inside '{}' have block scope.                  │
 * │ • Loop variables exist only within the for-loop block.              │
 * │ • Accessing them outside the loop causes a compilation error.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Observe where the variable 'i' is declared.                │
 * │ Step 2 : Identify its scope (inside the for loop only).             │
 * │ Step 3 : Notice that the program tries to use 'i' after the loop.   │
 * │ Step 4 : Conclude that 'i' is out of scope.                         │
 * │ Step 5 : Fix by declaring 'i' before the for loop if needed later.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ i = 0 → Print 0                                                     │
 * │ i = 1 → Print 1                                                     │
 * │ i = 2 → Print 2                                                     │
 * │ i = 3 → Print 3                                                     │
 * │ i = 4 → Print 4                                                     │
 * │ i = 5 → Print 5                                                     │
 * │ Loop ends → 'i' goes out of scope                                   │
 * │ Next statement: System.out.print(i); → Compilation Error            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Variable Scope Analysis (Block Scope)                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    This is a compile-time scope analysis.           │
 * │ Space Complexity : O(1)                                             │
 * │                    No extra memory is used.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Scope_Error {
    public static void main(String args[]){
        for(int i =0; i<=5; i++){
            System.out.println("i = "+i);
        }
    //    System.out.print("i after the loop ="+i);    // Ans : block scope
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 60: Find the Scope Error in a For Loop Variable              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Analyze the given Java program and identify why it fails to         │
 * │ compile. The program attempts to print the value of the loop        │
 * │ variable after the for loop has finished executing.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Code :                                                              │
 * │ for(int i = 0; i <= 5; i++) {                                       │
 * │     System.out.println(i);                                          │
 * │ }                                                                   │
 * │ System.out.println(i);                                              │
 * │                                                                     │
 * │ Result : Compilation Error                                          │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ The variable 'i' is declared inside the for loop and has            │
 * │ block scope. It cannot be accessed after the loop ends.             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Variables declared inside '{}' have block scope.                  │
 * │ • Loop variables exist only within the for-loop block.              │
 * │ • Accessing them outside the loop causes a compilation error.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Observe where the variable 'i' is declared.                │
 * │ Step 2 : Identify its scope (inside the for loop only).             │
 * │ Step 3 : Notice that the program tries to use 'i' after the loop.   │
 * │ Step 4 : Conclude that 'i' is out of scope.                         │
 * │ Step 5 : Fix by declaring 'i' before the for loop if needed later.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ i = 0 → Print 0                                                     │
 * │ i = 1 → Print 1                                                     │
 * │ i = 2 → Print 2                                                     │
 * │ i = 3 → Print 3                                                     │
 * │ i = 4 → Print 4                                                     │
 * │ i = 5 → Print 5                                                     │
 * │ Loop ends → 'i' goes out of scope                                   │
 * │ Next statement: System.out.print(i); → Compilation Error            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Variable Scope Analysis (Block Scope)                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    This is a compile-time scope analysis.           │
 * │ Space Complexity : O(1)                                             │
 * │                    No extra memory is used.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Scope_Error {                                           ║
* ║     public static void main(String args[]){                          ║
* ║         for(int i =0; i<=5; i++){                                    ║
* ║             System.out.println("i =" + i);                           ║
* ║         }                                                            ║
* ║                                                                      ║
* ║         System.out.print("i after the loop =" + i);                  ║
* ║         // Ans : Compile-time Error!                                 ║
* ║         // Reason: 'i' has block scope limited to the for-loop.      ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/