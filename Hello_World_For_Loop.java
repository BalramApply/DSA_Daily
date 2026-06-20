/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [10/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 46: Print "HELLO WORLD" 10 Times Using For Loop              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print the message "HELLO WORLD" exactly 10 times using a for loop.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ─────────────────────────────────────────────────────────┐
 * │ Output:                                                            │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ─────────────────────────────────────────────────────┐
 * │ • Use a for loop                                                   │
 * │ • Loop should execute exactly 10 times                             │
 * │ • Print one line per iteration                                     │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ──────────────────────────────────────────────────┐
 * │ Step 1 : Initialize loop variable i = 1                            │
 * │ Step 2 : Continue while (i <= 10)                                  │
 * │ Step 3 : Print "HELLO WORLD"                                       │
 * │ Step 4 : Increment i by 1                                          │
 * │ Step 5 : Stop after the 10th iteration                             │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration (For Loop)                                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n), where n = 10 iterations                    │
 * │                     Since n is fixed, it is effectively O(1).       │
 * │ Space Complexity : O(1) (only the loop variable is used)            │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Hello_World_For_Loop {
    public static void main(String args[]){
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 46: Print "HELLO WORLD" 10 Times Using For Loop              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print the message "HELLO WORLD" exactly 10 times using a for loop.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ─────────────────────────────────────────────────────────┐
 * │ Output:                                                            │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * │ HELLO WORLD                                                        │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ─────────────────────────────────────────────────────┐
 * │ • Use a for loop                                                   │
 * │ • Loop should execute exactly 10 times                             │
 * │ • Print one line per iteration                                     │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ──────────────────────────────────────────────────┐
 * │ Step 1 : Initialize loop variable i = 1                            │
 * │ Step 2 : Continue while (i <= 10)                                  │
 * │ Step 3 : Print "HELLO WORLD"                                       │
 * │ Step 4 : Increment i by 1                                          │
 * │ Step 5 : Stop after the 10th iteration                             │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration (For Loop)                                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n), where n = 10 iterations                    │
 * │                     Since n is fixed, it is effectively O(1).       │
 * │ Space Complexity : O(1) (only the loop variable is used)            │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Hello_World_For_Loop {                                  ║
* ║     public static void main(String args[]){                          ║
* ║         for(int i=1; i<=10; i++){                                    ║
* ║             System.out.println("HELLO WORLD");                       ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/