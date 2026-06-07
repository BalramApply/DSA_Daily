/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [03/06/26] → #2  [04/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 15: Bill Calculation                                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Capture the individual costs of three stationary items (a pencil,    │
 * │ a pen, and an eraser) from the user using floating-point types.      │
 * │ Calculate their subtotal, apply an additional 18% tax surcharge, and │
 * │ output the final gross bill amount.                                 │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input:  pencil = 5.0, eraser = 5.0, pen = 10.0                       │
 * │ Output: 23.60                                                        │
 * │                                                                      │
 * │ Explanation:                                                         │
 * │   • Subtotal = 5.0 + 5.0 + 10.0 = 20.0                               │
 * │   • Tax (18%) = 20.0 * 0.18 = 3.60                                   │
 * │   • Gross Bill = 20.0 + 3.60 = 23.60                                  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Streaming Input: Capture three floating-point pricing tokens using │
 * │                     the input stream reader (`nextFloat()`).         │
 * │ 2. Subtotaling:     Accumulate the individual values into a single   │
 * │                     base cost container variable.                    │
 * │ 3. Tax Evaluation:  Multiply the base subtotal by a scalar factor of  │
 * │                     1.18 to compound the 18% tax surcharge.          │
 * │ 4. Flush:           Display the final evaluated bill total back onto │
 * │                     the system console display line.                 │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Financial Formula Evaluation / Floating-Point Arithmetic     │
 * │ Limit:  Inputs must be non-negative numeric floating-point values    │
 * │                                                                      │
 * │ Time:   O(1) → Sequential operations and scalar multiplication run   │
 * │                in a strict, completely fixed number of CPU cycles.   │
 * │                                                                      │
 * │ Space:  O(1) → Memory requirements stay constant, using a tiny,      │
 * │                isolated group of primitive stack parameters.        │
 * └──────────────────────────────────────────────────────────────────────┘
 */


public class Bill_Calculation {
    public static void main(String[] args) {
        
    }
}

/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 15: Bill Calculation                                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Capture the individual costs of three stationary items (a pencil,    │
 * │ a pen, and an eraser) from the user using floating-point types.      │
 * │ Calculate their subtotal, apply an additional 18% tax surcharge, and │
 * │ output the final gross bill amount.                                 │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input:  pencil = 5.0, eraser = 5.0, pen = 10.0                       │
 * │ Output: 23.60                                                        │
 * │                                                                      │
 * │ Explanation:                                                         │
 * │   • Subtotal = 5.0 + 5.0 + 10.0 = 20.0                               │
 * │   • Tax (18%) = 20.0 * 0.18 = 3.60                                   │
 * │   • Gross Bill = 20.0 + 3.60 = 23.60                                  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Streaming Input: Capture three floating-point pricing tokens using │
 * │                     the input stream reader (`nextFloat()`).         │
 * │ 2. Subtotaling:     Accumulate the individual values into a single   │
 * │                     base cost container variable.                    │
 * │ 3. Tax Evaluation:  Multiply the base subtotal by a scalar factor of  │
 * │                     1.18 to compound the 18% tax surcharge.          │
 * │ 4. Flush:           Display the final evaluated bill total back onto │
 * │                     the system console display line.                 │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Financial Formula Evaluation / Floating-Point Arithmetic     │
 * │ Limit:  Inputs must be non-negative numeric floating-point values    │
 * │                                                                      │
 * │ Time:   O(1) → Sequential operations and scalar multiplication run   │
 * │                in a strict, completely fixed number of CPU cycles.   │
 * │                                                                      │
 * │ Space:  O(1) → Memory requirements stay constant, using a tiny,      │
 * │                isolated group of primitive stack parameters.        │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// import java.util.*;
// public class Bill_Calculation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); // Create Scanner object

//         // Taking price inputs from the user
//         System.out.print("ENTER THE PRICE OF A PENCIL : ");
//         float pencil = sc.nextFloat();

//         System.out.print("ENTER THE PRICE OF A PEN : ");
//         float pen = sc.nextFloat();

//         System.out.print("ENTER THE PRICE OF AN ERASER: ");
//         float eraser = sc.nextFloat();

//         // Calculating total price
//         float total = pencil + pen + eraser;
//         System.out.println("BILL : " + total);

//         // Calculating bill with 18% tax
//         float tax = 0.18f * total;
//         float newTotal = total + tax;
//         System.out.println("TOTAL BILL WITH 18% TAX : " + newTotal);
//     }
// }
