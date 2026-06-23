/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [09/06/26] → #2  [10/06/26] → #3  [11/06/26]                    │
 * │  #4  [12/06/26] → #5  [13/06/26] → #6  [14/06/26]                    │
 * │  #7  [15/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 43: Print "HELLO" 10 Times using While Loop                  ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Print the string "HELLO" exactly 10 times using a while loop.       │
* │                                                                     │
* │ The loop should continue executing until the counter exceeds 10.    │
* │ Each iteration prints one occurrence of the message.                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : counter = 1                                                │
* │ Output : HELLO                                                      │
* │          HELLO                                                      │
* │          HELLO                                                      │
* │          ... (total 10 times)                                       │
* │ Explanation : The loop runs for counter values 1 through 10.        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • Counter starts from 1                                             │
* │ • Loop executes while counter ≤ 10                                  │
* │ • Counter is incremented by 1 after each iteration                  │
* │ • Fixed number of iterations (10)                                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize counter = 1                                     │
* │ Step 2 : Check condition (counter <= 10)                            │
* │ Step 3 : Print "HELLO"                                              │
* │ Step 4 : Increment counter by 1                                     │
* │ Step 5 : Repeat until condition becomes false                       │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Iteration (While Loop Traversal)                                    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(n) where n = 10 iterations                     │
* │ Space Complexity : O(1) (constant extra memory)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */

public class While_Loop {
    public static void main(String args[]){
        
    }
}

/*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 43: Print "HELLO" 10 Times using While Loop                  ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Print the string "HELLO" exactly 10 times using a while loop.       │
* │                                                                     │
* │ The loop should continue executing until the counter exceeds 10.    │
* │ Each iteration prints one occurrence of the message.                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : counter = 1                                                │
* │ Output : HELLO                                                      │
* │          HELLO                                                      │
* │          HELLO                                                      │
* │          ... (total 10 times)                                       │
* │ Explanation : The loop runs for counter values 1 through 10.        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • Counter starts from 1                                             │
* │ • Loop executes while counter ≤ 10                                  │
* │ • Counter is incremented by 1 after each iteration                  │
* │ • Fixed number of iterations (10)                                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize counter = 1                                     │
* │ Step 2 : Check condition (counter <= 10)                            │
* │ Step 3 : Print "HELLO"                                              │
* │ Step 4 : Increment counter by 1                                     │
* │ Step 5 : Repeat until condition becomes false                       │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Iteration (While Loop Traversal)                                    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(n) where n = 10 iterations                     │
* │ Space Complexity : O(1) (constant extra memory)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class While_Loop {                                            ║
* ║     public static void main(String args[]){                          ║
* ║         int counter = 1;                                             ║
* ║         while(counter <= 10){                                        ║
* ║             System.out.println("HELLO");                             ║
* ║             counter++;                                               ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/