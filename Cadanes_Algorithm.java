/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [21/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 104: Maximum Subarray Sum (Kadane's Algorithm)               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, find the maximum possible sum among all     │
 * │ contiguous subarrays using Kadane's Algorithm.                      │
 * │ Input: Integer array containing positive and negative numbers.      │
 * │ Output: Maximum subarray sum.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [-3, -2, 4, -1, 5, -3]                                     │
 * │ Output : 8                                                          │
 * │ Explanation : The maximum sum is obtained from the subarray         │
 * │ [4, -1, 5], whose sum is 8.                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may contain positive, negative, or zero values.               │
 * │ Array must contain at least one element.                            │
 * │ This implementation resets the current sum to 0 whenever it becomes │
 * │ negative.                                                           │
 * │ Note: This implementation does not correctly handle arrays          │
 * │ containing only negative numbers.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize current sum (cs) to 0 and maximum sum (ms) to   │
 * │          Integer.MIN_VALUE.                                         │
 * │ Step 2 : Traverse the array from left to right.                     │
 * │ Step 3 : Add the current element to the current sum.                │
 * │ Step 4 : If the current sum becomes negative, reset it to 0.        │
 * │ Step 5 : Update the maximum sum using Math.max(cs, ms).             │
 * │ Step 6 : Continue until all elements are processed.                 │
 * │ Step 7 : Print the maximum subarray sum.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Dynamic Programming | Kadane's Algorithm                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [-3, -2, 4, -1, 5, -3]                                      │
 * │ cs = 0, ms = -∞                                                     │
 * │ -3 → cs = -3 → reset to 0 → ms = 0                                  │
 * │ -2 → cs = -2 → reset to 0 → ms = 0                                  │
 * │  4 → cs = 4              → ms = 4                                   │
 * │ -1 → cs = 3              → ms = 4                                   │
 * │  5 → cs = 8              → ms = 8                                   │
 * │ -3 → cs = 5              → ms = 8                                   │
 * │ Final Answer = 8                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Cadanes_Algorithm {
    
    public static void main(String args[]){
        int numbers[] = {-3, -2 , 4, -1, 5, -3};
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 104: Maximum Subarray Sum (Kadane's Algorithm)               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, find the maximum possible sum among all     │
 * │ contiguous subarrays using Kadane's Algorithm.                      │
 * │ Input: Integer array containing positive and negative numbers.      │
 * │ Output: Maximum subarray sum.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [-3, -2, 4, -1, 5, -3]                                     │
 * │ Output : 8                                                          │
 * │ Explanation : The maximum sum is obtained from the subarray         │
 * │ [4, -1, 5], whose sum is 8.                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may contain positive, negative, or zero values.               │
 * │ Array must contain at least one element.                            │
 * │ This implementation resets the current sum to 0 whenever it becomes │
 * │ negative.                                                           │
 * │ Note: This implementation does not correctly handle arrays          │
 * │ containing only negative numbers.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize current sum (cs) to 0 and maximum sum (ms) to   │
 * │          Integer.MIN_VALUE.                                         │
 * │ Step 2 : Traverse the array from left to right.                     │
 * │ Step 3 : Add the current element to the current sum.                │
 * │ Step 4 : If the current sum becomes negative, reset it to 0.        │
 * │ Step 5 : Update the maximum sum using Math.max(cs, ms).             │
 * │ Step 6 : Continue until all elements are processed.                 │
 * │ Step 7 : Print the maximum subarray sum.                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Dynamic Programming | Kadane's Algorithm                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [-3, -2, 4, -1, 5, -3]                                      │
 * │ cs = 0, ms = -∞                                                     │
 * │ -3 → cs = -3 → reset to 0 → ms = 0                                  │
 * │ -2 → cs = -2 → reset to 0 → ms = 0                                  │
 * │  4 → cs = 4              → ms = 4                                   │
 * │ -1 → cs = 3              → ms = 4                                   │
 * │  5 → cs = 8              → ms = 8                                   │
 * │ -3 → cs = 5              → ms = 8                                   │
 * │ Final Answer = 8                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Cadanes_Algorithm {                                     ║
* ║     public static void maxSubArray(int numbers[]){                   ║
* ║         int ms = Integer.MIN_VALUE;                                  ║
* ║         int cs = 0;                                                  ║
* ║                                                                      ║
* ║         for(int i=0; i<numbers.length; i++){                         ║
* ║             cs += numbers[i];                                        ║
* ║                                                                      ║
* ║             if(cs < 0){                                              ║
* ║                 cs = 0;                                              ║
* ║             }                                                        ║
* ║             ms = Math.max(cs, ms);                                   ║
* ║         }                                                            ║
* ║         System.out.println("maximum sbarray sum is : "+ms);          ║
* ║     }                                                                ║
* ║     public static void main(String args[]){                          ║
* ║         int numbers[] = {-3, -2 , 4, -1, 5, -3};                     ║
* ║         maxSubArray(numbers);                                        ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace (numbers = [-3, -2, 4, -1, 5, -3]):       ║
* ║                                                                      ║
* ║  Index (i) | Value | cs (cs + arr[i]) | Reset (if cs < 0) | ms (Max) ║
* ║  ──────────|───────|──────────────────|──────────────────|────────── ║
* ║     0      |  -3   | 0 + (-3) = -3    | cs = 0           | ms = 0    ║
* ║     1      |  -2   | 0 + (-2) = -2    | cs = 0           | ms = 0    ║
* ║     2      |   4   | 0 + 4 = 4        | cs = 4           | ms = 4    ║
* ║     3      |  -1   | 4 + (-1) = 3     | cs = 3           | ms = 4    ║
* ║     4      |   5   | 3 + 5 = 8        | cs = 8           | ms = 8 ★ ║
* ║     5      |  -3   | 8 + (-3) = 5     | cs = 5           | ms = 8    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║  maximum sbarray sum is : 8                                          ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Algorithmic Dynamics & Edge Case Consideration:                     ║
* ║                                                                      ║
* ║  1. Dynamic Programming Insight:                                     ║
* ║     - Kadane's algorithm works on a simple idea: if a contiguous     ║
* ║       subarray's running total (`cs`) drops below zero, it loses any ║
* ║       ability to contribute positively to future elements.           ║
* ║     - Therefore, we reset `cs = 0` whenever it turns negative.       ║
* ║                                                                      ║
* ║  2. Complexity Comparison:                                           ║
* ║     - Time Complexity: $O(n)$ — Single pass linear traversal!        ║
* ║     - Space Complexity: $O(1)$ — No extra arrays required.           ║
* ║                                                                      ║
* ║  3. ⚠️ All-Negative Array Edge Case Warning:                         ║
* ║     - If the input array contains ONLY negative numbers              ║
* ║       (e.g., `{-3, -2, -5, -1}`), resetting `cs = 0` causes the      ║
* ║       method to output `0` instead of the actual maximum `-1`.       ║
* ║     - Fix: Update `ms = Math.max(numbers[i], ms)` before checking    ║
* ║       if `cs < 0`, or handle the all-negative array check explicitly!║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
