/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [11/06/26] → #2  [12/06/26] → #3  [13/06/26]                    │
 * │  #4  [14/06/26] → #5  [15/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 51: Print Numbers Until 3 Using Break Statement              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print numbers from 1 to 10 using a for loop.                        │
 * │ Immediately terminate the loop when the current value becomes 3     │
 * │ by using the break statement.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : None                                                       │
 * │ Output :                                                            │
 * │ 1                                                                   │
 * │ 2                                                                   │
 * │ Explanation : When i becomes 3, the break statement executes,       │
 * │ terminating the loop before printing 3.                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Use a for loop from 1 to 10.                                      │
 * │ • Terminate the loop when i == 3.                                   │
 * │ • Do not print the value 3 or any numbers after it.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize a for loop from i = 1 to 10.                    │
 * │ Step 2 : Check whether i equals 3.                                  │
 * │ Step 3 : If true, execute the break statement to exit the loop.     │
 * │ Step 4 : Otherwise, print the current value of i.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration + Conditional Break                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    (Loop terminates after reaching i = 3, executing │
 * │                     only two print operations.)                     │
 * │ Space Complexity : O(1)                                             │
 * │                    (Uses constant extra memory.)                    │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Break_Statement {
     public static void main(String args[]){
        
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 51: Print Numbers Until 3 Using Break Statement              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print numbers from 1 to 10 using a for loop.                        │
 * │ Immediately terminate the loop when the current value becomes 3     │
 * │ by using the break statement.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : None                                                       │
 * │ Output :                                                            │
 * │ 1                                                                   │
 * │ 2                                                                   │
 * │ Explanation : When i becomes 3, the break statement executes,       │
 * │ terminating the loop before printing 3.                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Use a for loop from 1 to 10.                                      │
 * │ • Terminate the loop when i == 3.                                   │
 * │ • Do not print the value 3 or any numbers after it.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize a for loop from i = 1 to 10.                    │
 * │ Step 2 : Check whether i equals 3.                                  │
 * │ Step 3 : If true, execute the break statement to exit the loop.     │
 * │ Step 4 : Otherwise, print the current value of i.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration + Conditional Break                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    (Loop terminates after reaching i = 3, executing │
 * │                     only two print operations.)                     │
 * │ Space Complexity : O(1)                                             │
 * │                    (Uses constant extra memory.)                    │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Break_Statement {                                       ║
* ║      public static void main(String args[]){                         ║
* ║         for(int i=1; i<=10; i++){                                    ║
* ║             if(i == 3){                                              ║
* ║                 break;                                               ║
* ║             }                                                        ║
* ║             System.out.print(i+" ");                                 ║
* ║         }                                                            ║
* ║         // Ans: 1 2                                                  ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
