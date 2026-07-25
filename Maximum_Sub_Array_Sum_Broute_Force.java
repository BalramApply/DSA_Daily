/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [21/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 102: Maximum Subarray Sum (Brute Force Approach)             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, find the maximum possible sum among all     │
 * │ contiguous subarrays using the Brute Force approach.                │
 * │ The program also prints every subarray along with its sum.          │
 * │ Input: Integer array.                                               │
 * │ Output: Maximum subarray sum.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [1, -2, 6, -1, 3]                                          │
 * │ Output : 8                                                          │
 * │ Explanation : The maximum sum is obtained from the subarray         │
 * │ [6, -1, 3], whose sum is 8.                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may contain positive, negative, or zero values.               │
 * │ At least one element should be present in the array.                │
 * │ Every possible contiguous subarray is examined.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize maxSum with Integer.MIN_VALUE.                  │
 * │ Step 2 : Select each element as the starting index of a subarray.   │
 * │ Step 3 : Select every possible ending index for that start.         │
 * │ Step 4 : Traverse from start to end to calculate the subarray sum.  │
 * │ Step 5 : Print the current subarray and its sum.                    │
 * │ Step 6 : Update maxSum if the current sum is greater.               │
 * │ Step 7 : Repeat until all contiguous subarrays are processed.       │
 * │ Step 8 : Print the maximum subarray sum.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Brute Force | Nested Loops                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [1, -2, 6, -1, 3]                                           │
 * │ Subarrays and Sums:                                                 │
 * │ [1] → 1                                                             │
 * │ [1, -2] → -1                                                        │
 * │ [1, -2, 6] → 5                                                      │
 * │ [1, -2, 6, -1] → 4                                                  │
 * │ [1, -2, 6, -1, 3] → 7                                               │
 * │ [-2] → -2                                                           │
 * │ [-2, 6] → 4                                                         │
 * │ [-2, 6, -1] → 3                                                     │
 * │ [-2, 6, -1, 3] → 6                                                  │
 * │ [6] → 6                                                             │
 * │ [6, -1] → 5                                                         │
 * │ [6, -1, 3] → 8 ← Maximum                                            │
 * │ [-1] → -1                                                           │
 * │ [-1, 3] → 2                                                         │
 * │ [3] → 3                                                             │
 * │ Final Answer = 8                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n³)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Maximum_Sub_Array_Sum_Broute_Force {
    
    public static void main(String args[]) {
        
    }
}
/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 102: Maximum Subarray Sum (Brute Force Approach)             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, find the maximum possible sum among all     │
 * │ contiguous subarrays using the Brute Force approach.                │
 * │ The program also prints every subarray along with its sum.          │
 * │ Input: Integer array.                                               │
 * │ Output: Maximum subarray sum.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [1, -2, 6, -1, 3]                                          │
 * │ Output : 8                                                          │
 * │ Explanation : The maximum sum is obtained from the subarray         │
 * │ [6, -1, 3], whose sum is 8.                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may contain positive, negative, or zero values.               │
 * │ At least one element should be present in the array.                │
 * │ Every possible contiguous subarray is examined.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize maxSum with Integer.MIN_VALUE.                  │
 * │ Step 2 : Select each element as the starting index of a subarray.   │
 * │ Step 3 : Select every possible ending index for that start.         │
 * │ Step 4 : Traverse from start to end to calculate the subarray sum.  │
 * │ Step 5 : Print the current subarray and its sum.                    │
 * │ Step 6 : Update maxSum if the current sum is greater.               │
 * │ Step 7 : Repeat until all contiguous subarrays are processed.       │
 * │ Step 8 : Print the maximum subarray sum.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Brute Force | Nested Loops                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [1, -2, 6, -1, 3]                                           │
 * │ Subarrays and Sums:                                                 │
 * │ [1] → 1                                                             │
 * │ [1, -2] → -1                                                        │
 * │ [1, -2, 6] → 5                                                      │
 * │ [1, -2, 6, -1] → 4                                                  │
 * │ [1, -2, 6, -1, 3] → 7                                               │
 * │ [-2] → -2                                                           │
 * │ [-2, 6] → 4                                                         │
 * │ [-2, 6, -1] → 3                                                     │
 * │ [-2, 6, -1, 3] → 6                                                  │
 * │ [6] → 6                                                             │
 * │ [6, -1] → 5                                                         │
 * │ [6, -1, 3] → 8 ← Maximum                                            │
 * │ [-1] → -1                                                           │
 * │ [-1, 3] → 2                                                         │
 * │ [3] → 3                                                             │
 * │ Final Answer = 8                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n³)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Maximum_Sub_Array_Sum_Broute_Force {                    ║
* ║     public static void maxSum(int numbers[]) {                       ║
* ║         int maxSum = Integer.MIN_VALUE;                              ║
* ║                                                                      ║
* ║         for (int i = 0; i < numbers.length; i++) {                   ║
* ║             int start = i;                                           ║
* ║                                                                      ║
* ║             for (int j = i; j < numbers.length; j++) {               ║
* ║                 int end = j;                                         ║
* ║                 int currSum = 0;                                     ║
* ║                                                                      ║
* ║                 for (int k = start; k <= end; k++) {                 ║
* ║                     currSum += numbers[k];                           ║
* ║                     System.out.print(numbers[k] + " ");              ║
* ║                 }                                                    ║
* ║                 System.out.println("sum is : "+ currSum);            ║
* ║                                                                      ║
* ║                 if (maxSum < currSum) {                              ║
* ║                     maxSum = currSum;                                ║
* ║                 }                                                    ║
* ║             }                                                        ║
* ║         }                                                            ║
* ║         System.out.println("MAXIMUM SUB ARRAY SUM IS :" + maxSum);   ║
* ║     }                                                                ║
* ║     public static void main(String args[]) {                         ║
* ║         int numbers[] = { 1, -2, 6, -1, 3 };                         ║
* ║         maxSum(numbers);                                             ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║Execution Trace & Subarray Sum Traversal(numbers = [1, -2, 6, -1, 3]):║
* ║                                                                      ║
* ║  Start (i) | End (j) | Subarray Elements | currSum | Updated maxSum  ║
* ║  ──────────|─────────|───────────────────|─────────|──────────────── ║
* ║    i = 0   |  j = 0  | 1                 |    1    | 1               ║
* ║  (val = 1) |  j = 1  | 1, -2             |   -1    | 1               ║
* ║            |  j = 2  | 1, -2, 6          |    5    | 5               ║
* ║            |  j = 3  | 1, -2, 6, -1      |    4    | 5               ║
* ║            |  j = 4  | 1, -2, 6, -1, 3   |    7    | 7               ║
* ║  ──────────|─────────|───────────────────|─────────|──────────────── ║
* ║    i = 1   |  j = 1  | -2                |   -2    | 7               ║
* ║ (val = -2) |  j = 2  | -2, 6             |    4    | 7               ║
* ║            |  j = 3  | -2, 6, -1         |    3    | 7               ║
* ║            |  j = 4  | -2, 6, -1, 3      |    6    | 7               ║
* ║  ──────────|─────────|───────────────────|─────────|──────────────── ║
* ║    i = 2   |  j = 2  | 6                 |    6    | 7               ║
* ║  (val = 6) |  j = 3  | 6, -1             |    5    | 7               ║
* ║            |  j = 4  | 6, -1, 3          |    8    | 8 <-- MAX FOUND!║
* ║  ──────────|─────────|───────────────────|─────────|──────────────── ║
* ║    i = 3   |  j = 3  | -1                |   -1    | 8               ║
* ║ (val = -1) |  j = 4  | -1, 3             |    2    | 8               ║
* ║  ──────────|─────────|───────────────────|─────────|──────────────── ║
* ║    i = 4   |  j = 4  | 3                 |    3    | 8               ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║  1 sum is : 1                                                        ║
* ║  1 -2 sum is : -1                                                    ║
* ║  1 -2 6 sum is : 5                                                   ║
* ║  1 -2 6 -1 sum is : 4                                                ║
* ║  1 -2 6 -1 3 sum is : 7                                              ║
* ║  -2 sum is : -2                                                      ║
* ║  -2 6 sum is : 4                                                     ║
* ║  -2 6 -1 sum is : 3                                                  ║
* ║  -2 6 -1 3 sum is : 6                                                ║
* ║  6 sum is : 6                                                        ║
* ║  6 -1 sum is : 5                                                     ║
* ║  6 -1 3 sum is : 8                                                   ║
* ║  -1 sum is : -1                                                      ║
* ║  -1 3 sum is : 2                                                     ║
* ║  3 sum is : 3                                                        ║
* ║  MAXIMUM SUB ARRAY SUM IS :8                                         ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Algorithmic Analysis & Complexity:                                  ║
* ║                                                                      ║
* ║  1. Brute Force Mechanics:                                           ║
* ║     - `i` fixes the left boundary of the subarray.                   ║
* ║     - `j` fixes the right boundary of the subarray.                  ║
* ║     - `k` iterates from `start` to `end` to manually calculate the   ║
* ║       sum of each subarray from scratch.                             ║
* ║                                                                      ║
* ║  2. Complexity Profile:                                              ║
* ║     - Time Complexity: $O(n^3)$ due to 3 nested loops.               ║
* ║     - Space Complexity: $O(1)$ scalar auxiliary memory.              ║
* ║                                                                      ║
* ║  3. Optimization Roadmap:                                            ║
* ║     - Prefix Sum Approach reduces time to $O(n^2)$.                  ║
* ║     - Kadane's Algorithm further optimizes time down to $O(n)$.      ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/