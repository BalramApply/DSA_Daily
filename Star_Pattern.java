/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [01/06/26] → #2  [02/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 2: Star Pattern                                              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ─────────────────────────────────────────────────┐
 * │ Print a descending inverted right-angled triangle star pattern to    │
 * │ the console output.                                                  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── VISUAL TARGET ─────────────────────────────────────────────────────┐
 * │ * * * *                                                              │
 * │ * * *                                                                │
 * │ * *                                                                  │
 * │ *                                                                    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ──────────────────────────────────────────────────────────┐
 * │ • Method: Execute a sequence of constant print operations, printing  │
 * │           each row manually with decreasing star counts.             │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ──────────────────────────────────────────────┐
 * │ Type:   Basic Syntax / Pattern Output                                │
 * │                                                                      │
 * │ Time:   O(1) → The number of output statements is entirely fixed     │
 * │                and constant (4 rows total).                          │
 * │                                                                      │
 * │ Space:  O(1) → Runs in completely static memory with zero runtime    │
 * │                data structure tracking allocations.                  │
 * └──────────────────────────────────────────────────────────────────────┘
 */
public class Star_Pattern {
    public static void main(String[] args) {
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 2: Star Pattern                                              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ─────────────────────────────────────────────────┐
 * │ Print a descending inverted right-angled triangle star pattern to    │
 * │ the console output.                                                  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── VISUAL TARGET ─────────────────────────────────────────────────────┐
 * │ * * * *                                                              │
 * │ * * *                                                                │
 * │ * *                                                                  │
 * │ *                                                                    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ──────────────────────────────────────────────────────────┐
 * │ • Method: Execute a sequence of constant print operations, printing  │
 * │           each row manually with decreasing star counts.             │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ──────────────────────────────────────────────┐
 * │ Type:   Basic Syntax / Pattern Output                                │
 * │                                                                      │
 * │ Time:   O(1) → The number of output statements is entirely fixed     │
 * │                and constant (4 rows total).                          │
 * │                                                                      │
 * │ Space:  O(1) → Runs in completely static memory with zero runtime    │
 * │                data structure tracking allocations.                  │
 * └──────────────────────────────────────────────────────────────────────┘
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
