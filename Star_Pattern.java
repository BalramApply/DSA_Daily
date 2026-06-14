/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [01/06/26] → #2  [02/06/26] → #3  [03/06/26]                    │
 * │  #4  [04/06/26] → #5  [05/06/26] → #6  [06/06/26]                    │
 * │  #7  [07/06/26] → #8  [08/06/26] → #9  [09/00/00]                    │
 * │  #10 [00/00/00]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 02: Inverted Right-Angled Star Pattern                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print an inverted right-angled triangle star pattern where the      │
 * │ number of stars decreases by one in each subsequent row.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Output :                                                            │
 * │ * * * *                                                             │
 * │ * * *                                                               │
 * │ * *                                                                 │
 * │ *                                                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ No input is required.                                               │
 * │ Pattern consists of exactly 4 rows.                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Print the first row containing 4 stars.                    │
 * │ Step 2 : Print the second row containing 3 stars.                   │
 * │ Step 3 : Print the third row containing 2 stars.                    │
 * │ Step 4 : Print the fourth row containing 1 star.                    │
 * │ Step 5 : Use println() to move to the next line after each row.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing / Basic Output                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Star_Pattern {
    public static void main(String[] args) {
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM : Inverted Right-Angled Star Pattern                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print an inverted right-angled triangle star pattern where the      │
 * │ number of stars decreases by one in each subsequent row.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Output :                                                            │
 * │ * * * *                                                             │
 * │ * * *                                                               │
 * │ * *                                                                 │
 * │ *                                                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ No input is required.                                               │
 * │ Pattern consists of exactly 4 rows.                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Print the first row containing 4 stars.                    │
 * │ Step 2 : Print the second row containing 3 stars.                   │
 * │ Step 3 : Print the third row containing 2 stars.                    │
 * │ Step 4 : Print the fourth row containing 1 star.                    │
 * │ Step 5 : Use println() to move to the next line after each row.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing / Basic Output                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

// public class Star_Pattern {
//     public static void main(String[] args) {
//         // Printing a right-angled triangle in reverse order
//         System.out.println("* * * *"); // First row with 4 stars
//         System.out.println("* * *");   // Second row with 3 stars
//         System.out.println("* *");     // Third row with 2 stars
//         System.out.println("*");       // Fourth row with 1 star
//     }
// }
