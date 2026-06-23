/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [07/06/26] → #2  [08/06/26] → #3  [09/06/26]                    │
 * │  #4  [10/06/26] → #5  [11/06/26] → #6  [12/06/26]                    │
 * │  #7  [13/06/26] → #8  [14/06/26] → #9  [15/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 35: Pass or Fail Determination using Ternary Operator        ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given a student's marks, determine whether the student has passed   │
* │ or failed based on a minimum passing criteria of 33 marks.          │
* │                                                                     │
* │ Use a ternary operator to decide and print the result.              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : mark = 67                                                  │
* │ Output : PASS                                                       │
* │ Explanation : 67 ≥ 33, so student is considered PASS.               │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • mark is an integer                                                │
* │ • Minimum passing criteria is fixed at 33                           │
* │ • Uses ternary operator only                                        │
* │ • No loops or complex structures                                    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Take integer input mark                                    │
* │ Step 2 : Check condition (mark >= 33)                               │
* │ Step 3 : If true → assign "PASS"                                    │
* │ Step 4 : Else → assign "FAIL"                                       │
* │ Step 5 : Print the final status                                     │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Expression (Ternary Operator / Decision Making)         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (single comparison operation)              │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */


public class Pass_Fail_Turnary {
    public static void main(String args[]){
        
    }
}

/**
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 35: Pass or Fail Determination using Ternary Operator        ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given a student's marks, determine whether the student has passed   │
* │ or failed based on a minimum passing criteria of 33 marks.          │
* │                                                                     │
* │ Use a ternary operator to decide and print the result.              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : mark = 67                                                  │
* │ Output : PASS                                                       │
* │ Explanation : 67 ≥ 33, so student is considered PASS.               │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • mark is an integer                                                │
* │ • Minimum passing criteria is fixed at 33                           │
* │ • Uses ternary operator only                                        │
* │ • No loops or complex structures                                    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Take integer input mark                                    │
* │ Step 2 : Check condition (mark >= 33)                               │
* │ Step 3 : If true → assign "PASS"                                    │
* │ Step 4 : Else → assign "FAIL"                                       │
* │ Step 5 : Print the final status                                     │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Expression (Ternary Operator / Decision Making)         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (single comparison operation)              │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Pass_Fail_Turnary {                                     ║
* ║     public static void main(String args[]){                          ║
* ║         int mark = 67;                                               ║
* ║         String status = (mark >= 33)? "PASS" : "FAIL";               ║
* ║         System.out.println(status);                                  ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
