/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [11/06/26] → #2  [12/06/26] → #3  [13/06/26]                    │
 * │  #4  [14/06/26] → #5  [15/06/26] → #6  [16/06/26]                    │
 * │  #7  [17/06/26] → #8  [18/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 53: Print Numbers from 1 to 10 While Skipping 3              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print all numbers from 1 to 10 using a for loop.                    │
 * │ Skip printing the number 3 by using the continue statement.         │
 * │ Continue executing the remaining iterations of the loop.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : None                                                       │
 * │ Output :                                                            │
 * │ 1                                                                   │
 * │ 2                                                                   │
 * │ 4                                                                   │
 * │ 5                                                                   │
 * │ 6                                                                   │
 * │ 7                                                                   │
 * │ 8                                                                   │
 * │ 9                                                                   │
 * │ 10                                                                  │
 * │ Explanation :                                                       │
 * │ When i becomes 3, the continue statement skips the print            │
 * │ operation and proceeds directly to the next iteration.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Use a for loop from 1 to 10.                                      │
 * │ • Must use the continue statement.                                  │
 * │ • Skip only the number 3.                                           │
 * │ • Print all remaining numbers in ascending order.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize a for loop from 1 to 10.                        │
 * │ Step 2 : Check whether the current number is 3.                     │
 * │ Step 3 : If true, execute continue to skip the current iteration.   │
 * │ Step 4 : Otherwise, print the current number.                       │
 * │ Step 5 : Repeat until all values from 1 to 10 are processed.        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration + Conditional Continue                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │                    where n = total loop iterations (10).            │
 * │                    Since n is fixed, it can also be considered O(1).│
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Continue_Statement {
    public static void main(String args[]){
        
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 53: Print Numbers from 1 to 10 While Skipping 3              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print all numbers from 1 to 10 using a for loop.                    │
 * │ Skip printing the number 3 by using the continue statement.         │
 * │ Continue executing the remaining iterations of the loop.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : None                                                       │
 * │ Output :                                                            │
 * │ 1                                                                   │
 * │ 2                                                                   │
 * │ 4                                                                   │
 * │ 5                                                                   │
 * │ 6                                                                   │
 * │ 7                                                                   │
 * │ 8                                                                   │
 * │ 9                                                                   │
 * │ 10                                                                  │
 * │ Explanation :                                                       │
 * │ When i becomes 3, the continue statement skips the print            │
 * │ operation and proceeds directly to the next iteration.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Use a for loop from 1 to 10.                                      │
 * │ • Must use the continue statement.                                  │
 * │ • Skip only the number 3.                                           │
 * │ • Print all remaining numbers in ascending order.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize a for loop from 1 to 10.                        │
 * │ Step 2 : Check whether the current number is 3.                     │
 * │ Step 3 : If true, execute continue to skip the current iteration.   │
 * │ Step 4 : Otherwise, print the current number.                       │
 * │ Step 5 : Repeat until all values from 1 to 10 are processed.        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration + Conditional Continue                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │                    where n = total loop iterations (10).            │
 * │                    Since n is fixed, it can also be considered O(1).│
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Continue_Statement {                                    ║
* ║     public static void main(String args[]){                          ║
* ║         for(int i=1; i<=10; i++){                                    ║
* ║             if(i == 3){                                              ║
* ║                 continue;                                            ║
* ║             }                                                        ║
* ║             System.out.println(i);                                   ║
* ║         }                                                            ║
* ║         // Ans: Output will print numbers 1 to 10, skipping 3        ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
