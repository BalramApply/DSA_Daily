/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [19/06/26] → #2  [20/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 91: Print a Palindromic Number Pyramid Pattern               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a centered palindromic number pyramid.    │
 * │ Each row first prints numbers in descending order from the current  │
 * │ row number to 1, then in ascending order from 2 back to the row     │
 * │ number, forming a palindrome.                                       │
 * │ Input: Height of the pyramid n.                                     │
 * │ Output: Palindromic number pyramid pattern.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     1                                                               │
 * │    212                                                              │
 * │   32123                                                             │
 * │  4321234                                                            │
 * │ 543212345                                                           │
 * │ Explanation : Each row forms a palindrome by printing descending    │
 * │ numbers followed by ascending numbers.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Row i contains (n - i) leading spaces.                              │
 * │ Descending sequence: i → 1.                                         │
 * │ Ascending sequence: 2 → i.                                          │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : Print (n - i) leading spaces for center alignment.         │
 * │ Step 3 : Print numbers from i down to 1.                            │
 * │ Step 4 : Print numbers from 2 up to i.                              │
 * │ Step 5 : Move to the next line after completing the row.            │
 * │ Step 6 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Palindromic Number Pattern        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → "   1"                                                      │
 * │ Row 2 → "  212"                                                     │
 * │ Row 3 → " 32123"                                                    │
 * │ Row 4 → "4321234"                                                   │
 * │ Final Output Forms a Palindromic Number Pyramid                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = height of the pyramid.                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Palindromic_Pattern {
    
    public static void main(String[] args) {
        int height = 5;
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 91: Print a Palindromic Number Pyramid Pattern               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a centered palindromic number pyramid.    │
 * │ Each row first prints numbers in descending order from the current  │
 * │ row number to 1, then in ascending order from 2 back to the row     │
 * │ number, forming a palindrome.                                       │
 * │ Input: Height of the pyramid n.                                     │
 * │ Output: Palindromic number pyramid pattern.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     1                                                               │
 * │    212                                                              │
 * │   32123                                                             │
 * │  4321234                                                            │
 * │ 543212345                                                           │
 * │ Explanation : Each row forms a palindrome by printing descending    │
 * │ numbers followed by ascending numbers.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Row i contains (n - i) leading spaces.                              │
 * │ Descending sequence: i → 1.                                         │
 * │ Ascending sequence: 2 → i.                                          │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : Print (n - i) leading spaces for center alignment.         │
 * │ Step 3 : Print numbers from i down to 1.                            │
 * │ Step 4 : Print numbers from 2 up to i.                              │
 * │ Step 5 : Move to the next line after completing the row.            │
 * │ Step 6 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Palindromic Number Pattern        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → "   1"                                                      │
 * │ Row 2 → "  212"                                                     │
 * │ Row 3 → " 32123"                                                    │
 * │ Row 4 → "4321234"                                                   │
 * │ Final Output Forms a Palindromic Number Pyramid                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = height of the pyramid.                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Palindromic_Pattern {                                   ║
* ║     public static void Palindromic(int n) {                          ║
* ║                                                                      ║
* ║         for (int i = 1; i <= n; i++) {                               ║
* ║                                                                      ║
* ║             for (int j = 1; j <= (n - i); j++) {                     ║
* ║                 System.out.print(" ");                               ║
* ║             }                                                        ║
* ║                                                                      ║
* ║             for (int j = i; j >= 1; j--) {                           ║
* ║                 System.out.print(j);                                 ║
* ║             }                                                        ║
* ║                                                                      ║
* ║             for (int j = 2; j <= i; j++) {                           ║
* ║                 System.out.print(j);                                 ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║     public static void main(String[] args) {                         ║
* ║         int height = 5;                                              ║
* ║         Palindromic(height);                                         ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace (height = 5):                             ║
* ║                                                                      ║
* ║  Row (i)| Spaces (n-i) | Descending (j=i to 1) | Ascending (j=2 to i)║
* ║  ───────|──────────────|───────────────────────|─────────────────────║
* ║    1    |  4 spaces    | 1                     | [Loop doesn't run]  ║
* ║    2    |  3 spaces    | 21                    | 2                   ║
* ║    3    |  2 spaces    | 321                   | 23                  ║
* ║         |  1 space     | 4321                  | 234                 ║
* ║   5     |  0 spaces    | 54321                 | 2345                ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║      1                                                               ║
* ║     212                                                              ║
* ║    32123                                                             ║
* ║   4321234                                                            ║
* ║  543212345                                                           ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - Each horizontal line forms a numeric palindrome centered around 1.║
* ║  - The first inner loop handles layout indentation with empty spaces.║
* ║  - The second inner loop counts backwards down to 1 (`i` to `1`).    ║
* ║  - The third inner loop completes the mirrored symmetry by counting  ║
* ║    upwards from `2` to the current row index (`i`).                  ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
