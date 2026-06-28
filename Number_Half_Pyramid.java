/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [16/06/26] → #2  [17/06/26] → #3  [18/06/26]                    │
 * │  #4  [19/06/26] → #5  [20/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 79: Print a Number Half Pyramid Pattern                      ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print a half pyramid pattern using numbers instead of stars.        │
 * │ Each row starts from 1 and prints numbers sequentially up to the    │
 * │ current row number.                                                 │
 * │ Input: Number of rows (fixed as 4 in this implementation).          │
 * │ Output: Number half pyramid pattern.                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : height = 4                                                 │
 * │ Output :                                                            │
 * │ 1                                                                   │
 * │ 12                                                                  │
 * │ 123                                                                 │
 * │ 1234                                                                │
 * │ Explanation : Row i contains numbers from 1 to i.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Height is fixed to 4.                                               │
 * │ Nested loops are used for pattern generation.                       │
 * │ Row i prints numbers from 1 through i.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize the pyramid height.                             │
 * │ Step 2 : Use an outer loop to iterate through each row.             │
 * │ Step 3 : For each row, use an inner loop from 1 to the current      │
 * │          row number.                                                │
 * │ Step 4 : Print each number in sequence.                             │
 * │ Step 5 : Move to the next line after completing a row.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ height = 4                                                          │
 * │ Row 1 → 1                                                           │
 * │ Row 2 → 12                                                          │
 * │ Row 3 → 123                                                         │
 * │ Row 4 → 1234                                                        │
 * │ Final Output Forms a Number Half Pyramid                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Number_Half_Pyramid {
    public static void main(String args[]){
        int height=4;
        
    }
}
/* ───────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 79: Print a Number Half Pyramid Pattern                      ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print a half pyramid pattern using numbers instead of stars.        │
 * │ Each row starts from 1 and prints numbers sequentially up to the    │
 * │ current row number.                                                 │
 * │ Input: Number of rows (fixed as 4 in this implementation).          │
 * │ Output: Number half pyramid pattern.                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : height = 4                                                 │
 * │ Output :                                                            │
 * │ 1                                                                   │
 * │ 12                                                                  │
 * │ 123                                                                 │
 * │ 1234                                                                │
 * │ Explanation : Row i contains numbers from 1 to i.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Height is fixed to 4.                                               │
 * │ Nested loops are used for pattern generation.                       │
 * │ Row i prints numbers from 1 through i.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize the pyramid height.                             │
 * │ Step 2 : Use an outer loop to iterate through each row.             │
 * │ Step 3 : For each row, use an inner loop from 1 to the current      │
 * │          row number.                                                │
 * │ Step 4 : Print each number in sequence.                             │
 * │ Step 5 : Move to the next line after completing a row.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ height = 4                                                          │
 * │ Row 1 → 1                                                           │
 * │ Row 2 → 12                                                          │
 * │ Row 3 → 123                                                         │
 * │ Row 4 → 1234                                                        │
 * │ Final Output Forms a Number Half Pyramid                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Number_Half_Pyramid {                                   ║
* ║     public static void main(String args[]){                          ║
* ║         int height = 4;                                              ║
* ║                                                                      ║
* ║         for(int line=1; line<=height; line++){    // outer loop      ║
* ║                                                                      ║
* ║             for(int number=1; number<=line; number++){  // inner loop║
* ║                 System.out.print(number);                            ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace:                                          ║
* ║                                                                      ║
* ║  Outer Loop (line) | Inner Loop Bound (number <= line) | Print Output║
* ║  ------------------|-----------------------------------|-------------║
* ║     line = 1       | Runs 1 time  (number = 1)         | 1           ║
* ║     line = 2       | Runs 2 times (number = 1, 2)      | 12          ║
* ║     line = 3       | Runs 3 times (number = 1, 2, 3)   | 13          ║
* ║     line = 4       | Runs 4 times (number = 1, 2, 3, 4)| 1234        ║
* ║                                                                      ║
* ║  Console Output:                                                     ║
* ║  1                                                                   ║
* ║  12                                                                  ║
* ║  123                                                                 ║
* ║  1234                                                                ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - The outer loop governs the vertical row position (`line`).        ║
* ║  - The inner loop controls the numeric content resetting to 1 at the ║
* ║    beginning of each horizontal row and counting up to the row limit.║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
