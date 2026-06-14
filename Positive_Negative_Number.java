/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [08/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 38: POSITIVE NEGATIVE NUMBER CHECKER                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Evaluate the mathematical sign of a given integer input to determine │
 * │ whether it falls into a positive or negative structural domain using  │
 * │ an isolated dual-selection (`if-else`) conditional block.             │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ZERO-BOUNDARY BOUNDS & LOGIC ─────────────────────────────────────┐
 * │ • Origin Alignment: On a standard real number line, zero acts as a   │
 * │   neutral origin. For this specific implementation matrix, zero is   │
 * │   grouped inclusively into the positive numeric subset.              │
 * │                                                                      │
 * │ • Inclusive Comparison: Utilizing a non-strict greater-than-or-equal  │
 * │   relational inequality (`>= 0`) cleanly maps zero and all positive  │
 * │   integers to the true branch, isolating negative values to the `else`.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ 1. Negative Traversal Case:                                          │
 * │    Input:  number = -12                                              │
 * │    Check:  (-12 >= 0) ──> false                                      │
 * │    Output: NUMBER IS NEGATIVE : -12                                  │
 * │                                                                      │
 * │ 2. Positive Traversal Case:                                          │
 * │    Input:  number = 5                                                │
 * │    Check:  (5 >= 0) ──> true                                         │
 * │    Output: NUMBER IS POSITIVE : 5                                    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Input Allocation:  Initialize a local primitive signed integer     │
 * │                       variable to serve as the evaluation target.    │
 * │ 2. Sign Filtration:   Route the variable directly through an inclusive│
 * │                       relational zero-boundary check frame.          │
 * │ 3. Output Resolution: Route the distinct true and false execution     │
 * │                       paths into customized standard console print logs.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Signed Primitive Range Evaluation / Selection Control Flow   │
 * │ Limit:  Symmetrically handles all positive, negative, and zero signed│
 * │         integer data properties.                                     │
 * │                                                                      │
 * │ Time:   O(1) → Single comparison steps evaluate instantly at the hardware│
 * │                level in constant, invariant execution clock cycles.  │
 * │                                                                      │
 * │ Space:  O(1) → Structural memory remains strictly pinned to local,   │
 * │                non-scaling stack frame storage registers.            │
 * └──────────────────────────────────────────────────────────────────────┘
 */
import java.util.Scanner;
public class Positive_Negative_Number {
    public static void main(String args[]){
        
    }
}

/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 22: POSITIVE NEGATIVE NUMBER CHECKER                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Evaluate the mathematical sign of a given integer input to determine │
 * │ whether it falls into a positive or negative structural domain using  │
 * │ an isolated dual-selection (`if-else`) conditional block.             │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ZERO-BOUNDARY BOUNDS & LOGIC ─────────────────────────────────────┐
 * │ • Origin Alignment: On a standard real number line, zero acts as a   │
 * │   neutral origin. For this specific implementation matrix, zero is   │
 * │   grouped inclusively into the positive numeric subset.              │
 * │                                                                      │
 * │ • Inclusive Comparison: Utilizing a non-strict greater-than-or-equal  │
 * │   relational inequality (`>= 0`) cleanly maps zero and all positive  │
 * │   integers to the true branch, isolating negative values to the `else`.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ 1. Negative Traversal Case:                                          │
 * │    Input:  number = -12                                              │
 * │    Check:  (-12 >= 0) ──> false                                      │
 * │    Output: NUMBER IS NEGATIVE : -12                                  │
 * │                                                                      │
 * │ 2. Positive Traversal Case:                                          │
 * │    Input:  number = 5                                                │
 * │    Check:  (5 >= 0) ──> true                                         │
 * │    Output: NUMBER IS POSITIVE : 5                                    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Input Allocation:  Initialize a local primitive signed integer     │
 * │                       variable to serve as the evaluation target.    │
 * │ 2. Sign Filtration:   Route the variable directly through an inclusive│
 * │                       relational zero-boundary check frame.          │
 * │ 3. Output Resolution: Route the distinct true and false execution     │
 * │                       paths into customized standard console print logs.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Signed Primitive Range Evaluation / Selection Control Flow   │
 * │ Limit:  Symmetrically handles all positive, negative, and zero signed│
 * │         integer data properties.                                     │
 * │                                                                      │
 * │ Time:   O(1) → Single comparison steps evaluate instantly at the hardware│
 * │                level in constant, invariant execution clock cycles.  │
 * │                                                                      │
 * │ Space:  O(1) → Structural memory remains strictly pinned to local,   │
 * │                non-scaling stack frame storage registers.            │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Positive_Negative_Number {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("ENTER THE NUMBER :");
//         int num = sc.nextInt();
//         if(num >= 0){
//             System.out.print("NUMBER IS POSITIVE :"+num);
//         }
//         else{
//              System.out.print("NUMBER IS NEGETIVE :"+num);
//         }
//     }
// }
