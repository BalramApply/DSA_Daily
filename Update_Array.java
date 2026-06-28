/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [19/06/26] → #2  [20/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 94: Update Every Element of an Array by Adding 2             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, update every element by adding 2 to its     │
 * │ current value. The updated array is modified in-place and then      │
 * │ printed.                                                            │
 * │ Input: Integer array.                                               │
 * │ Output: Updated array after incrementing each element by 2.         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [11, 34, 46, 21, 35]                                       │
 * │ Output : [13, 36, 48, 23, 37]                                       │
 * │ Explanation : Each array element is increased by 2 using a single   │
 * │ traversal of the array.                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array can contain any valid integer values.                         │
 * │ Array elements are updated in-place.                                │
 * │ The array reference is passed to the update() method.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create an integer array with initial values.               │
 * │ Step 2 : Pass the array to the update() method.                     │
 * │ Step 3 : Traverse the array using a loop.                           │
 * │ Step 4 : Add 2 to each element and store it back in the array.      │
 * │ Step 5 : Return to the main method.                                 │
 * │ Step 6 : Traverse the updated array and print each element.         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | In-Place Update | Linear Traversal                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Initial Array : [11, 34, 46, 21, 35]                                │
 * │ After index 0 : [13, 34, 46, 21, 35]                                │
 * │ After index 1 : [13, 36, 46, 21, 35]                                │
 * │ After index 2 : [13, 36, 48, 21, 35]                                │
 * │ After index 3 : [13, 36, 48, 23, 35]                                │
 * │ After index 4 : [13, 36, 48, 23, 37]                                │
 * │ Output : 13 36 48 23 37                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Update_Array {
    

    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 7};
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 94: Update Every Element of an Array by Adding 2             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, update every element by adding 2 to its     │
 * │ current value. The updated array is modified in-place and then      │
 * │ printed.                                                            │
 * │ Input: Integer array.                                               │
 * │ Output: Updated array after incrementing each element by 2.         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [11, 34, 46, 21, 35]                                       │
 * │ Output : [13, 36, 48, 23, 37]                                       │
 * │ Explanation : Each array element is increased by 2 using a single   │
 * │ traversal of the array.                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array can contain any valid integer values.                         │
 * │ Array elements are updated in-place.                                │
 * │ The array reference is passed to the update() method.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create an integer array with initial values.               │
 * │ Step 2 : Pass the array to the update() method.                     │
 * │ Step 3 : Traverse the array using a loop.                           │
 * │ Step 4 : Add 2 to each element and store it back in the array.      │
 * │ Step 5 : Return to the main method.                                 │
 * │ Step 6 : Traverse the updated array and print each element.         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | In-Place Update | Linear Traversal                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Initial Array : [11, 34, 46, 21, 35]                                │
 * │ After index 0 : [13, 34, 46, 21, 35]                                │
 * │ After index 1 : [13, 36, 46, 21, 35]                                │
 * │ After index 2 : [13, 36, 48, 21, 35]                                │
 * │ After index 3 : [13, 36, 48, 23, 35]                                │
 * │ After index 4 : [13, 36, 48, 23, 37]                                │
 * │ Output : 13 36 48 23 37                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Update_Array {                                          ║
* ║     public static void update(int marks[]) {                         ║
* ║                                                                      ║
* ║         for (int i = 0; i < marks.length; i++) {                     ║
* ║             marks[i] = marks[i] + 2;                                 ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String args[]) {                         ║
* ║         int marks[] = { 11, 34, 46, 21, 35 };                        ║
* ║                                                                      ║
* ║         update(marks);                                               ║
* ║                                                                      ║
* ║         for (int i = 0; i < marks.length; i++) {                     ║
* ║             System.out.print(marks[i] + " ");                        ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Core Concept: Pass by Reference (Reference Copying)                 ║
* ║  - In Java, arrays are treated as objects. When you pass an array    ║
* ║    to a method, Java passes a copy of the reference memory address,  ║
* ║    pointing to the exact same array memory allocation on the heap.   ║
* ║  - Consequently, modifications performed inside the update() method  ║
* ║    directly affect the original array inside the main() function.    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run Tracking Table:                                             ║
* ║                                                                      ║
* ║  Index (i) | Original Value | Operation (marks[i] + 2) | New Value   ║
* ║  ──────────|────────────────|──────────────────────────|──────────── ║
* ║     0      |      11        |         11 + 2           |     13      ║
* ║     1      |      34        |         34 + 2           |     36      ║
* ║     2      |      46        |         46 + 2           |     48      ║
* ║     3      |      21        |         21 + 2           |     23      ║
* ║     4      |      35        |         35 + 2           |     37      ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║  13 36 48 23 37                                                      ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
