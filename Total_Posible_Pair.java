/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [20/06/26] → #2  [21/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 100: Print All Possible Pairs in an Array                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, generate and print every unique pair of     │
 * │ elements. Also count the total number of pairs formed.              │
 * │ Input: Integer array.                                               │
 * │ Output: All unique pairs and the total number of pairs.             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [2, 4, 6, 8]                                               │
 * │ Output :                                                            │
 * │ (2,4) (2,6) (2,8)                                                   │
 * │ (4,6) (4,8)                                                         │
 * │ (6,8)                                                               │
 * │ Total Pairs = 6                                                     │
 * │ Explanation : Every element is paired with all elements that come   │
 * │ after it, ensuring each unique pair is printed exactly once.        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may contain any integer values.                               │
 * │ Each unique pair is generated only once.                            │
 * │ Self-pairs and duplicate pairs are not allowed.                     │
 * │ Total pairs for an array of size n = n × (n - 1) / 2.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize a counter to store the total number of pairs.   │
 * │ Step 2 : Traverse the array using the first loop.                   │
 * │ Step 3 : For each element, start a second loop from the next index. │
 * │ Step 4 : Print the current pair (numbers[i], numbers[j]).           │
 * │ Step 5 : Increment the pair counter after printing each pair.       │
 * │ Step 6 : Continue until all unique pairs are generated.             │
 * │ Step 7 : Print the total number of pairs.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Nested Loops | Pair Generation                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input Array : [2, 4, 6, 8]                                          │
 * │ i = 0 → (2,4) (2,6) (2,8)                                           │
 * │ i = 1 → (4,6) (4,8)                                                 │
 * │ i = 2 → (6,8)                                                       │
 * │ i = 3 → No pairs                                                    │
 * │ Total Pairs = 6                                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Total_Posible_Pair {
    public static void pairs(int numbers[]) {
        int tp = 0;

        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("TOTAL PAIRES IS :" + tp);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12 };
        pairs(numbers);
    }
}

/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 100: Print All Possible Pairs in an Array                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer array, generate and print every unique pair of     │
 * │ elements. Also count the total number of pairs formed.              │
 * │ Input: Integer array.                                               │
 * │ Output: All unique pairs and the total number of pairs.             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : [2, 4, 6, 8]                                               │
 * │ Output :                                                            │
 * │ (2,4) (2,6) (2,8)                                                   │
 * │ (4,6) (4,8)                                                         │
 * │ (6,8)                                                               │
 * │ Total Pairs = 6                                                     │
 * │ Explanation : Every element is paired with all elements that come   │
 * │ after it, ensuring each unique pair is printed exactly once.        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array may contain any integer values.                               │
 * │ Each unique pair is generated only once.                            │
 * │ Self-pairs and duplicate pairs are not allowed.                     │
 * │ Total pairs for an array of size n = n × (n - 1) / 2.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize a counter to store the total number of pairs.   │
 * │ Step 2 : Traverse the array using the first loop.                   │
 * │ Step 3 : For each element, start a second loop from the next index. │
 * │ Step 4 : Print the current pair (numbers[i], numbers[j]).           │
 * │ Step 5 : Increment the pair counter after printing each pair.       │
 * │ Step 6 : Continue until all unique pairs are generated.             │
 * │ Step 7 : Print the total number of pairs.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | Nested Loops | Pair Generation                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input Array : [2, 4, 6, 8]                                          │
 * │ i = 0 → (2,4) (2,6) (2,8)                                           │
 * │ i = 1 → (4,6) (4,8)                                                 │
 * │ i = 2 → (6,8)                                                       │
 * │ i = 3 → No pairs                                                    │
 * │ Total Pairs = 6                                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of elements in the array.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*
╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗
║                                                    SOURCE CODE                                                                   ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  public class Total_Posible_Pair {                                                                                               ║
║      public static void pairs(int numbers[]) {                                                                                   ║
║          int tp = 0;                                                                                                             ║
║                                                                                                                                  ║
║          for (int i = 0; i < numbers.length; i++) {                                                                              ║
║              int curr = numbers[i];                                                                                              ║
║                                                                                                                                  ║
║              for (int j = i + 1; j < numbers.length; j++) {                                                                      ║
║                  System.out.print("(" + curr + "," + numbers[j] + ")");                                                          ║
║                  tp++;                                                                                                           ║
║              }                                                                                                                   ║
║              System.out.println();                                                                                               ║
║          }                                                                                                                       ║
║          System.out.println("TOTAL PAIRES IS :" + tp);                                                                           ║
║      }                                                                                                                           ║
║                                                                                                                                  ║
║      public static void main(String args[]) {                                                                                    ║
║          int numbers[] = { 2, 4, 6, 8, 10, 12 };                                                                                 ║
║          pairs(numbers);                                                                                                         ║
║      }                                                                                                                           ║
║  }                                                                                                                               ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                            DRY RUN & EXECUTION TRACE                                                             ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  Trace Table:                                                                                                                    ║
║  ┌───────────┬───┬──────┬───┬────────────┬─────────────────────────────┬──────────────────────────────────────────────────────┐  ║
║  │ Iteration │ i │ curr │ j │ numbers[j] │ Output Pattern (Printed)    │ Action Taken                                         │  ║
║  ├───────────┼───┼──────┼───┼────────────┼─────────────────────────────┼──────────────────────────────────────────────────────┤  ║
║  │   Init    │ - │  -   │ - │     -      │              -              │ Initialize tp = 0                                    │  ║
║  │     1     │ 0 │  2   │ 1 │     4      │ (2,4)                       │ Print pair, tp incremented to 1                      │  ║
║  │           │   │      │ 2 │     6      │ (2,4)(2,6)                  │ Print pair, tp incremented to 2                      │  ║
║  │           │   │      │ 3 │     8      │ (2,4)(2,6)(2,8)             │ Print pair, tp incremented to 3                      │  ║
║  │           │   │      │ 4 │     10     │ (2,4)(2,6)(2,8)(2,10)       │ Print pair, tp incremented to 4                      │  ║
║  │           │   │      │ 5 │     12     │ (2,4)(2,6)(2,8)(2,10)(2,12) │ Print pair, tp incremented to 5. New line triggered. │  ║
║  │     2     │ 1 │  4   │ 2 │     6      │ (4,6)                       │ Print pair, tp incremented to 6                      │  ║
║  │           │   │      │ 3 │     8      │ (4,6)(4,8)                  │ Print pair, tp incremented to 7                      │  ║
║  │           │   │      │ 4 │     10     │ (4,6)(4,8)(4,10)            │ Print pair, tp incremented to 8                      │  ║
║  │           │   │      │ 5 │     12     │ (4,6)(4,8)(4,10)(4,12)      │ Print pair, tp incremented to 9. New line triggered. │  ║
║  │     3     │ 2 │  6   │ 3 │     8      │ (6,8)                       │ Print pair, tp incremented to 10                     │  ║
║  │           │   │      │ 4 │     10     │ (6,8)(6,10)                 │ Print pair, tp incremented to 11                     │  ║
║  │           │   │      │ 5 │     12     │ (6,8)(6,10)(6,12)           │ Print pair, tp incremented to 12. New line triggered.│  ║
║  │     4     │ 3 │  8   │ 4 │     10     │ (8,10)                      │ Print pair, tp incremented to 13                     │  ║
║  │           │   │      │ 5 │     12     │ (8,10)(8,12)                │ Print pair, tp incremented to 14. New line triggered.│  ║
║  │     5     │ 4 │  10  │ 5 │     12     │ (10,12)                     │ Print pair, tp incremented to 15. New line triggered.│  ║
║  │     6     │ 5 │  12  │ - │     -      │              -              │ j loop initialization (5+1=6) fails. New line.       │  ║
║  └───────────┴───┴──────┴───┴────────────┴─────────────────────────────┴──────────────────────────────────────────────────────┘  ║
║                                                                                                                                  ║
║  Console Output:                                                                                                                 ║
║  (2,4)(2,6)(2,8)(2,10)(2,12)                                                                                                     ║
║  (4,6)(4,8)(4,10)(4,12)                                                                                                          ║
║  (6,8)(6,10)(6,12)                                                                                                               ║
║  (8,10)(8,12)                                                                                                                    ║
║  (10,12)                                                                                                                         ║
║                                                                                                                                  ║
║  TOTAL PAIRES IS :15                                                                                                             ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                               ALGORITHMIC ANALYSIS                                                               ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
║  Mechanics:                                                                                                                      ║
║  The algorithm utilizes two nested loops to map distinct combinations of pairs from the input collection. The external           ║
║  loop establishes a pivot position `curr`, while the internal loop sequentially spans forward elements starting exclusively      ║
║  from index `i + 1`. This effectively counts and outputs unique combinations without duplicate evaluation.                       ║
║                                                                                                                                  ║
║  Time Complexity:                                                                                                                ║
║  - Best Case:      O(N^2) - Regardless of values, nested operations require traversing all geometric intervals.                  ║
║  - Worst/Avg Case: O(N^2) - Summing combinations gives N*(N-1)/2 iterations, defining classic quadratic scale behavior.          ║
║                                                                                                                                  ║
║  Space Complexity:                                                                                                               ║
║  - Total Space:    O(1)   - Operates fully via dynamic local tracking elements without using structural structural scale.        ║
╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝
*/
