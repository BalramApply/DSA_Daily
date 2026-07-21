/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [21/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 101: Print All Possible Subarrays of an Array                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, print every possible contiguous subarray.   │
 * │ Count the total number of subarrays generated.                      │
 * │ Input is an integer array, and the output is all subarrays along    │
 * │ with the total count.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [2, 4, 6]                                                  │
 * │ Output :                                                            │
 * │          2                                                          │
 * │          2 4                                                        │
 * │          2 4 6                                                      │
 * │          ----------------                                           │
 * │          4                                                          │
 * │          4 6                                                        │
 * │          ----------------                                           │
 * │          6                                                          │
 * │          ----------------                                           │
 * │          Total Subarrays = 6                                        │
 * │ Explanation : Every contiguous sequence of the array is printed.    │
 * │               For an array of size n, total subarrays =             │
 * │               n × (n + 1) / 2.                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Array contains integer elements.                                  │
 * │ • Only contiguous subarrays are considered.                         │
 * │ • Array size should be greater than or equal to 1.                  │
 * │ • Output size grows quadratically with array length.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Traverse each index as the starting point of a subarray.   │
 * │ Step 2 : For every start index, iterate through all possible end    │
 * │          indices.                                                   │
 * │ Step 3 : Print elements from start to end using another loop.       │
 * │ Step 4 : Increment the subarray counter after printing each         │
 * │          subarray.                                                  │
 * │ Step 5 : After all iterations, print the total number of            │
 * │          subarrays generated.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Brute Force (Triple Nested Loop / Array Traversal)                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : [2, 4, 6]                                                   │
 * │ i = 0 → (2), (2,4), (2,4,6)                                         │
 * │ i = 1 → (4), (4,6)                                                  │
 * │ i = 2 → (6)                                                         │
 * │ Total Subarrays = 6                                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n³)                                            │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Total_Subarray {
    
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6};
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 101: Print All Possible Subarrays of an Array                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, print every possible contiguous subarray.   │
 * │ Count the total number of subarrays generated.                      │
 * │ Input is an integer array, and the output is all subarrays along    │
 * │ with the total count.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [2, 4, 6]                                                  │
 * │ Output :                                                            │
 * │          2                                                          │
 * │          2 4                                                        │
 * │          2 4 6                                                      │
 * │          ----------------                                           │
 * │          4                                                          │
 * │          4 6                                                        │
 * │          ----------------                                           │
 * │          6                                                          │
 * │          ----------------                                           │
 * │          Total Subarrays = 6                                        │
 * │ Explanation : Every contiguous sequence of the array is printed.    │
 * │               For an array of size n, total subarrays =             │
 * │               n × (n + 1) / 2.                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Array contains integer elements.                                  │
 * │ • Only contiguous subarrays are considered.                         │
 * │ • Array size should be greater than or equal to 1.                  │
 * │ • Output size grows quadratically with array length.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Traverse each index as the starting point of a subarray.   │
 * │ Step 2 : For every start index, iterate through all possible end    │
 * │          indices.                                                   │
 * │ Step 3 : Print elements from start to end using another loop.       │
 * │ Step 4 : Increment the subarray counter after printing each         │
 * │          subarray.                                                  │
 * │ Step 5 : After all iterations, print the total number of            │
 * │          subarrays generated.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Brute Force (Triple Nested Loop / Array Traversal)                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : [2, 4, 6]                                                   │
 * │ i = 0 → (2), (2,4), (2,4,6)                                         │
 * │ i = 1 → (4), (4,6)                                                  │
 * │ i = 2 → (6)                                                         │
 * │ Total Subarrays = 6                                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n³)                                            │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Total_Subarray {                                        ║
* ║     public static void subArray(int numbers[]) {                     ║
* ║         int ts = 0;                                                  ║
* ║                                                                      ║
* ║         for (int i = 0; i < numbers.length; i++) {                   ║
* ║             int start = i;                                           ║
* ║                                                                      ║
* ║             for (int j = i; j < numbers.length; j++) {               ║
* ║                 int end = j;                                         ║
* ║                                                                      ║
* ║                 for (int k = start; k <= end; k++) {                 ║
* ║                     System.out.print(numbers[k] + " ");              ║
* ║                 }                                                    ║
* ║                 ts++;                                                ║
* ║                 System.out.println();                                ║
* ║             }                                                        ║
* ║             System.out.println("----------------");                  ║
* ║         }                                                            ║
* ║         System.out.println("total subarrays is :" + ts);             ║
* ║     }                                                                ║
* ║     public static void main(String args[]) {                         ║
* ║         int numbers[] = { 2, 4, 6, 8, 10 };                          ║
* ║         subArray(numbers);                                           ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Execution Trace & Subarray Generation (n = 5):                      ║
* ║                                                                      ║
* ║  Start (i) | End (j)  | Elements Printed (k loop from start to end)  ║
* ║  ──────────|──────────|────────────────────────────────────────────  ║
* ║    i = 0   |  j = 0   | 2                                            ║
* ║  (start=2) |  j = 1   | 2 4                                          ║
* ║            |  j = 2   | 2 4 6                                        ║
* ║            |  j = 3   | 2 4 6 8                                      ║
* ║            |  j = 4   | 2 4 6 8 10                                   ║
* ║  ──────────|──────────|────────────────────────────────────────────  ║
* ║    i = 1   |  j = 1   | 4                                            ║
* ║  (start=4) |  j = 2   | 4 6                                          ║
* ║            |  j = 3   | 4 6 8                                        ║
* ║            |  j = 4   | 4 6 8 10                                     ║
* ║  ──────────|──────────|────────────────────────────────────────────  ║
* ║    i = 2   |  j = 2   | 6                                            ║
* ║  (start=6) |  j = 3   | 6 8                                          ║
* ║            |  j = 4   | 6 8 10                                       ║
* ║  ──────────|──────────|────────────────────────────────────────────  ║
* ║    i = 3   |  j = 3   | 8                                            ║
* ║  (start=8) |  j = 4   | 8 10                                         ║
* ║  ──────────|──────────|────────────────────────────────────────────  ║
* ║    i = 4   |  j = 4   | 10                                           ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║  2                                                                   ║
* ║  2 4                                                                 ║
* ║  2 4 6                                                               ║
* ║  2 4 6 8                                                             ║
* ║  2 4 6 8 10                                                          ║
* ║  ----------------                                                    ║
* ║  4                                                                   ║
* ║  4 6                                                                 ║
* ║  4 6 8                                                               ║
* ║  4 6 8 10                                                            ║
* ║  ----------------                                                    ║
* ║  6                                                                   ║
* ║  6 8                                                                 ║
* ║  6 8 10                                                              ║
* ║  ----------------                                                    ║
* ║  8                                                                   ║
* ║  8 10                                                                ║
* ║  ----------------                                                    ║
* ║  10                                                                  ║
* ║  ----------------                                                    ║
* ║  total subarrays is :15                                              ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Mathematical Mechanics & Complexity:                                ║
* ║                                                                      ║
* ║  1. Total Subarrays Formula:                                         ║
* ║     - For an array of size $n$, total continuous subarrays match the ║
* ║       arithmetic summation formula: $\frac{n \times (n + 1)}{2}$.    ║
* ║     - Given n = 5: $\frac{5 \times 6}{2} = 15$ continuous sequences. ║
* ║                                                                      ║
* ║  2. Loop Mechanics:                                                  ║
* ║     - `i` loop selects the starting element boundaries.              ║
* ║     - `j` loop establishes the ending element bounds.                ║
* ║     - `k` loop traverses and prints items inside those limits.       ║
* ║                                                                      ║
* ║  3. Complexity Profile:                                              ║
* ║     - Time Complexity: $O(n^3)$ due to the triple nested layer.      ║
* ║     - Space Complexity: $O(1)$ constant overhead storage space.      ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/