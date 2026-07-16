/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [19/06/26] → #2  [20/06/26] → #3  [21/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 93: Input, Update, and Calculate Percentage Using an Array   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Create an integer array, take marks of three subjects as input,     │
 * │ update specific array elements, display the updated marks, and      │
 * │ calculate the average percentage of the marks.                      │
 * │ Input: Three integer marks entered by the user.                     │
 * │ Output: Updated subject marks and calculated percentage.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 80 75 90                                                   │
 * │ Updates:                                                            │
 * │ marks[2] = 100                                                      │
 * │ marks[1] = 88                                                       │
 * │ Output :                                                            │
 * │ Physics     : 80                                                    │
 * │ Chemistry   : 88                                                    │
 * │ Mathematics : 100                                                   │
 * │ Percentage  : 82%                                                   │
 * │ Explanation : The program updates the specified indices and then    │
 * │ calculates the percentage using the implemented formula.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array size is 30, but only the first three indices are used.        │
 * │ User inputs integer marks.                                          │
 * │ Array indices must remain within valid bounds.                      │
 * │ Note: The implemented percentage formula uses                       │
 * │ (marks[0] + marks[1] + marks[0]) / 3, so marks[0] is counted twice  │
 * │ and marks[2] is not included.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create an integer array of size 30.                        │
 * │ Step 2 : Read three subject marks from the user.                    │
 * │ Step 3 : Store the marks in the first three array indices.          │
 * │ Step 4 : Display the entered marks.                                 │
 * │ Step 5 : Update marks[2] to 100.                                    │
 * │ Step 6 : Update marks[1] to 10 + 78 (88).                           │
 * │ Step 7 : Calculate the percentage using the implemented formula.    │
 * │ Step 8 : Print the calculated percentage.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | User Input | Array Update | Arithmetic Calculation          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input Marks : [80, 75, 90]                                          │
 * │ Update marks[2] → 100                                               │
 * │ Update marks[1] → 88                                                │
 * │ Array becomes : [80, 88, 100]                                       │
 * │ Percentage = (80 + 88 + 80) / 3 = 82                                │
 * │ Output : 82%                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1) (Auxiliary)                                 │
 * │ Note: The declared array occupies O(n) memory where n = 30.         │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Array_Percentage {
    public static void main(String args[]) {
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 93: Input, Update, and Calculate Percentage Using an Array   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Create an integer array, take marks of three subjects as input,     │
 * │ update specific array elements, display the updated marks, and      │
 * │ calculate the average percentage of the marks.                      │
 * │ Input: Three integer marks entered by the user.                     │
 * │ Output: Updated subject marks and calculated percentage.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 80 75 90                                                   │
 * │ Updates:                                                            │
 * │ marks[2] = 100                                                      │
 * │ marks[1] = 88                                                       │
 * │ Output :                                                            │
 * │ Physics     : 80                                                    │
 * │ Chemistry   : 88                                                    │
 * │ Mathematics : 100                                                   │
 * │ Percentage  : 82%                                                   │
 * │ Explanation : The program updates the specified indices and then    │
 * │ calculates the percentage using the implemented formula.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Array size is 30, but only the first three indices are used.        │
 * │ User inputs integer marks.                                          │
 * │ Array indices must remain within valid bounds.                      │
 * │ Note: The implemented percentage formula uses                       │
 * │ (marks[0] + marks[1] + marks[0]) / 3, so marks[0] is counted twice  │
 * │ and marks[2] is not included.                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create an integer array of size 30.                        │
 * │ Step 2 : Read three subject marks from the user.                    │
 * │ Step 3 : Store the marks in the first three array indices.          │
 * │ Step 4 : Display the entered marks.                                 │
 * │ Step 5 : Update marks[2] to 100.                                    │
 * │ Step 6 : Update marks[1] to 10 + 78 (88).                           │
 * │ Step 7 : Calculate the percentage using the implemented formula.    │
 * │ Step 8 : Print the calculated percentage.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Array | User Input | Array Update | Arithmetic Calculation          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input Marks : [80, 75, 90]                                          │
 * │ Update marks[2] → 100                                               │
 * │ Update marks[1] → 88                                                │
 * │ Array becomes : [80, 88, 100]                                       │
 * │ Percentage = (80 + 88 + 80) / 3 = 82                                │
 * │ Output : 82%                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1) (Auxiliary)                                 │
 * │ Note: The declared array occupies O(n) memory where n = 30.         │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║                                                                      ║
* ║ public class Array_Percentage {                                      ║
* ║     public static void main(String args[]) {                         ║
* ║         Scanner sc = new Scanner(System.in); // input                ║
* ║         int marks[] = new int[30]; // size 30                        ║
* ║                                                                      ║
* ║         // three elements                                            ║
* ║         marks[0] = sc.nextInt();                                     ║
* ║         marks[1] = sc.nextInt();                                     ║
* ║         marks[2] = sc.nextInt();                                     ║
* ║                                                                      ║
* ║         // subject                                                   ║
* ║         System.out.println("physica : " + marks[0]);                 ║
* ║         System.out.println("chemistry : " + marks[1]);               ║
* ║         System.out.println("mathematics : " + marks[2]);             ║
* ║                                                                      ║
* ║         marks[2] = 100; // updating index 2                          ║
* ║         System.out.println("mathematics : " + marks[2]);             ║
* ║                                                                      ║
* ║         marks[1] = 10 + 78; // updating index 1                      ║
* ║         System.out.println("chemistry : " + marks[1]);               ║
* ║                                                                      ║
* ║         // percentage                                                ║
* ║         int percentage = (marks[0] + marks[1] + marks[0]) / 3;       ║
* ║         System.out.println("percentage : " + percentage + "%");      ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Execution Trace Example (Assuming inputs: 90, 85, 95):              ║
* ║                                                                      ║
* ║  1. Input Phase:                                                     ║
* ║     - marks[0] = 90 (Physics)                                        ║
* ║     - marks[1] = 85 (Chemistry)                                      ║
* ║     - marks[2] = 95 (Mathematics)                                    ║
* ║                                                                      ║
* ║  2. Updates Phase:                                                   ║
* ║     - marks[2] becomes 100 (Math overwritten)                        ║
* ║     - marks[1] becomes 88  (Chemistry overwritten with 10 + 78)      ║
* ║                                                                      ║
* ║  3. Percentage Formula Evaluation:                                   ║
* ║     - calculation: (marks[0] + marks[1] + marks[0])                  ║
* ║     - values:      (   90   +    88   +    90   ) = 268              ║
* ║     - division:    268 / 3 = 89                                      ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  ⚠️ Critical Code Logic Bugs to Note:                                ║
* ║                                                                      ║
* ║  1. Typo in Formula:                                                 ║
* ║     - Look closely at your percentage calculation:                   ║
* ║       (marks[0] + marks[1] + marks[0])                               ║
* ║     - You added marks[0] (Physics) twice instead of adding marks[2]  ║
* ║       (Mathematics). It should be: (marks[0] + marks[1] + marks[2])  ║
* ║                                                                      ║
* ║  2. Integer Division Loss:                                           ║
* ║     - Using `int` for percentage chops off decimal places. Changing  ║
* ║       the data type to `double` or `float` yields accurate fractions.║
* ╚══════════════════════════════════════════════════════════════════════╝
*/