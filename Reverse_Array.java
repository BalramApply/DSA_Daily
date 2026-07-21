/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [20/06/26] → #2  [21/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 99: Reverse an Array In-Place                                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, reverse its elements in-place without using │
 * │ any additional array.                                               │
 * │ Input: Integer array.                                               │
 * │ Output: Array with elements in reverse order.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [1, 2, 3, 4, 5]                                            │
 * │ Output : [5, 4, 3, 2, 1]                                            │
 * │ Explanation : The first and last elements are swapped repeatedly    │
 * │ until both pointers meet.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may contain any integer values.                               │
 * │ Array can have zero or more elements.                               │
 * │ Reversal is performed in-place without using an extra array.        │
 * │ Two-pointer technique is used for efficient swapping.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize two pointers: first = 0 and last = n - 1.       │
 * │ Step 2 : Swap the elements at the first and last indices.           │
 * │ Step 3 : Increment the first pointer and decrement the last pointer.│
 * │ Step 4 : Repeat until first is no longer less than last.            │
 * │ Step 5 : Print the reversed array.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Two Pointers | In-Place Reversal                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input Array : [1, 2, 3, 4, 5]                                       │
 * │ first = 0, last = 4 → Swap 1 and 5 → [5, 2, 3, 4, 1]                │
 * │ first = 1, last = 3 → Swap 2 and 4 → [5, 4, 3, 2, 1]                │
 * │ first = 2, last = 2 → Stop                                          │
 * │ Final Output : [5, 4, 3, 2, 1]                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Reverse_Array {

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5 };
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
 * ║ PROBLEM 99: Reverse an Array In-Place                                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, reverse its elements in-place without using │
 * │ any additional array.                                               │
 * │ Input: Integer array.                                               │
 * │ Output: Array with elements in reverse order.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [1, 2, 3, 4, 5]                                            │
 * │ Output : [5, 4, 3, 2, 1]                                            │
 * │ Explanation : The first and last elements are swapped repeatedly    │
 * │ until both pointers meet.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may contain any integer values.                               │
 * │ Array can have zero or more elements.                               │
 * │ Reversal is performed in-place without using an extra array.        │
 * │ Two-pointer technique is used for efficient swapping.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize two pointers: first = 0 and last = n - 1.       │
 * │ Step 2 : Swap the elements at the first and last indices.           │
 * │ Step 3 : Increment the first pointer and decrement the last pointer.│
 * │ Step 4 : Repeat until first is no longer less than last.            │
 * │ Step 5 : Print the reversed array.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Two Pointers | In-Place Reversal                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input Array : [1, 2, 3, 4, 5]                                       │
 * │ first = 0, last = 4 → Swap 1 and 5 → [5, 2, 3, 4, 1]                │
 * │ first = 1, last = 3 → Swap 2 and 4 → [5, 4, 3, 2, 1]                │
 * │ first = 2, last = 2 → Stop                                          │
 * │ Final Output : [5, 4, 3, 2, 1]                                      │
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
║  public class Reverse_Array {                                                                                                    ║
║      public static void reverse(int numbers[]) {                                                                                 ║
║          int first = 0;                                                                                                          ║
║          int last = numbers.length - 1;                                                                                          ║
║                                                                                                                                  ║
║          while (first < last) {                                                                                                  ║
║              int temp = numbers[last];                                                                                           ║
║              numbers[last] = numbers[first];                                                                                     ║
║              numbers[first] = temp;                                                                                              ║
║              first++;                                                                                                            ║
║              last--;                                                                                                             ║
║          }                                                                                                                       ║
║      }                                                                                                                           ║
║                                                                                                                                  ║
║      public static void print(int numbers[]) {                                                                                   ║
║          for (int i = 0; i < numbers.length; i++) {                                                                              ║
║              System.out.print(numbers[i] + " ");                                                                                 ║
║          }                                                                                                                       ║
║      }                                                                                                                           ║
║                                                                                                                                  ║
║      public static void main(String[] args) {                                                                                    ║
║          int numbers[] = { 1, 2, 3, 4, 5 };                                                                                      ║
║                                                                                                                                  ║
║          System.out.print("ORIGINAL NUMBER : ");                                                                                 ║
║          print(numbers);                                                                                                         ║
║          reverse(numbers);                                                                                                       ║
║          System.out.println();                                                                                                   ║
║          System.out.print("REVERSE NUMBER : ");                                                                                  ║
║          print(numbers);                                                                                                         ║
║      }                                                                                                                           ║
║  }                                                                                                                               ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                            DRY RUN & EXECUTION TRACE                                                             ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  Trace Table (inside reverse method):                                                                                            ║
║  ┌───────────┬───────┬──────┬──────┬─────────────────┬───────────────────────────┬────────────────────────────────────────────┐  ║
║  │ Iteration │ first │ last │ temp │ Condition Check │ Array State Change        │ Action Taken                               │  ║
║  ├───────────┼───────┼──────┼──────┼─────────────────┼───────────────────────────┼────────────────────────────────────────────┤  ║
║  │   Init    │   0   │  4   │  -   │        -        │ { 1, 2, 3, 4, 5 }         │ Pointers initialized to ends               │  ║
║  │     1     │   0   │  4   │  5   │  0 < 4 (True)   │ { 5, 2, 3, 4, 1 }         │ Swap numbers[0], numbers[4]; first++,last--│  ║
║  │     2     │   1   │  3   │  4   │  1 < 3 (True)   │ { 5, 4, 3, 2, 1 }         │ Swap numbers[1], numbers[3]; first++,last--│  ║
║  │     3     │   2   │  2   │  -   │  2 < 2 (False)  │ { 5, 4, 3, 2, 1 }         │ Loop terminates                           │  ║
║  └───────────┴───────┴──────┴──────┴─────────────────┴───────────────────────────┴────────────────────────────────────────────┘  ║
║                                                                                                                                  ║
║  Console Output:                                                                                                                 ║
║  ORIGINAL NUMBER : 1 2 3 4 5                                                                                                     ║
║  REVERSE NUMBER : 5 4 3 2 1                                                                                                      ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                               ALGORITHMIC ANALYSIS                                                               ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  Mechanics:                                                                                                                      ║
║  The algorithm uses a two-pointer approach to reverse an array in-place. An auxiliary variable (`temp`) is used to swap          ║
║  the symmetric elements located at positions `first` and `last`. The pointers increment and decrement respectively, meeting      ║
║  at the middle of the array, ensuring each element is processed exactly once.                                                    ║
║                                                                                                                                  ║
║  Time Complexity:                                                                                                                ║
║  - Best Case:      O(N) - Linear time execution as the algorithm must traverse half the array to swap all values.                ║
║  - Worst/Avg Case: O(N) - Iterates N/2 times where N is the total count of elements, collapsing asymptotically to linear time.   ║
║                                                                                                                                  ║
║  Space Complexity:                                                                                                               ║
║  - Total Space:    O(1) - The transformation operates directly in-place without scaling memory allocations.                       ║
╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝
*/