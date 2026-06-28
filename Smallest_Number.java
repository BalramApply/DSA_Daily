/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [20/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 97: Find the Smallest Element in an Array                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, find and return the smallest element        │
 * │ present in the array.                                               │
 * │ Input: An integer array.                                            │
 * │ Output: The minimum element in the array.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [12, 46, 23, 64, 18, 90, 45, 33]                           │
 * │ Output : 12                                                         │
 * │ Explanation : Each element is compared with the current minimum.    │
 * │ After traversing the array, the smallest value found is 12.         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array must contain at least one element.                            │
 * │ Elements may be positive, negative, or zero.                        │
 * │ Integer.MAX_VALUE is used as the initial minimum value.             │
 * │ Duplicate minimum values are allowed.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize the smallest value as Integer.MAX_VALUE.        │
 * │ Step 2 : Traverse the array from the first element to the last.     │
 * │ Step 3 : Compare each element with the current smallest value.      │
 * │ Step 4 : Update the smallest value if a smaller element is found.   │
 * │ Step 5 : Continue until all elements are processed.                 │
 * │ Step 6 : Return the smallest element.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Linear Traversal | Minimum Element Search                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [12, 46, 23, 64, 18, 90, 45, 33]                            │
 * │ Initial Smallest = Integer.MAX_VALUE                                │
 * │ 12 → Smallest = 12                                                  │
 * │ 46 → Smallest = 12                                                  │
 * │ 23 → Smallest = 12                                                  │
 * │ 64 → Smallest = 12                                                  │
 * │ 18 → Smallest = 12                                                  │
 * │ 90 → Smallest = 12                                                  │
 * │ 45 → Smallest = 12                                                  │
 * │ 33 → Smallest = 12                                                  │
 * │ Final Answer = 12                                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Smallest_Number {
    

    public static void main(String args[]) {
        int numbers[] = { 12, 46, 23, 64, 18, 90, 45, 33 };
        
    }
}
/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [20/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 97: Find the Smallest Element in an Array                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, find and return the smallest element        │
 * │ present in the array.                                               │
 * │ Input: An integer array.                                            │
 * │ Output: The minimum element in the array.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [12, 46, 23, 64, 18, 90, 45, 33]                           │
 * │ Output : 12                                                         │
 * │ Explanation : Each element is compared with the current minimum.    │
 * │ After traversing the array, the smallest value found is 12.         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array must contain at least one element.                            │
 * │ Elements may be positive, negative, or zero.                        │
 * │ Integer.MAX_VALUE is used as the initial minimum value.             │
 * │ Duplicate minimum values are allowed.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize the smallest value as Integer.MAX_VALUE.        │
 * │ Step 2 : Traverse the array from the first element to the last.     │
 * │ Step 3 : Compare each element with the current smallest value.      │
 * │ Step 4 : Update the smallest value if a smaller element is found.   │
 * │ Step 5 : Continue until all elements are processed.                 │
 * │ Step 6 : Return the smallest element.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Linear Traversal | Minimum Element Search                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [12, 46, 23, 64, 18, 90, 45, 33]                            │
 * │ Initial Smallest = Integer.MAX_VALUE                                │
 * │ 12 → Smallest = 12                                                  │
 * │ 46 → Smallest = 12                                                  │
 * │ 23 → Smallest = 12                                                  │
 * │ 64 → Smallest = 12                                                  │
 * │ 18 → Smallest = 12                                                  │
 * │ 90 → Smallest = 12                                                  │
 * │ 45 → Smallest = 12                                                  │
 * │ 33 → Smallest = 12                                                  │
 * │ Final Answer = 12                                                   │
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
║  public class Smallest_Number {                                                                                                  ║
║      public static int smallestNum(int numbers[]) {                                                                              ║
║          int small = Integer.MAX_VALUE;                                                                                          ║
║                                                                                                                                  ║
║          for (int i = 0; i < numbers.length; i++) {                                                                              ║
║              if (small > numbers[i]) {                                                                                           ║
║                  small = numbers[i];                                                                                             ║
║              }                                                                                                                   ║
║          }                                                                                                                       ║
║          return small;                                                                                                           ║
║      }                                                                                                                           ║
║                                                                                                                                  ║
║      public static void main(String args[]) {                                                                                    ║
║          int numbers[] = { 12, 46, 23, 64, 18, 90, 45, 33 };                                                                     ║
║          System.out.println("LARGEST NUMBER IS : " + smallestNum(numbers));                                                      ║
║      }                                                                                                                           ║
║  }                                                                                                                               ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                            DRY RUN & EXECUTION TRACE                                                             ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  Trace Table:                                                                                                                    ║
║  ┌───────────┬───┬────────────┬────────────┬─────────────────────────┬──────────────────────────────┐                            ║
║  │ Iteration │ i │ numbers[i] │   small    │   Condition Check       │ Action Taken                 │                            ║
║  ├───────────┼───┼────────────┼────────────┼─────────────────────────┼──────────────────────────────┤                            ║
║  │   Init    │ - │     -      │ 2147483647 │            -            │ Initialized to Max Value     │                            ║
║  │     1     │ 0 │     12     │ 2147483647 │  2147483647 > 12 (True) │ small updated to 12          │                            ║
║  │     2     │ 1 │     46     │     12     │      12 > 46 (False)    │ No change                    │                            ║
║  │     3     │ 2 │     23     │     12     │      12 > 23 (False)    │ No change                    │                            ║
║  │     4     │ 3 │     64     │     12     │      12 > 64 (False)    │ No change                    │                            ║
║  │     5     │ 4 │     18     │     12     │      12 > 18 (False)    │ No change                    │                            ║
║  │     6     │ 5 │     90     │     12     │      12 > 90 (False)    │ No change                    │                            ║
║  │     7     │ 6 │     45     │     12     │      12 > 45 (False)    │ No change                    │                            ║
║  │     8     │ 7 │     33     │     12     │      12 > 33 (False)    │ No change                    │                            ║
║  └───────────┴───┴────────────┴────────────┴─────────────────────────┴──────────────────────────────┘                            ║
║                                                                                                                                  ║
║  Console Output:                                                                                                                 ║
║  LARGEST NUMBER IS : 12                                                                                                          ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                               ALGORITHMIC ANALYSIS                                                               ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  Mechanics:                                                                                                                      ║
║  The logic tracks the minimum value within an unsorted collection. It sets an initial baseline to the                            ║
║  highest possible integer threshold, then performs a sequential comparison across all elements. While                            ║
║  the logic effectively evaluates and finds the lowest value (12), the string printed inside the main                             ║
║  method hardcodes a semantic misnomer, outputting "LARGEST NUMBER IS :" followed by the minimum value.                           ║
║                                                                                                                                  ║
║  Time Complexity:                                                                                                                ║
║  - Best Case:      O(N) - Must iterate and evaluate every element to guarantee absolute minimality.                              ║
║  - Worst/Avg Case: O(N) - Runs dynamically in proportion to N elements, completing linear evaluation.                            ║
║                                                                                                                                  ║
║  Space Complexity:                                                                                                               ║
║  - Total Space:    O(1) - Execution memory remains bound to static state boundaries with zero scalability.                       ║
╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝
*/