/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [20/06/26] → #2  [21/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 96: Find the Largest Element in an Array                     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, find and return the largest element present │
 * │ in the array.                                                       │
 * │ Input: Integer array.                                               │
 * │ Output: The maximum element in the array.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [12, 46, 23, 64, 78, 90, 65, 33]                           │
 * │ Output : 90                                                         │
 * │ Explanation : The array is traversed once while maintaining the     │
 * │ maximum value found so far.                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array must contain at least one element.                            │
 * │ Elements may be positive, negative, or zero.                        │
 * │ Integer.MIN_VALUE is used as the initial maximum value.             │
 * │ Duplicate maximum values are allowed.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize the maximum value as Integer.MIN_VALUE.         │
 * │ Step 2 : Traverse the array from the first element to the last.     │
 * │ Step 3 : Compare the current element with the maximum value.        │
 * │ Step 4 : If the current element is larger, update the maximum.      │
 * │ Step 5 : Continue until all elements have been processed.           │
 * │ Step 6 : Return the final maximum value.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Linear Traversal | Maximum Element Search                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [12, 46, 23, 64, 78, 90, 65, 33]                            │
 * │ Initial Maximum = Integer.MIN_VALUE                                 │
 * │ 12 → Maximum = 12                                                   │
 * │ 46 → Maximum = 46                                                   │
 * │ 23 → Maximum = 46                                                   │
 * │ 64 → Maximum = 64                                                   │
 * │ 78 → Maximum = 78                                                   │
 * │ 90 → Maximum = 90                                                   │
 * │ 65 → Maximum = 90                                                   │
 * │ 33 → Maximum = 90                                                   │
 * │ Final Answer = 90                                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Largest_Number {
    

    public static void main(String args[]) {
        int numbers[] = { 12, 46, 23, 64, 78, 90, 65, 33 };
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 96: Find the Largest Element in an Array                     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, find and return the largest element present │
 * │ in the array.                                                       │
 * │ Input: Integer array.                                               │
 * │ Output: The maximum element in the array.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [12, 46, 23, 64, 78, 90, 65, 33]                           │
 * │ Output : 90                                                         │
 * │ Explanation : The array is traversed once while maintaining the     │
 * │ maximum value found so far.                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array must contain at least one element.                            │
 * │ Elements may be positive, negative, or zero.                        │
 * │ Integer.MIN_VALUE is used as the initial maximum value.             │
 * │ Duplicate maximum values are allowed.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize the maximum value as Integer.MIN_VALUE.         │
 * │ Step 2 : Traverse the array from the first element to the last.     │
 * │ Step 3 : Compare the current element with the maximum value.        │
 * │ Step 4 : If the current element is larger, update the maximum.      │
 * │ Step 5 : Continue until all elements have been processed.           │
 * │ Step 6 : Return the final maximum value.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Linear Traversal | Maximum Element Search                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [12, 46, 23, 64, 78, 90, 65, 33]                            │
 * │ Initial Maximum = Integer.MIN_VALUE                                 │
 * │ 12 → Maximum = 12                                                   │
 * │ 46 → Maximum = 46                                                   │
 * │ 23 → Maximum = 46                                                   │
 * │ 64 → Maximum = 64                                                   │
 * │ 78 → Maximum = 78                                                   │
 * │ 90 → Maximum = 90                                                   │
 * │ 65 → Maximum = 90                                                   │
 * │ 33 → Maximum = 90                                                   │
 * │ Final Answer = 90                                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*
╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗
║                                                    SOURCE CODE                                                                   ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  public class Largest_Number {                                                                                                   ║
║      public static int largestNum(int numbers[]) {                                                                               ║
║          int larg = Integer.MIN_VALUE;                                                                                           ║
║                                                                                                                                  ║
║          for (int i = 0; i < numbers.length; i++) {                                                                              ║
║              if (larg < numbers[i]) {                                                                                            ║
║                  larg = numbers[i];                                                                                              ║
║              }                                                                                                                   ║
║          }                                                                                                                       ║
║          return larg;                                                                                                            ║
║      }                                                                                                                           ║
║                                                                                                                                  ║
║      public static void main(String args[]) {                                                                                    ║
║          int numbers[] = { 12, 46, 23, 64, 78, 90, 65, 33 };                                                                     ║
║          System.out.println("LARGEST NUMBER IS : " + largestNum(numbers));                                                       ║
║      }                                                                                                                           ║
║  }                                                                                                                               ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                            DRY RUN & EXECUTION TRACE                                                             ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  Trace Table:                                                                                                                    ║
║  ┌───────────┬───┬────────────┬────────────┬─────────────────────────┬──────────────────────────────┐                            ║
║  │ Iteration │ i │ numbers[i] │    larg    │   Condition Check       │ Action Taken                 │                            ║
║  ├───────────┼───┼────────────┼────────────┼─────────────────────────┼──────────────────────────────┤                            ║
║  │   Init    │ - │     -      │ -2147483648│            -            │ Initialized to Min Value     │                            ║
║  │     1     │ 0 │     12     │ -2147483648│ -2147483648 < 12 (True) │ larg updated to 12           │                            ║
║  │     2     │ 1 │     46     │     12     │      12 < 46 (True)     │ larg updated to 46           │                            ║
║  │     3     │ 2 │     23     │     46     │      46 < 23 (False)    │ No change                    │                            ║
║  │     4     │ 3 │     64     │     46     │      46 < 64 (True)     │ larg updated to 64           │                            ║
║  │     5     │ 4 │     78     │     64     │      64 < 78 (True)     │ larg updated to 78           │                            ║
║  │     6     │ 5 │     90     │     78     │      78 < 90 (True)     │ larg updated to 90           │                            ║
║  │     7     │ 6 │     65     │     90     │      90 < 65 (False)    │ No change                    │                            ║
║  │     8     │ 7 │     33     │     90     │      90 < 33 (False)    │ No change                    │                            ║
║  └───────────┴───┴────────────┴────────────┴─────────────────────────┴──────────────────────────────┘                            ║
║                                                                                                                                  ║
║  Console Output:                                                                                                                 ║
║  LARGEST NUMBER IS : 90                                                                                                          ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                               ALGORITHMIC ANALYSIS                                                               ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  Mechanics:                                                                                                                      ║
║  The algorithm initializes a tracker variable with the lowest possible integer value. It sequentially                            ║
║  traverses the array, performing a single-pass comparison. If any element is greater than the current                            ║
║  maximum tracking variable, the tracker is updated. This guarantees finding the global maximum in an unsorted list.              ║
║                                                                                                                                  ║
║  Time Complexity:                                                                                                                ║
║  - Best Case:      O(N) - Must inspect every single element once to confirm it is the largest.                                   ║
║  - Worst/Avg Case: O(N) - Always executes exactly N iterations, where N is the length of the array.                              ║
║                                                                                                                                  ║
║  Space Complexity:                                                                                                               ║
║  - Total Space:    O(1) - Auxiliary space is constant since it only utilizes a few primitive storage variables (i, larg).        ║
╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝
*/
