/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [08/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 40: Print Day of Week Using Switch Case                      ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a week number (1-7), print the corresponding day of the      │
 * │ week using a switch-case statement.                                │
 * │                                                                    │
 * │ 1 → MONDAY                                                         │
 * │ 2 → TUESDAY                                                        │
 * │ 3 → WEDNESDAY                                                      │
 * │ 4 → THURSDAY                                                       │
 * │ 5 → FRIDAY                                                         │
 * │ 6 → SATURDAY                                                       │
 * │ 7 → SUNDAY                                                         │
 * │                                                                    │
 * │ If the input is outside the range 1-7, print                      │
 * │ "Invalid input!".                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 4                                                         │
 * │ Output : THURSDAY                                                  │
 * │                                                                    │
 * │ Input  : 9                                                         │
 * │ Output : Invalid input!                                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 1 <= week <= 7                                                     │
 * │ Invalid input should be handled using the default case.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Store the week number in an integer variable.             │
 * │ Step 2 : Use a switch statement on the week number.                │
 * │ Step 3 : Match each case (1-7) with its weekday name.             │
 * │ Step 4 : Print the corresponding weekday.                          │
 * │ Step 5 : Use the default case for invalid inputs.                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Switch-Case Statement                                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                       │
 * │ Space : O(1)                                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Day_of_Week {
    public static void main(String args[]){
        
    }
}

/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [08/06/26] → #2  [00/00/00] → #3  [00/00/00]                  │
 * │  #4  [00/00/00] → #5  [00/00/00] → #6  [00/00/00]                  │
 * │  #7  [00/00/00] → #8  [00/00/00] → #9  [00/00/00]                  │
 * │  #10 [00/00/00]                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM : Print Day of Week Using Switch Case                      ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a week number (1-7), print the corresponding day of the      │
 * │ week using a switch-case statement.                                │
 * │                                                                    │
 * │ 1 → MONDAY                                                         │
 * │ 2 → TUESDAY                                                        │
 * │ 3 → WEDNESDAY                                                      │
 * │ 4 → THURSDAY                                                       │
 * │ 5 → FRIDAY                                                         │
 * │ 6 → SATURDAY                                                       │
 * │ 7 → SUNDAY                                                         │
 * │                                                                    │
 * │ If the input is outside the range 1-7, print                      │
 * │ "Invalid input!".                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 4                                                         │
 * │ Output : THURSDAY                                                  │
 * │                                                                    │
 * │ Input  : 9                                                         │
 * │ Output : Invalid input!                                            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 1 <= week <= 7                                                     │
 * │ Invalid input should be handled using the default case.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Store the week number in an integer variable.             │
 * │ Step 2 : Use a switch statement on the week number.                │
 * │ Step 3 : Match each case (1-7) with its weekday name.             │
 * │ Step 4 : Print the corresponding weekday.                          │
 * │ Step 5 : Use the default case for invalid inputs.                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Switch-Case Statement                                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                       │
 * │ Space : O(1)                                                       │
 * └─────────────────────────────────────────────────────────────────────┘
 */

// public class Day_of_Week {
//     public static void main(String args[]){
//         int week = 4;
//         switch (week) {
//             case 1:
//                 System.out.println("MONDAY");
//                 break;
//             case 2:
//                 System.out.println("TUESDAY");
//                 break;
//             case 3:
//                 System.out.println("WEDNESDAY");
//                 break;
//             case 4:
//                 System.out.println("THURSDAY");
//                 break;
//             case 5:
//                 System.out.println("FRIDAY");
//                 break;
//             case 6:
//                 System.out.println("SATURDAY");
//                 break;
//             case 7:
//                 System.out.println("SUNDAY");
//                 break;
        
//             default:
//             System.out.println("Invalid input! Please enter week number between 1-7.");
//                 break;
//         }
//     }
// }