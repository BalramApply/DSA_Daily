/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [09/06/26] → #2  [10/06/26] → #3  [11/06/26]                    │
 * │  #4  [12/06/26] → #5  [13/06/26] → #6  [14/06/26]                    │
 * │  #7  [15/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 45: Print Multiplication Table using While Loop              ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer num, print its multiplication table from 1 to 10   │
* │ using a while loop.                                                 │
* │                                                                     │
* │ Each line should display the multiplication expression and its      │
* │ corresponding result.                                               │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : num = 3                                                    │
* │ Output : 3 x 1 = 3                                                  │
* │          3 x 2 = 6                                                  │
* │          3 x 3 = 9                                                  │
* │          3 x 4 = 12                                                 │
* │          3 x 5 = 15                                                 │
* │          3 x 6 = 18                                                 │
* │          3 x 7 = 21                                                 │
* │          3 x 8 = 24                                                 │
* │          3 x 9 = 27                                                 │
* │          3 x 10 = 30                                                │
* │ Explanation : Multiply num by values 1 through 10 and print each    │
* │ result in table format.                                             │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • num is an integer                                                 │
* │ • Table range is fixed from 1 to 10                                 │
* │ • Use a while loop for iteration                                    │
* │ • One multiplication operation per iteration                        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize i = 1 and define the number num                 │
* │ Step 2 : Run loop while (i <= 10)                                   │
* │ Step 3 : Calculate result = num * i                                 │
* │ Step 4 : Print multiplication expression and result                 │
* │ Step 5 : Increment i by 1                                           │
* │ Step 6 : Repeat until i becomes 11                                  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Iteration (While Loop with Arithmetic Computation)                  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(n), where n = 10 iterations                    │
* │ Space Complexity : O(1) (constant extra memory)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */

public class Table_While_Loop {
    public static void main(String args[]){
        
    }
}

/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [09/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 45: Print Multiplication Table using While Loop              ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer num, print its multiplication table from 1 to 10   │
* │ using a while loop.                                                 │
* │                                                                     │
* │ Each line should display the multiplication expression and its      │
* │ corresponding result.                                               │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : num = 3                                                    │
* │ Output : 3 x 1 = 3                                                  │
* │          3 x 2 = 6                                                  │
* │          3 x 3 = 9                                                  │
* │          3 x 4 = 12                                                 │
* │          3 x 5 = 15                                                 │
* │          3 x 6 = 18                                                 │
* │          3 x 7 = 21                                                 │
* │          3 x 8 = 24                                                 │
* │          3 x 9 = 27                                                 │
* │          3 x 10 = 30                                                │
* │ Explanation : Multiply num by values 1 through 10 and print each    │
* │ result in table format.                                             │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • num is an integer                                                 │
* │ • Table range is fixed from 1 to 10                                 │
* │ • Use a while loop for iteration                                    │
* │ • One multiplication operation per iteration                        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize i = 1 and define the number num                 │
* │ Step 2 : Run loop while (i <= 10)                                   │
* │ Step 3 : Calculate result = num * i                                 │
* │ Step 4 : Print multiplication expression and result                 │
* │ Step 5 : Increment i by 1                                           │
* │ Step 6 : Repeat until i becomes 11                                  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Iteration (While Loop with Arithmetic Computation)                  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(n), where n = 10 iterations                    │
* │ Space Complexity : O(1) (constant extra memory)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */

// public class Table_While_Loop {
//     public static void main(String args[]){
//         int i=1;
//         int num=3;
//         while (i <= 10) {
//             int result = num * i;
//             System.out.println(num + " x " + i + " = " + result);
            
//             i++; 
//         }
//     }
// }
