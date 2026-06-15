/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [08/06/26] → #2  [09/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 40: Print Day of Week using Switch-Case Mapping                ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer representing a day number (1 to 7), map it to the  │
* │ corresponding day of the week using a switch-case statement.        │
* │                                                                      │
* │ If the input is outside the range 1–7, print an invalid message.     │
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
* │ Step 1 : Read integer value week                                   │
* │ Step 2 : Apply switch-case on week                                 │
* │ Step 3 : Match cases 1–7 to corresponding weekdays                 │
* │ Step 4 : Print matched day                                         │
* │ Step 5 : If no match → execute default case                        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Mapping / Control Flow (Switch-Case Lookup Table)                  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (direct constant-time mapping)            │
* │ Space Complexity : O(1)  (no extra memory used)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */