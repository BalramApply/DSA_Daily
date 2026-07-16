/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [19/06/26] → #2  [20/06/26] → #3  [21/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 95: Linear Search in an Array                                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array and a target value, search for the target    │
 * │ by traversing the array from left to right.                         │
 * │ Return the index of the target if found; otherwise return -1.       │
 * │ Input: Integer array and target element.                            │
 * │ Output: Index of the target element or -1 if it does not exist.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : arr = [2, 4, 6, 8, 10, 12, 14], target = 10                │
 * │ Output : 4                                                          │
 * │ Explanation : The target value 10 is found at index 4 during the    │
 * │ sequential traversal of the array.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may be unsorted or sorted.                                    │
 * │ Array can contain duplicate values (returns first occurrence).      │
 * │ If the target is absent, return -1.                                 │
 * │ Array size n >= 0.                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Start traversing the array from index 0.                   │
 * │ Step 2 : Compare the current element with the target value.         │
 * │ Step 3 : If they match, immediately return the current index.       │
 * │ Step 4 : Otherwise, continue checking the next element.             │
 * │ Step 5 : If the entire array is traversed without a match, return   │
 * │          -1 to indicate the element is not present.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Searching | Linear Search | Sequential Search                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array  : [2, 4, 6, 8, 10, 12, 14]                                   │
 * │ Target : 10                                                         │
 * │ i = 0 → 2  ≠ 10                                                     │
 * │ i = 1 → 4  ≠ 10                                                     │
 * │ i = 2 → 6  ≠ 10                                                     │
 * │ i = 3 → 8  ≠ 10                                                     │
 * │ i = 4 → 10 = 10 ✓                                                   │
 * │ Return index = 4                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Linear_Search {
    

    public static void main(String[] args) {
        int num[]= {1,2,3,4,5};
        int target=4;
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 95: Linear Search in an Array                                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array and a target value, search for the target    │
 * │ by traversing the array from left to right.                         │
 * │ Return the index of the target if found; otherwise return -1.       │
 * │ Input: Integer array and target element.                            │
 * │ Output: Index of the target element or -1 if it does not exist.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : arr = [2, 4, 6, 8, 10, 12, 14], target = 10                │
 * │ Output : 4                                                          │
 * │ Explanation : The target value 10 is found at index 4 during the    │
 * │ sequential traversal of the array.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may be unsorted or sorted.                                    │
 * │ Array can contain duplicate values (returns first occurrence).      │
 * │ If the target is absent, return -1.                                 │
 * │ Array size n >= 0.                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Start traversing the array from index 0.                   │
 * │ Step 2 : Compare the current element with the target value.         │
 * │ Step 3 : If they match, immediately return the current index.       │
 * │ Step 4 : Otherwise, continue checking the next element.             │
 * │ Step 5 : If the entire array is traversed without a match, return   │
 * │          -1 to indicate the element is not present.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Searching | Linear Search | Sequential Search                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array  : [2, 4, 6, 8, 10, 12, 14]                                   │
 * │ Target : 10                                                         │
 * │ i = 0 → 2  ≠ 10                                                     │
 * │ i = 1 → 4  ≠ 10                                                     │
 * │ i = 2 → 6  ≠ 10                                                     │
 * │ i = 3 → 8  ≠ 10                                                     │
 * │ i = 4 → 10 = 10 ✓                                                   │
 * │ Return index = 4                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Linear_Search {                                         ║
* ║     public static int linear(int arr[], int target) {                ║
* ║                                                                      ║
* ║         for (int i = 0; i < arr.length; i++) {                       ║
* ║             if (arr[i] == target) {                                  ║
* ║                 return i;                                            ║
* ║             }                                                        ║
* ║         }                                                            ║
* ║         return -1;                                                   ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String[] args) {                         ║
* ║         int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };                  ║
* ║         int target = 10;                                             ║
* ║                                                                      ║
* ║         int result = linear(numbers, target);                        ║
* ║                                                                      ║
* ║         if (result != -1) {                                          ║
* ║             System.out.println("ELEMENT FOUND AT INDEX : " + result);║
* ║         } else {                                                     ║
* ║             System.out.println("ELEMENT NOT FOUND IN THE ARRAY");    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Search Execution Trace (target = 10):                     ║
* ║                                                                      ║
* ║  Index (i) | arr[i] | Comparison (arr[i] == target) | Action         ║
* ║  ──────────|────────|───────────────────────────────|─────────────── ║
* ║     0      |   2    |       2 == 10  (False)        | Move to next   ║
* ║     1      |   4    |       4 == 10  (False)        | Move to next   ║
* ║     2      |   6    |       6 == 10  (False)        | Move to next   ║
* ║     3      |   8    |       8 == 10  (False)        | Move to next   ║
* ║     4      |  10    |      10 == 10  (True)         | Return index 4 ║
* ║                                                                      ║
* ║  Console Output:                                                     ║
* ║  ELEMENT FOUND AT INDEX : 4                                          ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Algorithmic Analysis:                                               ║
* ║  - Mechanics: Sequentially steps through the collection starting from║
* ║    index 0 to the last item until a matching profile is confirmed.   ║
* ║  - Time Complexity:                                                  ║
* ║    * Best Case: O(1) - Element resides right at the initial index.   ║
* ║    * Worst / Average Case: O(n) - Item rests at the terminal edge    ║
* ║      or is missing entirely, requiring 'n' search passes.            ║
* ║  - Space Complexity: O(1) - Auxiliary space allocation is constant.  ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/