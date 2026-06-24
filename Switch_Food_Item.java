/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [08/06/26] → #2  [09/06/26] → #3  [10/06/26]                    │
 * │  #4  [11/06/26] → #5  [12/06/26] → #6  [13/06/26]                    │
 * │  #7  [14/06/26] → #8  [15/06/26] → #9  [16/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 36: Food Selection using Switch Case Statement               ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer input representing a food choice, display the      │
* │ corresponding food item using a switch-case statement.              │
* │                                                                     │
* │ Each number maps to a specific food item, and invalid input shows   │
* │ a default message.                                                  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : num = 2                                                    │
* │ Output : pizza                                                      │
* │ Explanation : Case 2 matches, so "pizza" is printed.                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • num is an integer                                                 │
* │ • Only predefined cases (1, 2, 3) are valid                         │
* │ • Default case handles invalid input                                │
* │ • Uses switch-case statement only                                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Take integer input num                                     │
* │ Step 2 : Use switch statement on num                                │
* │ Step 3 : Match case 1 → print "samosa"                              │
* │ Step 4 : Match case 2 → print "pizza"                               │
* │ Step 5 : Match case 3 → print "jamun"                               │
* │ Step 6 : If no match → execute default case                         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Control Flow (Switch-Case Multi-Branch Decision Making)             │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant-time branch selection)           │
* │ Space Complexity : O(1)  (no extra memory used)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */

public class Switch_Food_Item {
    public static void main(String args[]){
        int num = 3;
        
    }
}
/* 
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 36: Food Selection using Switch Case Statement               ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer input representing a food choice, display the      │
* │ corresponding food item using a switch-case statement.              │
* │                                                                     │
* │ Each number maps to a specific food item, and invalid input shows   │
* │ a default message.                                                  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : num = 2                                                    │
* │ Output : pizza                                                      │
* │ Explanation : Case 2 matches, so "pizza" is printed.                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • num is an integer                                                 │
* │ • Only predefined cases (1, 2, 3) are valid                         │
* │ • Default case handles invalid input                                │
* │ • Uses switch-case statement only                                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Take integer input num                                     │
* │ Step 2 : Use switch statement on num                                │
* │ Step 3 : Match case 1 → print "samosa"                              │
* │ Step 4 : Match case 2 → print "pizza"                               │
* │ Step 5 : Match case 3 → print "jamun"                               │
* │ Step 6 : If no match → execute default case                         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Control Flow (Switch-Case Multi-Branch Decision Making)             │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant-time branch selection)           │
* │ Space Complexity : O(1)  (no extra memory used)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Switch_Food_Item {                                      ║
* ║     public static void main(String args[]){                          ║
* ║         int num = 2;                                                 ║
* ║         switch (num) {                                               ║
* ║             case 1:                                                  ║
* ║                 System.out.println("samosa");                        ║
* ║                 break;                                               ║
* ║             case 2:                                                  ║
* ║                 System.out.println("pizza");                         ║
* ║                 break;                                               ║
* ║             case 3:                                                  ║
* ║                 System.out.println("jamun");                         ║
* ║                 break;                                               ║
* ║                                                                      ║
* ║             default:                                                 ║
* ║                 System.out.println("wrong input");                   ║
* ║                 break;                                               ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
