/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [15/06/26] → #2  [16/06/26] → #3  [17/06/26]                    │
 * │  #4  [18/06/26] → #5  [19/06/26] → #6  [20/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 72: Two Sum (LeetCode #1)                                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array nums and an integer target, return the       │
 * │ indices of the two numbers whose sum equals the target.             │
 * │ Each input has exactly one valid solution, and the same element     │
 * │ cannot be used twice.                                               │
 * │ Input: Integer array nums and integer target.                       │
 * │ Output: Array containing the indices of the required pair.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : nums = [2,7,11,15], target = 9                             │
 * │ Output : [0,1]                                                      │
 * │ Explanation : nums[0] + nums[1] = 2 + 7 = 9, so the indices         │
 * │ 0 and 1 are returned.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 2 <= nums.length <= 10^4                                            │
 * │ -10^9 <= nums[i] <= 10^9                                            │
 * │ -10^9 <= target <= 10^9                                             │
 * │ Exactly one valid answer exists.                                    │
 * │ The same array element cannot be used more than once.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a HashMap to store each number and its index.       │
 * │ Step 2 : Traverse the array from left to right.                     │
 * │ Step 3 : Compute complement = target - current element.             │
 * │ Step 4 : Check if the complement already exists in the HashMap.     │
 * │ Step 5 : If found, return the stored index and current index.       │
 * │ Step 6 : Otherwise, store the current element and its index in the  │
 * │          HashMap and continue.                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ HashMap (Hash Table) | One-Pass Lookup                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : nums = [2,7,11,15], target = 9                              │
 * │ i = 0 → num = 2, complement = 7 → Not found → Store (2,0)           │
 * │ i = 1 → num = 7, complement = 2 → Found at index 0                  │
 * │ Return [0,1]                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(n)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_Leetcode{
    
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        
    }
}
/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [15/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 72: Two Sum (LeetCode #1)                                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array nums and an integer target, return the       │
 * │ indices of the two numbers whose sum equals the target.             │
 * │ Each input has exactly one valid solution, and the same element     │
 * │ cannot be used twice.                                               │
 * │ Input: Integer array nums and integer target.                       │
 * │ Output: Array containing the indices of the required pair.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : nums = [2,7,11,15], target = 9                             │
 * │ Output : [0,1]                                                      │
 * │ Explanation : nums[0] + nums[1] = 2 + 7 = 9, so the indices         │
 * │ 0 and 1 are returned.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 2 <= nums.length <= 10^4                                            │
 * │ -10^9 <= nums[i] <= 10^9                                            │
 * │ -10^9 <= target <= 10^9                                             │
 * │ Exactly one valid answer exists.                                    │
 * │ The same array element cannot be used more than once.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a HashMap to store each number and its index.       │
 * │ Step 2 : Traverse the array from left to right.                     │
 * │ Step 3 : Compute complement = target - current element.             │
 * │ Step 4 : Check if the complement already exists in the HashMap.     │
 * │ Step 5 : If found, return the stored index and current index.       │
 * │ Step 6 : Otherwise, store the current element and its index in the  │
 * │          HashMap and continue.                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ HashMap (Hash Table) | One-Pass Lookup                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : nums = [2,7,11,15], target = 9                              │
 * │ i = 0 → num = 2, complement = 7 → Not found → Store (2,0)           │
 * │ i = 1 → num = 7, complement = 2 → Found at index 0                  │
 * │ Return [0,1]                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(n)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Arrays;                                             ║
* ║ import java.util.HashMap;                                            ║
* ║ import java.util.Map;                                                ║
* ║                                                                      ║
* ║ public class Two_Sum_Leetcode{                                       ║
* ║     public static int[] twoSum(int[] nums, int target) {             ║
* ║         Map<Integer, Integer> map = new HashMap<>();                 ║
* ║                                                                      ║
* ║         for (int i = 0; i < nums.length; i++) {                      ║
* ║             int complement = target - nums[i];                       ║
* ║                                                                      ║
* ║             if (map.containsKey(complement)) {                       ║
* ║                 return new int[] { map.get(complement), i };         ║
* ║             }                                                        ║
* ║             map.put(nums[i], i);                                     ║
* ║         }                                                            ║
* ║         return new int[] {};                                         ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String[] args) {                         ║
* ║         int nums[] = {2, 7, 11, 15};                                 ║
* ║         int target = 9;                                              ║
* ║         System.out.println(Arrays.toString(twoSum(nums, target)));   ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace for nums = {2, 7, 11, 15}, target = 9:    ║
* ║                                                                      ║
* ║  Iter | i | nums[i] | complement (9 - nums[i]) | map.containsKey?    ║
* ║  -----|---|---------|--------------------------|-------------------  ║
* ║   1   | 0 |    2    |        9 - 2 = 7         | No -> map.put(2,0)  ║ 
* ║   2   | 1 |    7    |        9 - 7 = 2         | Yes! (at index 0)   ║
* ║                                                                      ║
* ║  Output:                                                             ║
* ║  [0, 1]                                                              ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Complexity Analysis:                                                ║
* ║  - Time Complexity: O(n) -> Single pass traversal utilizing constant ║
* ║    O(1) average lookup time of HashMap.                              ║
* ║  - Space Complexity: O(n) -> To store array elements in the map.     ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/