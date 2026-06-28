/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [19/06/26] → #2  [20/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 92: Declare, Initialize, and Access Elements of an Array     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Declare an integer array of fixed size, assign values to specific   │
 * │ indices, and print the value stored at a given index.               │
 * │ Input: No user input. Values are assigned manually.                 │
 * │ Output: Value stored at the specified array index.                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  :                                                            │
 * │ mark[0] = 10                                                        │
 * │ mark[1] = 13                                                        │
 * │ mark[2] = 102                                                       │
 * │ mark[3] = 1033                                                      │
 * │ Output :                                                            │
 * │ 1033                                                                │
 * │ Explanation : The program accesses the element stored at index 3    │
 * │ and prints its value.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array size is fixed to 50.                                          │
 * │ Array indices are zero-based.                                       │
 * │ Accessed index must be within the valid range [0, 49].              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare an integer array of size 50.                       │
 * │ Step 2 : Assign values to selected array indices.                   │
 * │ Step 3 : Access the required element using its index.               │
 * │ Step 4 : Print the retrieved value.                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Index-Based Access                                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [10, 13, 102, 1033, ...]                                    │
 * │ Access index = 3                                                    │
 * │ Retrieved value = 1033                                              │
 * │ Output = 1033                                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1) (Auxiliary)                                 │
 * │ Note: The declared array occupies O(n) memory where n = 50.         │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Array_Declaretion {
    public static void main(String args[]) {
        
    }
}
/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [19/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 92: Declare, Initialize, and Access Elements of an Array     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Declare an integer array of fixed size, assign values to specific   │
 * │ indices, and print the value stored at a given index.               │
 * │ Input: No user input. Values are assigned manually.                 │
 * │ Output: Value stored at the specified array index.                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  :                                                            │
 * │ mark[0] = 10                                                        │
 * │ mark[1] = 13                                                        │
 * │ mark[2] = 102                                                       │
 * │ mark[3] = 1033                                                      │
 * │ Output :                                                            │
 * │ 1033                                                                │
 * │ Explanation : The program accesses the element stored at index 3    │
 * │ and prints its value.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array size is fixed to 50.                                          │
 * │ Array indices are zero-based.                                       │
 * │ Accessed index must be within the valid range [0, 49].              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare an integer array of size 50.                       │
 * │ Step 2 : Assign values to selected array indices.                   │
 * │ Step 3 : Access the required element using its index.               │
 * │ Step 4 : Print the retrieved value.                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Index-Based Access                                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [10, 13, 102, 1033, ...]                                    │
 * │ Access index = 3                                                    │
 * │ Retrieved value = 1033                                              │
 * │ Output = 1033                                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1) (Auxiliary)                                 │
 * │ Note: The declared array occupies O(n) memory where n = 50.         │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Array_Declaretion {                                     ║
* ║     public static void main(String args[]) {                         ║
* ║         int mark[] = new int[50];                                    ║
* ║         mark[0] = 10;                                                ║
* ║         mark[1] = 13;                                                ║
* ║         mark[2] = 102;                                               ║
* ║         mark[3] = 1033;                                              ║
* ║         System.out.print(mark[3]);                                   ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Memory & Array Architecture Details:                                ║
* ║                                                                      ║
* ║  1. Declaration & Instantiation:                                     ║
* ║     - `int mark[] = new int[50];` allocates a continuous block of    ║
* ║       memory capable of holding exactly 50 integer elements.         ║
* ║     - Java automatically initializes all 50 slots with a default     ║
* ║       value of 0.                                                    ║
* ║                                                                      ║
* ║  2. Indexing & Value Assignment:                                     ║
* ║     - Element tracking utilizes zero-based indexing (0 to 49).       ║
* ║     - Indexes 0 through 3 are explicitly updated with your values.   ║
* ║     - Slots 4 through 49 remain explicitly set to 0.                 ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Array Layout Memory Map Visualized:                                 ║
* ║                                                                      ║
* ║   Index:    [0]     [1]     [2]     [3]     [4]  ...   [49]          ║
* ║          ┌───────┬───────┬───────┬───────┬───────┬─────┬───────┐     ║
* ║   Value: │  10   │  13   │  102  │ 1033  │   0   │ ... │   0   │     ║
* ║          └───────┴───────┴───────┴───────┴───────┴─────┴───────┘     ║
* ║                                     │                                ║
* ║                                     └──── System.out.print fetches   ║
* ║                                                                      ║
* ║  Output:                                                             ║
* ║  1033                                                                ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
