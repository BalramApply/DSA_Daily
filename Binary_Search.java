/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [20/06/26] → #2  [21/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 98: Binary Search in a Sorted Array                          ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a sorted integer array and a target key, find the index of    │
 * │ the key using the Binary Search algorithm.                          │
 * │ Return the index if the key is found; otherwise return -1.          │
 * │ Input: Sorted integer array and target key.                         │
 * │ Output: Index of the target element or -1 if not found.             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : arr = [1, 2, 4, 8, 9, 10, 15, 17], key = 10                │
 * │ Output : 5                                                          │
 * │ Explanation : Binary Search repeatedly divides the search space in  │
 * │ half until the target element is located.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array must be sorted in ascending order.                            │
 * │ Array may contain distinct or duplicate elements.                   │
 * │ If duplicates exist, any matching index may be returned.            │
 * │ Returns -1 if the target element is not present.                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize two pointers: start = 0 and end = n - 1.        │
 * │ Step 2 : Calculate the middle index as (start + end) / 2.           │
 * │ Step 3 : If the middle element equals the key, return its index.    │
 * │ Step 4 : If the middle element is smaller than the key, search the  │
 * │          right half by updating start = mid + 1.                    │
 * │ Step 5 : Otherwise, search the left half by updating end = mid - 1. │
 * │ Step 6 : Repeat until start exceeds end.                            │
 * │ Step 7 : Return -1 if the key is not found.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Searching | Binary Search | Divide and Conquer                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [1, 2, 4, 8, 9, 10, 15, 17]                                 │
 * │ Key   : 10                                                          │
 * │ start = 0, end = 7                                                  │
 * │ mid = 3 → arr[3] = 8 < 10 → start = 4                               │
 * │ mid = 5 → arr[5] = 10 == 10 ✓                                       │
 * │ Return index = 5                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(log n)                                         │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Binary_Search {
    

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 4, 8, 9, 10, 15, 17 };
        int key = 10;
        
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
 * ║ PROBLEM 98: Binary Search in a Sorted Array                          ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a sorted integer array and a target key, find the index of    │
 * │ the key using the Binary Search algorithm.                          │
 * │ Return the index if the key is found; otherwise return -1.          │
 * │ Input: Sorted integer array and target key.                         │
 * │ Output: Index of the target element or -1 if not found.             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : arr = [1, 2, 4, 8, 9, 10, 15, 17], key = 10                │
 * │ Output : 5                                                          │
 * │ Explanation : Binary Search repeatedly divides the search space in  │
 * │ half until the target element is located.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array must be sorted in ascending order.                            │
 * │ Array may contain distinct or duplicate elements.                   │
 * │ If duplicates exist, any matching index may be returned.            │
 * │ Returns -1 if the target element is not present.                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize two pointers: start = 0 and end = n - 1.        │
 * │ Step 2 : Calculate the middle index as (start + end) / 2.           │
 * │ Step 3 : If the middle element equals the key, return its index.    │
 * │ Step 4 : If the middle element is smaller than the key, search the  │
 * │          right half by updating start = mid + 1.                    │
 * │ Step 5 : Otherwise, search the left half by updating end = mid - 1. │
 * │ Step 6 : Repeat until start exceeds end.                            │
 * │ Step 7 : Return -1 if the key is not found.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Searching | Binary Search | Divide and Conquer                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Array : [1, 2, 4, 8, 9, 10, 15, 17]                                 │
 * │ Key   : 10                                                          │
 * │ start = 0, end = 7                                                  │
 * │ mid = 3 → arr[3] = 8 < 10 → start = 4                               │
 * │ mid = 5 → arr[5] = 10 == 10 ✓                                       │
 * │ Return index = 5                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(log n)                                         │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*
╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗
║                                                    SOURCE CODE                                                                   ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  public class Binary_Search {                                                                                                    ║
║      public static int search(int numbers[], int key) {                                                                          ║
║          int start = 0;                                                                                                          ║
║          int end = numbers.length - 1;                                                                                           ║
║                                                                                                                                  ║
║          while (start <= end) {                                                                                                  ║
║              int mid = (start + end) / 2;                                                                                        ║
║                                                                                                                                  ║
║              if (numbers[mid] == key) {                                                                                          ║
║                  return mid;                                                                                                     ║
║              } else if (numbers[mid] < key) {                                                                                    ║
║                  start = mid + 1;                                                                                                ║
║              } else {                                                                                                            ║
║                  end = mid - 1;                                                                                                  ║
║              }                                                                                                                   ║
║          }                                                                                                                       ║
║          return -1;                                                                                                              ║
║      }                                                                                                                           ║
║                                                                                                                                  ║
║      public static void main(String args[]) {                                                                                    ║
║          int numbers[] = { 1, 2, 4, 8, 9, 10, 15, 17 };                                                                          ║
║          int key = 10;                                                                                                           ║
║          System.out.println("INDEX OF " + key + " IS : " + search(numbers, key));                                                ║
║      }                                                                                                                           ║
║  }                                                                                                                               ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                            DRY RUN & EXECUTION TRACE                                                             ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  Trace Table:                                                                                                                    ║
║  ┌───────────┬───────┬─────┬─────┬──────────────┬───────────────────┬─────────────────────────────┐                              ║
║  │ Iteration │ start │ end │ mid │ numbers[mid] │  Condition Check  │ Action Taken                │                              ║
║  ├───────────┼───────┼─────┼─────┼──────────────┼───────────────────┼─────────────────────────────┤                              ║
║  │   Init    │   0   │  7  │  -  │      -       │         -         │ Pointers initialized        │                              ║
║  │     1     │   0   │  7  │  3  │      8       │   8 == 10 (False) │ numbers[3] < 10 -> start=4  │                              ║
║  │     2     │   4   │  7  │  5  │      10      │  10 == 10 (True)  │ Match found! Return mid (5) │                              ║
║  └───────────┴───────┴─────┴─────┴──────────────┴───────────────────┴─────────────────────────────┘                              ║
║                                                                                                                                  ║
║  Console Output:                                                                                                                 ║
║  INDEX OF 10 IS : 5                                                                                                              ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                               ALGORITHMIC ANALYSIS                                                               ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  Mechanics:                                                                                                                      ║
║  The implementation follows a classical divide-and-conquer strategy on a sorted linear collection.                               ║
║  By determining a central point (mid), it segments the search space into lower and upper sub-ranges. Each                        ║
║  unsuccessful evaluation drops exactly half of the remaining elements from context, ensuring high performance.                   ║
║                                                                                                                                  ║
║  Time Complexity:                                                                                                                ║
║  - Best Case:      O(1)     - Occurs when the target element lies exactly at the first evaluated mid position.                   ║
║  - Worst/Avg Case: O(log N) - The search domain scales down geometrically, halving every structural loop cycle.                  ║
║                                                                                                                                  ║
║  Space Complexity:                                                                                                               ║
║  - Total Space:    O(1)     - Uses simple mutable pointers internally without demanding active frame-allocation overhead.        ║
╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝
*/
