/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [07/06/26] → #2  [08/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 32: Progressive Income Tax Slab Calculation                  ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Calculate the total financial tax liability for a given integer    │
 * │ income based on a progression of segmented fiscal brackets using standard│
 * │ multi-branch decision trees and implicit type conversions.            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── PROGRESSIVE SLAB MECHANICS ───────────────────────────────────────┐
 * │ • Bracket 1 (Low Range):     Income < 5,00,000    ──> Tax rate = 0%  │
 * │                                                                      │
 * │ • Bracket 2 (Mid Range):     5,00,000 to <10,00,000 ──> Tax rate = 20% │
 * │                                                                      │
 * │ • Bracket 3 (High Range):    Income ≥ 10,00,000   ──> Tax rate = 30% │
 * │                                                                      │
 * │ • Narrowing Cast Constraint: Floating-point rate multiplication yields│
 * │   a double precision product. Result must be casted back to match    │
 * │   integer local storage frameworks.                                  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input:  income = 750000                                              │
 * │ Output: YOUR TAX IS : 150000                                         │
 * │                                                                      │
 * │ Bracket Evaluation Step:                                             │
 * │  • Check 1: (750000 < 500000) ──> false [Skip bracket 1]             │
 * │  • Check 2: (750000 >= 500000 && 750000 < 1000000) ──> true           │
 * │                                                                      │
 * │ Computation Loop:                                                    │
 * │  • Formula:  tax = (int) (750000 * 0.20)                             │
 * │  • Product:  150000.0 (double precision)                              │
 * │  • Cast Type: Truncates decimal bound into integer scalar => 150000   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Buffer Ingestion: Define an integer holding variable representing  │
 * │                      the base gross input revenue profile.           │
 * │ 2. Ladder Filtration: Route metrics down an optimized cascading `else if`│
 * │                      ladder to target the proper coefficient multiplier.│
 * │ 3. Precision Sync:    Force an explicit integer data type cast block to │
 * │                      reconcile type mismatch across assignment boundaries.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Progressive Financial Range Partitioning & Selection Flow    │
 * │ Limit:  Income values must fit within valid signed 32-bit limits      │
 * │                                                                      │
 * │ Time:   O(1) → Relational branch mapping and basic floating multipliers│
 * │                resolve inside flat, invariant hardware clock steps.  │
 * │                                                                      │
 * │ Space:  O(1) → Operations scale completely in-place, keeping local thread │
 * │                allocations bounded to static register storage frames.│
 * └──────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Income_Slab {
    public static void main(String args[]){
        
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 32: Progressive Income Tax Slab Calculation                  ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Calculate the total financial tax liability for a given integer    │
 * │ income based on a progression of segmented fiscal brackets using standard│
 * │ multi-branch decision trees and implicit type conversions.            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── PROGRESSIVE SLAB MECHANICS ───────────────────────────────────────┐
 * │ • Bracket 1 (Low Range):     Income < 5,00,000    ──> Tax rate = 0%  │
 * │                                                                      │
 * │ • Bracket 2 (Mid Range):     5,00,000 to <10,00,000 ──> Tax rate = 20% │
 * │                                                                      │
 * │ • Bracket 3 (High Range):    Income ≥ 10,00,000   ──> Tax rate = 30% │
 * │                                                                      │
 * │ • Narrowing Cast Constraint: Floating-point rate multiplication yields│
 * │   a double precision product. Result must be casted back to match    │
 * │   integer local storage frameworks.                                  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input:  income = 750000                                              │
 * │ Output: YOUR TAX IS : 150000                                         │
 * │                                                                      │
 * │ Bracket Evaluation Step:                                             │
 * │  • Check 1: (750000 < 500000) ──> false [Skip bracket 1]             │
 * │  • Check 2: (750000 >= 500000 && 750000 < 1000000) ──> true           │
 * │                                                                      │
 * │ Computation Loop:                                                    │
 * │  • Formula:  tax = (int) (750000 * 0.20)                             │
 * │  • Product:  150000.0 (double precision)                              │
 * │  • Cast Type: Truncates decimal bound into integer scalar => 150000   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Buffer Ingestion: Define an integer holding variable representing  │
 * │                      the base gross input revenue profile.           │
 * │ 2. Ladder Filtration: Route metrics down an optimized cascading `else if`│
 * │                      ladder to target the proper coefficient multiplier.│
 * │ 3. Precision Sync:    Force an explicit integer data type cast block to │
 * │                      reconcile type mismatch across assignment boundaries.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Progressive Financial Range Partitioning & Selection Flow    │
 * │ Limit:  Income values must fit within valid signed 32-bit limits      │
 * │                                                                      │
 * │ Time:   O(1) → Relational branch mapping and basic floating multipliers│
 * │                resolve inside flat, invariant hardware clock steps.  │
 * │                                                                      │
 * │ Space:  O(1) → Operations scale completely in-place, keeping local thread │
 * │                allocations bounded to static register storage frames.│
 * └──────────────────────────────────────────────────────────────────────┘
 */

// import java.util.Scanner;
// public class Income_Slab {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int incom = sc.nextInt();
//         int tax;
//         if(incom < 500000){
//             tax = 0;
//         }
//         else if(incom >= 500000 && incom < 1000000){
//             tax = (int)(incom*0.2);
//         }
//         else{
//             tax = (int)(incom*0.3);
//         }
//         System.out.println("YOUR TAX IS :"+tax);
//     }
// }