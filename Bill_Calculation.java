/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [03/06/26] → #2  [04/06/26] → #3  [05/06/26]                    │
 * │  #4  [06/06/26] → #5  [07/06/26] → #6  [08/06/26]                    │
 * │  #7  [09/06/26] → #8  [10/06/26] → #9  [11/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 15: Bill Calculation                                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read the prices of a pencil, pen, and eraser from the user.         │
 * │ Calculate the subtotal, apply 18% tax, and display the final bill   │
 * │ amount including tax.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : pencil = 5.0, pen = 10.0, eraser = 5.0                     │
 * │ Output : TOTAL BILL WITH 18% TAX : 23.6                             │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Subtotal = 5.0 + 10.0 + 5.0 = 20.0                                  │
 * │ Tax      = 20.0 × 18 / 100 = 3.6                                    │
 * │ Final Bill = 20.0 + 3.6 = 23.6                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Item prices must be non-negative values.                            │
 * │ Inputs should be valid floating-point numbers.                      │
 * │ Tax rate is fixed at 18%.                                           │
 * │ Scanner object should be closed after use.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for user input.                    │
 * │ Step 2 : Read the prices of pencil, pen, and eraser.                │
 * │ Step 3 : Calculate the subtotal of all items.                       │
 * │ Step 4 : Compute 18% tax on the subtotal.                           │
 * │ Step 5 : Add tax to the subtotal to get the final bill.             │
 * │ Step 6 : Display the subtotal and final bill amount.                │
 * │ Step 7 : Close the Scanner object.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Input / Output Handling + Financial Calculation                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Bill_Calculation {
    public static void main(String[] args) {
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 15: Bill Calculation                                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Read the prices of a pencil, pen, and eraser from the user.         │
 * │ Calculate the subtotal, apply 18% tax, and display the final bill   │
 * │ amount including tax.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : pencil = 5.0, pen = 10.0, eraser = 5.0                     │
 * │ Output : TOTAL BILL WITH 18% TAX : 23.6                             │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ Subtotal = 5.0 + 10.0 + 5.0 = 20.0                                  │
 * │ Tax      = 20.0 × 18 / 100 = 3.6                                    │
 * │ Final Bill = 20.0 + 3.6 = 23.6                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Item prices must be non-negative values.                            │
 * │ Inputs should be valid floating-point numbers.                      │
 * │ Tax rate is fixed at 18%.                                           │
 * │ Scanner object should be closed after use.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create a Scanner object for user input.                    │
 * │ Step 2 : Read the prices of pencil, pen, and eraser.                │
 * │ Step 3 : Calculate the subtotal of all items.                       │
 * │ Step 4 : Compute 18% tax on the subtotal.                           │
 * │ Step 5 : Add tax to the subtotal to get the final bill.             │
 * │ Step 6 : Display the subtotal and final bill amount.                │
 * │ Step 7 : Close the Scanner object.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Input / Output Handling + Financial Calculation                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.*;                                                  ║
* ║ public class Bill_Calculation {                                      ║
* ║     public static void main(String[] args) {                         ║
* ║         Scanner sc = new Scanner(System.in); // Create Scanner object║
* ║                                                                      ║
* ║         // Taking price inputs from the user                         ║
* ║         System.out.print("ENTER THE PRICE OF A PENCIL : ");          ║
* ║         float pencil = sc.nextFloat();                               ║
* ║                                                                      ║
* ║         System.out.print("ENTER THE PRICE OF A PEN : ");             ║
* ║         float pen = sc.nextFloat();                                  ║
* ║                                                                      ║
* ║         System.out.print("ENTER THE PRICE OF AN ERASER: ");          ║
* ║         float eraser = sc.nextFloat();                               ║
* ║                                                                      ║
* ║         // Calculating total price                                   ║
* ║         float total = pencil + pen + eraser;                         ║
* ║         System.out.println("BILL : " + total);                       ║
* ║                                                                      ║
* ║         // Calculating bill with 18% tax                             ║
* ║         float tax = 0.18f * total;                                   ║
* ║         float newTotal = total + tax;                                ║
* ║         System.out.println("TOTAL BILL WITH 18% TAX : " + newTotal); ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
