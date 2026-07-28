/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [16/06/26] → #2  [17/06/26] → #3  [18/06/26]                    │*
 * │  #4  [19/06/26] → #5  [20/06/26] → #6  [21/06/26]                    │
 * │  #7  [22/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 77: Print a Half Pyramid Pattern Using Stars                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print a left-aligned half pyramid pattern using '*' characters.     │
 * │ The number of stars in each row is equal to the row number.         │
 * │ Input: Number of rows (fixed as 4 in this implementation).          │
 * │ Output: Half pyramid star pattern.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : rows = 4                                                   │
 * │ Output :                                                            │
 * │ *                                                                   │
 * │ **                                                                  │
 * │ ***                                                                 │
 * │ ****                                                                │
 * │ Explanation : Each row contains one more star than the previous     │
 * │ row, forming a half pyramid shape.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Number of rows is fixed to 4.                                       │
 * │ Nested loops are used for pattern generation.                       │
 * │ Row i contains exactly i stars.                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Use an outer loop to iterate through each row.             │
 * │ Step 2 : For each row, run an inner loop from 1 to current row      │
 * │          number.                                                    │
 * │ Step 3 : Print a '*' for each iteration of the inner loop.          │
 * │ Step 4 : Move to the next line after completing each row.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Row 1 → *                                                           │
 * │ Row 2 → **                                                          │
 * │ Row 3 → ***                                                         │
 * │ Row 4 → ****                                                        │
 * │ Final Output Forms a Half Pyramid                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Half_Pyramid {
    public static void main(String args[]){
        int height = 4;
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 77: Print a Half Pyramid Pattern Using Stars                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print a left-aligned half pyramid pattern using '*' characters.     │
 * │ The number of stars in each row is equal to the row number.         │
 * │ Input: Number of rows (fixed as 4 in this implementation).          │
 * │ Output: Half pyramid star pattern.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : rows = 4                                                   │
 * │ Output :                                                            │
 * │ *                                                                   │
 * │ **                                                                  │
 * │ ***                                                                 │
 * │ ****                                                                │
 * │ Explanation : Each row contains one more star than the previous     │
 * │ row, forming a half pyramid shape.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Number of rows is fixed to 4.                                       │
 * │ Nested loops are used for pattern generation.                       │
 * │ Row i contains exactly i stars.                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Use an outer loop to iterate through each row.             │
 * │ Step 2 : For each row, run an inner loop from 1 to current row      │
 * │          number.                                                    │
 * │ Step 3 : Print a '*' for each iteration of the inner loop.          │
 * │ Step 4 : Move to the next line after completing each row.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Row 1 → *                                                           │
 * │ Row 2 → **                                                          │
 * │ Row 3 → ***                                                         │
 * │ Row 4 → ****                                                        │
 * │ Final Output Forms a Half Pyramid                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════════╗
* ║ public class Half_Pyramid {                                              ║
* ║     public static void main(String args[]){                              ║
* ║                                                                          ║
* ║         for(int line=1; line<=4; line++){   // outer loop                ║
* ║                                                                          ║
* ║             for(int star=1; star<=line; star++){   // inner loop         ║
* ║                 System.out.print("*");                                   ║
* ║             }                                                            ║
* ║             System.out.println();                                        ║
* ║         }                                                                ║
* ║     }                                                                    ║
* ║ }                                                                        ║
* ╠══════════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace:                                              ║
* ║                                                                          ║
* ║  Outer Loop (line) | Inner Loop Bound (star <= line) | Print Output      ║
* ║  ------------------|----------------------------------|------------      ║
* ║      line = 1      | Runs 1 time  (star = 1)          | *                ║
* ║      line = 2      | Runs 2 times (star = 1, 2)       |                  ║
* ║      line = 3      | Runs 3 times (star = 1, 2, 3)    | ***              ║
* ║      line = 4      | Runs 4 times (star = 1, 2, 3, 4) | ****             ║
* ║                                                                          ║
* ║  Console Output:                                                         ║
* ║  *                                                                       ║
* ║                                                                          ║
* ║  ***                                                                     ║
* ║  ****                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                       ║
* ║  - The outer loop controls the row index (total of 4 rows).              ║
* ║  - The inner loop controls columns printed per row, bound tightly        ║
* ║    to the current row value, creating the growing half-pyramid structure.║
* ╚══════════════════════════════════════════════════════════════════════════╝
*/
