/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [10/06/26] → #2  [11/06/26] → #3  [12/06/26]                    │
 * │  #4  [13/06/26] → #5  [14/06/26] → #6  [15/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 48: Print Digits of a Number in Reverse Order                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a positive integer, print its digits in reverse order using   │
 * │ a while loop.                                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 1234                                                       │
 * │ Output : 4321                                                       │
 * │ Explanation: Digits are extracted from right to left and printed.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Input should be a positive integer                                │
 * │ • Continue until the number becomes 0                               │
 * │ • Use a while loop                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Store the number in variable n                             │
 * │ Step 2 : Extract the last digit using n % 10                        │
 * │ Step 3 : Print the extracted digit                                  │
 * │ Step 4 : Remove the last digit using n = n / 10                     │
 * │ Step 5 : Repeat until n becomes 0                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration (Digit Extraction Using While Loop)                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(d), where d = number of digits                 │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Print_Reverse_Number {
    public static void main(String[] args) {
       
    }
}

/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 48: Print Digits of a Number in Reverse Order                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a positive integer, print its digits in reverse order using   │
 * │ a while loop.                                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 1234                                                       │
 * │ Output : 4321                                                       │
 * │ Explanation: Digits are extracted from right to left and printed.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Input should be a positive integer                                │
 * │ • Continue until the number becomes 0                               │
 * │ • Use a while loop                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Store the number in variable n                             │
 * │ Step 2 : Extract the last digit using n % 10                        │
 * │ Step 3 : Print the extracted digit                                  │
 * │ Step 4 : Remove the last digit using n = n / 10                     │
 * │ Step 5 : Repeat until n becomes 0                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iteration (Digit Extraction Using While Loop)                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(d), where d = number of digits                 │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

// public class Print_Reverse_Number {
//     public static void main(String[] args) {
//         int n = 1234;

//         while (n > 0) {
//             int last = n % 10;
//             System.out.print(last);
//             n = n / 10;
//         }
//     }
// }
