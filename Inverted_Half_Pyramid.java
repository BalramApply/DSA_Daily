/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [16/06/26] → #2  [17/06/26] → #3  [18/06/26]                    │
 * │  #4  [19/06/26] → #5  [20/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 78: Print an Inverted Half Pyramid Pattern Using Stars       ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print an inverted left-aligned half pyramid using '*' characters.   │
 * │ The number of stars decreases by one in each successive row.        │
 * │ Input: Number of rows (fixed as 4 in this implementation).          │
 * │ Output: Inverted half pyramid star pattern.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : rows = 4                                                   │
 * │ Output :                                                            │
 * │ ****                                                                │
 * │ ***                                                                 │
 * │ **                                                                  │
 * │ *                                                                   │
 * │ Explanation : The first row contains 4 stars and each subsequent    │
 * │ row contains one less star, forming an inverted half pyramid.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Number of rows is fixed to 4.                                       │
 * │ Nested loops are used for pattern generation.                       │
 * │ Row i contains (n - i + 1) stars.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize the total number of rows n.                     │
 * │ Step 2 : Use an outer loop to iterate through each row.             │
 * │ Step 3 : For each row, calculate the number of stars as             │
 * │          (n - line + 1).                                            │
 * │ Step 4 : Use an inner loop to print the required stars.             │
 * │ Step 5 : Move to the next line after completing each row.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → ****                                                        │
 * │ Row 2 → ***                                                         │
 * │ Row 3 → **                                                          │
 * │ Row 4 → *                                                           │
 * │ Final Output Forms an Inverted Half Pyramid                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Inverted_Half_Pyramid {
    public static void main(String args[]){
        int height = 4;
        
    }
}

/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 78: Print an Inverted Half Pyramid Pattern Using Stars       ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print an inverted left-aligned half pyramid using '*' characters.   │
 * │ The number of stars decreases by one in each successive row.        │
 * │ Input: Number of rows (fixed as 4 in this implementation).          │
 * │ Output: Inverted half pyramid star pattern.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : rows = 4                                                   │
 * │ Output :                                                            │
 * │ ****                                                                │
 * │ ***                                                                 │
 * │ **                                                                  │
 * │ *                                                                   │
 * │ Explanation : The first row contains 4 stars and each subsequent    │
 * │ row contains one less star, forming an inverted half pyramid.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Number of rows is fixed to 4.                                       │
 * │ Nested loops are used for pattern generation.                       │
 * │ Row i contains (n - i + 1) stars.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize the total number of rows n.                     │
 * │ Step 2 : Use an outer loop to iterate through each row.             │
 * │ Step 3 : For each row, calculate the number of stars as             │
 * │          (n - line + 1).                                            │
 * │ Step 4 : Use an inner loop to print the required stars.             │
 * │ Step 5 : Move to the next line after completing each row.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → ****                                                        │
 * │ Row 2 → ***                                                         │
 * │ Row 3 → **                                                          │
 * │ Row 4 → *                                                           │
 * │ Final Output Forms an Inverted Half Pyramid                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Inverted_Half_Pyramid {                                 ║
* ║     public static void main(String args[]){                          ║
* ║         int n = 4;                                                   ║
* ║         for(int line=1; line<=n; line++){                            ║
* ║                                                                      ║
* ║             for(int star=1; star<=n-line+1; star++){                 ║
* ║                 System.out.print("*");                               ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace:                                          ║
* ║                                                                      ║
* ║  Outer Loop (line) | Inner Loop Bound (n - line + 1) | Print Output  ║
* ║  ------------------|----------------------------------|------------  ║
* ║      line = 1      | star <= 4 - 1 + 1 (Runs 4 times) | ****         ║
* ║      line = 2      | star <= 4 - 2 + 1 (Runs 3 times) | ***          ║
* ║      line = 3      | star <= 4 - 3 + 1 (Runs 2 times) |              ║
* ║      line = 4      | star <= 4 - 4 + 1 (Runs 1 time)  | *            ║
* ║                                                                      ║
* ║  Console Output:                                                     ║
* ║  ****                                                                ║
* ║  ***                                                                 ║
* ║                                                                      ║
* ║  *                                                                   ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - The outer loop tracks row numbers from 1 to `n`.                  ║
* ║  - The formula `n - line + 1` maps the decreasing behavior of stars  ║
* ║    in inverse proportion to the rising line index.                   ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/