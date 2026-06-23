/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [08/06/26] → #2  [09/06/26] → #3  [10/06/26]                    │
 * │  #4  [11/06/26] → #5  [12/06/26] → #6  [13/06/26]                    │
 * │  #7  [14/06/26] → #8  [15/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 40: Print Day of Week using Switch-Case Mapping              ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer representing a day number (1 to 7), map it to the  │
* │ corresponding day of the week using a switch-case statement.        │
* │                                                                     │
* │ If the input is outside the range 1–7, print an invalid message.    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : week = 4                                                   │
* │ Output : THURSDAY                                                   │
* │ Explanation : Case 4 matches, so "THURSDAY" is printed.             │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • week is an integer                                                │
* │ • Valid range is 1 to 7                                             │
* │ • Uses switch-case control structure                                │
* │ • Default case handles invalid input                                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Read integer value week                                    │
* │ Step 2 : Apply switch-case on week                                  │
* │ Step 3 : Match cases 1–7 to corresponding weekdays                  │
* │ Step 4 : Print matched day                                          │
* │ Step 5 : If no match → execute default case                         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Mapping / Control Flow (Switch-Case Lookup Table)                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (direct constant-time mapping)             │
* │ Space Complexity : O(1)  (no extra memory used)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */

public class Day_of_Week {
    public static void main(String args[]){
        
    }
}

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 40: Print Day of Week using Switch-Case Mapping              ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer representing a day number (1 to 7), map it to the  │
* │ corresponding day of the week using a switch-case statement.        │
* │                                                                     │
* │ If the input is outside the range 1–7, print an invalid message.    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : week = 4                                                   │
* │ Output : THURSDAY                                                   │
* │ Explanation : Case 4 matches, so "THURSDAY" is printed.             │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • week is an integer                                                │
* │ • Valid range is 1 to 7                                             │
* │ • Uses switch-case control structure                                │
* │ • Default case handles invalid input                                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Read integer value week                                    │
* │ Step 2 : Apply switch-case on week                                  │
* │ Step 3 : Match cases 1–7 to corresponding weekdays                  │
* │ Step 4 : Print matched day                                          │
* │ Step 5 : If no match → execute default case                         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Mapping / Control Flow (Switch-Case Lookup Table)                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (direct constant-time mapping)             │
* │ Space Complexity : O(1)  (no extra memory used)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Day_of_Week {                                           ║
* ║     public static void main(String args[]){                          ║
* ║         int week = 4;                                                ║
* ║         switch (week) {                                              ║
* ║             case 1:                                                  ║
* ║                 System.out.println("MONDAY");                        ║
* ║                 break;                                               ║
* ║             case 2:                                                  ║
* ║                 System.out.println("TUESDAY");                       ║
* ║                 break;                                               ║
* ║             case 3:                                                  ║
* ║                 System.out.println("WEDNESDAY");                     ║
* ║                 break;                                               ║
* ║             case 4:                                                  ║
* ║                 System.out.println("THURSDAY");                      ║
* ║                 break;                                               ║
* ║             case 5:                                                  ║
* ║                 System.out.println("FRIDAY");                        ║
* ║                 break;                                               ║
* ║             case 6:                                                  ║
* ║                 System.out.println("SATURDAY");                      ║
* ║                 break;                                               ║
* ║             case 7:                                                  ║
* ║                 System.out.println("SUNDAY");                        ║
* ║                 break;                                               ║
* ║                                                                      ║
* ║             default:                                                 ║
* ║                 System.out.println("Invalid input! Range 1-7.");     ║
* ║                 break;                                               ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/