/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [10/06/26] → #2  [11/06/26] → #3  [12/06/26]                    │
 * │  #4  [13/06/26] → #5  [14/06/26] → #6  [15/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 50: Print "Hello World" 10 Times Using a Do-While Loop       ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a program to print the string "hello world" exactly           │
 * │ 10 times using a do-while loop.                                     │
 * │ The loop must execute at least once before checking the condition.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : None                                                       │
 * │ Output :                                                            │
 * │ hello world                                                         │
 * │ hello world                                                         │
 * │ ...                                                                 │
 * │ (Printed exactly 10 times)                                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Must use a do-while loop.                                         │
 * │ • Loop counter starts from 1.                                       │
 * │ • Continue execution while counter ≤ 10.                            │
 * │ • Output should be printed exactly 10 times.                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize the counter variable to 1.                      │
 * │ Step 2 : Enter the do block and print "hello world".                │
 * │ Step 3 : Increment the counter by 1.                                │
 * │ Step 4 : Check whether counter ≤ 10.                                │
 * │ Step 5 : Repeat until the condition becomes false.                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration (Do-While Loop)                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    (Fixed 10 iterations; can also be expressed      │
 * │                     as O(10), which simplifies to O(1).)            │
 * │ Space Complexity : O(1)                                             │
 * │                    (Uses only one counter variable.)                │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Hello_World_do_While_Loop {
    public static void main(String args[]){
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 50: Print "Hello World" 10 Times Using a Do-While Loop       ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Write a program to print the string "hello world" exactly           │
 * │ 10 times using a do-while loop.                                     │
 * │ The loop must execute at least once before checking the condition.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : None                                                       │
 * │ Output :                                                            │
 * │ hello world                                                         │
 * │ hello world                                                         │
 * │ ...                                                                 │
 * │ (Printed exactly 10 times)                                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Must use a do-while loop.                                         │
 * │ • Loop counter starts from 1.                                       │
 * │ • Continue execution while counter ≤ 10.                            │
 * │ • Output should be printed exactly 10 times.                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize the counter variable to 1.                      │
 * │ Step 2 : Enter the do block and print "hello world".                │
 * │ Step 3 : Increment the counter by 1.                                │
 * │ Step 4 : Check whether counter ≤ 10.                                │
 * │ Step 5 : Repeat until the condition becomes false.                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration (Do-While Loop)                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    (Fixed 10 iterations; can also be expressed      │
 * │                     as O(10), which simplifies to O(1).)            │
 * │ Space Complexity : O(1)                                             │
 * │                    (Uses only one counter variable.)                │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Hello_World_do_While_Loop {                             ║
* ║     public static void main(String args[]){                          ║
* ║         int counter = 1;                                             ║
* ║         do{                                                          ║
* ║             System.out.println("hello world");                       ║
* ║             counter++;                                               ║
* ║         }while(counter <= 10);                                       ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/