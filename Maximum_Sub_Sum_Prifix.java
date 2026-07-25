/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [21/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 103: Maximum Subarray Sum (Prefix Sum Approach)              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, find the maximum sum among all contiguous   │
 * │ subarrays using the Prefix Sum technique to optimize subarray sum   │
 * │ calculation.                                                        │
 * │ Input: Integer array.                                               │
 * │ Output: Maximum subarray sum.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [1, -2, 6, -1, 3]                                          │
 * │ Output : 8                                                          │
 * │ Explanation : The prefix sum array allows each subarray sum to be   │
 * │ computed in O(1). The maximum sum is obtained from [6, -1, 3].      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may contain positive, negative, or zero values.               │
 * │ Array must contain at least one element.                            │
 * │ Prefix array size is equal to the input array size.                 │
 * │ Subarray sums are computed using prefix differences.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a prefix sum array where prefix[i] stores the sum   │
 * │          of elements from index 0 to i.                             │
 * │ Step 2 : Initialize the first prefix value with the first element.  │
 * │ Step 3 : Fill the remaining prefix array cumulatively.              │
 * │ Step 4 : Choose every possible start index of a subarray.           │
 * │ Step 5 : Choose every possible end index for that start.            │
 * │ Step 6 : Compute the current subarray sum using:                    │
 * │          start == 0 ? prefix[end] : prefix[end] - prefix[start-1].  │
 * │ Step 7 : Compare the current sum with the maximum sum and update it │
 * │          whenever a larger value is found.                          │
 * │ Step 8 : After checking all subarrays, print the maximum sum.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Prefix Sum | Range Sum Query                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input Array : [1, -2, 6, -1, 3]                                     │
 * │ Prefix Array: [1, -1, 5, 4, 7]                                      │
 * │                                                                     │
 * │ start=0, end=0 → Sum = 1                                            │
 * │ start=0, end=1 → Sum = -1                                           │
 * │ start=0, end=2 → Sum = 5                                            │
 * │ start=0, end=3 → Sum = 4                                            │
 * │ start=0, end=4 → Sum = 7                                            │
 * │ start=1, end=1 → Sum = -2                                           │
 * │ start=1, end=2 → Sum = 4                                            │
 * │ start=1, end=3 → Sum = 3                                            │
 * │ start=1, end=4 → Sum = 6                                            │
 * │ start=2, end=2 → Sum = 6                                            │
 * │ start=2, end=3 → Sum = 5                                            │
 * │ start=2, end=4 → Sum = 8 ← Maximum                                  │
 * │ start=3, end=3 → Sum = -1                                           │
 * │ start=3, end=4 → Sum = 2                                            │
 * │ start=4, end=4 → Sum = 3                                            │
 * │ Final Answer = 8                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(n)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Maximum_Sub_Sum_Prifix {
    
    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        
    }
}
/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [21/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 103: Maximum Subarray Sum (Prefix Sum Approach)              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, find the maximum sum among all contiguous   │
 * │ subarrays using the Prefix Sum technique to optimize subarray sum   │
 * │ calculation.                                                        │
 * │ Input: Integer array.                                               │
 * │ Output: Maximum subarray sum.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [1, -2, 6, -1, 3]                                          │
 * │ Output : 8                                                          │
 * │ Explanation : The prefix sum array allows each subarray sum to be   │
 * │ computed in O(1). The maximum sum is obtained from [6, -1, 3].      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may contain positive, negative, or zero values.               │
 * │ Array must contain at least one element.                            │
 * │ Prefix array size is equal to the input array size.                 │
 * │ Subarray sums are computed using prefix differences.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a prefix sum array where prefix[i] stores the sum   │
 * │          of elements from index 0 to i.                             │
 * │ Step 2 : Initialize the first prefix value with the first element.  │
 * │ Step 3 : Fill the remaining prefix array cumulatively.              │
 * │ Step 4 : Choose every possible start index of a subarray.           │
 * │ Step 5 : Choose every possible end index for that start.            │
 * │ Step 6 : Compute the current subarray sum using:                    │
 * │          start == 0 ? prefix[end] : prefix[end] - prefix[start-1].  │
 * │ Step 7 : Compare the current sum with the maximum sum and update it │
 * │          whenever a larger value is found.                          │
 * │ Step 8 : After checking all subarrays, print the maximum sum.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Prefix Sum | Range Sum Query                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input Array : [1, -2, 6, -1, 3]                                     │
 * │ Prefix Array: [1, -1, 5, 4, 7]                                      │
 * │                                                                     │
 * │ start=0, end=0 → Sum = 1                                            │
 * │ start=0, end=1 → Sum = -1                                           │
 * │ start=0, end=2 → Sum = 5                                            │
 * │ start=0, end=3 → Sum = 4                                            │
 * │ start=0, end=4 → Sum = 7                                            │
 * │ start=1, end=1 → Sum = -2                                           │
 * │ start=1, end=2 → Sum = 4                                            │
 * │ start=1, end=3 → Sum = 3                                            │
 * │ start=1, end=4 → Sum = 6                                            │
 * │ start=2, end=2 → Sum = 6                                            │
 * │ start=2, end=3 → Sum = 5                                            │
 * │ start=2, end=4 → Sum = 8 ← Maximum                                  │
 * │ start=3, end=3 → Sum = -1                                           │
 * │ start=3, end=4 → Sum = 2                                            │
 * │ start=4, end=4 → Sum = 3                                            │
 * │ Final Answer = 8                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(n)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Maximum_Sub_Sum_Prifix {                                ║
* ║     public static void maxSubArray(int numbers[]) {                  ║
* ║         int maxSum = Integer.MIN_VALUE;                              ║
* ║         int prefix[] = new int[numbers.length];                      ║
* ║         prefix[0] = numbers[0];                                      ║
* ║                                                                      ║
* ║         for (int i = 1; i < prefix.length; i++) {   // prefix arr    ║
* ║             prefix[i] = prefix[i - 1] + numbers[i];                  ║
* ║         }                                                            ║
* ║                                                                      ║
* ║         print(prefix);                                               ║
* ║         for (int i = 0; i < numbers.length; i++) {  // start         ║
* ║             int start = i;                                           ║
* ║                                                                      ║
* ║             for (int j = i; j < numbers.length; j++) {  // end       ║
* ║                 int end = j;                                         ║
* ║                 int currSum = 0;                                     ║
* ║                                                                      ║
* ║                 currSum = start == 0 ? prefix[end]                   ║
* ║                                      : prefix[end] - prefix[start-1];║
* ║                                                                      ║
* ║                 System.out.println("curr sum : "+currSum);           ║
* ║                                                                      ║
* ║                 if (maxSum < currSum) {                              ║
* ║                     maxSum = currSum;                                ║
* ║                 }                                                    ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║         System.out.println("MAXIMUM SUB ARRAY SUM IS :" + maxSum);   ║
* ║     }                                                                ║
* ║     public static void print(int arr[]){                             ║
* ║         for(int i=0; i<arr.length; i++){                             ║
* ║             System.out.print(arr[i]+" ");                            ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String args[]) {                         ║
* ║         int numbers[] = { 1, -2, 6, -1, 3 };                         ║
* ║         maxSubArray(numbers);                                        ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Prefix Array Calculation & Dry Run:                                 ║
* ║                                                                      ║
* ║  Index (i)     |  0  |  1  |  2  |  3  |  4                          ║
* ║  ──────────────|─────|─────|─────|─────|────                         ║
* ║  numbers[i]    |  1  | -2  |  6  | -1  |  3                          ║
* ║  prefix[i]     |  1  | -1  |  5  |  4  |  7                          ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Subarray Range Evaluation(Formula: prefix[end] - prefix[start - 1]):║
* ║                                                                      ║
* ║ Start (i) | End (j) | Formula Applied      | currSum | Updated maxSum║
* ║ ──────────|─────────|──────────────────────|─────────|───────────────║
* ║   i = 0   |  j = 0  | prefix[0]            |    1    | 1             ║
* ║           |  j = 1  | prefix[1]            |   -1    | 1             ║
* ║           |  j = 2  | prefix[2]            |    5    | 5             ║
* ║           |  j = 3  | prefix[3]            |    4    | 5             ║
* ║           |  j = 4  | prefix[4]            |    7    | 7             ║
* ║ ──────────|─────────|──────────────────────|─────────|───────────────║
* ║   i = 1   |  j = 1  | prefix[1] - prefix[0]|   -2    | 7             ║
* ║           |  j = 2  | prefix[2] - prefix[0]|    4    | 7             ║
* ║           |  j = 3  | prefix[3] - prefix[0]|    3    | 7             ║
* ║           |  j = 4  | prefix[4] - prefix[0]|    6    | 7             ║
* ║ ──────────|─────────|──────────────────────|─────────|───────────────║
* ║   i = 2   |  j = 2  | prefix[2] - prefix[1]|    6    | 7             ║
* ║           |  j = 3  | prefix[3] - prefix[1]|    5    | 7             ║
* ║           |  j = 4  | prefix[4] - prefix[1]|    8    | 8  <-- MAX!   ║
* ║ ──────────|─────────|──────────────────────|─────────|───────────────║
* ║   i = 3   |  j = 3  | prefix[3] - prefix[2]|   -1    | 8             ║
* ║           |  j = 4  | prefix[4] - prefix[2]|    2    | 8             ║
* ║ ──────────|─────────|──────────────────────|─────────|───────────────║
* ║   i = 4   |  j = 4  | prefix[4] - prefix[3]|    3    | 8             ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║  1 -1 5 4 7 curr sum : 1                                             ║
* ║  curr sum : -1                                                       ║
* ║  curr sum : 5                                                        ║
* ║  curr sum : 4                                                        ║
* ║  curr sum : 7                                                        ║
* ║                                                                      ║
* ║  curr sum : -2                                                       ║
* ║  curr sum : 4                                                        ║
* ║  curr sum : 3                                                        ║
* ║  curr sum : 6                                                        ║
* ║                                                                      ║
* ║  curr sum : 6                                                        ║
* ║  curr sum : 5                                                        ║
* ║  curr sum : 8                                                        ║
* ║                                                                      ║
* ║  curr sum : -1                                                       ║
* ║  curr sum : 2                                                        ║
* ║                                                                      ║
* ║  curr sum : 3                                                        ║
* ║                                                                      ║
* ║  MAXIMUM SUB ARRAY SUM IS :8                                         ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Algorithmic Optimization & Complexity:                              ║
* ║                                                                      ║
* ║  1. Why Prefix Sum Beats Brute Force:                                ║
* ║    - By pre-computing cumulative totals in an auxiliary array,       ║
* ║      any range sum $[i \dots j]$ is answered in $O(1)$ constant time ║
* ║       using `prefix[j] - prefix[i - 1]`.                             ║
* ║     - Eliminates the innermost `k` loop.                             ║
* ║                                                                      ║
* ║  2. Complexity Profile:                                              ║
* ║     - Time Complexity: $O(n^2)$ (Reduced from $O(n^3)$).             ║
* ║    - Space Complexity: $O(n)$ for allocating the `prefix[]` array.   ║
* ║                                                                      ║
* ║  3. Next Optimization Level:                                         ║
* ║   - Kadane's Algorithm drops the runtime down to $O(n)$ in a single  ║
* ║       pass with $O(1)$ extra memory space.                           ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/