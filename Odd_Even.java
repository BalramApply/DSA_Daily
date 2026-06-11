/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐*
 * │  #1  [06/06/26] → #2  [07/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 30: Modulo Congruence & Parity Evaluation                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Evaluate the mathematical parity (even or odd state) of a given      │
 * │ integer input by assessing its congruence modulo 2 within a dual-    │
 * │ selection (`if-else`) control flow hierarchy.                        │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── PARITY MECHANICS & ARITHMETIC RULES ──────────────────────────────┐
 * │ • Modulo Operator (%): Computes the remainder of an integer division│
 * │   operation. For any integer n, n % 2 yields exactly 0 or 1 (or -1   │
 * │   for negative odd values in Java arithmetic).                       │
 * │                                                                      │
 * │ • Even Congruence: An integer is structurally even if and only if it │
 * │   shares absolute divisibility with 2, satisfying: n % 2 == 0.       │
 * │                                                                      │
 * │ • Odd Congruence: If the modulo condition fails, the system executes│
 * │   the mutually exclusive `else` path denoting an odd parity.         │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input: n = 5                                                         │
 * │ Output: NUMBER IS ODD                                                │
 * │                                                                      │
 * │ Step-by-Step Processing:                                             │
 * │  • Modulo Operation: 5 % 2                                           │
 * │                      5 = (2 * 2) + 1  ──> Remainder = 1              │
 * │                                                                      │
 * │  • Gating Evaluation: (1 == 0) ──> false                             │
 * │                                                                      │
 * │  • Branch Transition: Bypasses the true branch, shifting control     │
 * │                      directly down to the fallback `else` block to   │
 * │                      print: "NUMBER IS ODD"                          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Input Allocation:  Initialize a local primitive integer variable  │
 * │                       representing the parity test target.           │
 * │ 2. Remainder Routing: Construct a conditional block utilizing the    │
 * │                       binary modulo (`%`) and relational equality    │
 * │                       (`==`) operators.                              │
 * │ 3. Print Dispatch:    Route the distinct evaluation streams into     │
 * │                       isolated standard console print logs.          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Mathematical Parity Analysis & Selection Control Flow        │
 * │ Limit:  Handles positive, negative, and zero boundaries cleanly.     │
 * │                                                                      │
 * │ Time:   O(1) → Modulo checks resolve directly on hardware ALU components│
 * │                within invariant, constant clock frequencies.          │
 * │                                                                       │
 * │ Space:  O(1) → Structural memory remains strictly contained to a static│
 * │                thread register slot with no dynamic scaling.          │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Odd_Even {
    public static void main(String args[]){
        
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 14: Modulo Congruence & Parity Evaluation                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Evaluate the mathematical parity (even or odd state) of a given      │
 * │ integer input by assessing its congruence modulo 2 within a dual-    │
 * │ selection (`if-else`) control flow hierarchy.                        │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── PARITY MECHANICS & ARITHMETIC RULES ──────────────────────────────┐
 * │ • Modulo Operator (%): Computes the remainder of an integer division│
 * │   operation. For any integer n, n % 2 yields exactly 0 or 1 (or -1   │
 * │   for negative odd values in Java arithmetic).                       │
 * │                                                                      │
 * │ • Even Congruence: An integer is structurally even if and only if it │
 * │   shares absolute divisibility with 2, satisfying: n % 2 == 0.       │
 * │                                                                      │
 * │ • Odd Congruence: If the modulo condition fails, the system executes│
 * │   the mutually exclusive `else` path denoting an odd parity.         │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input: n = 5                                                         │
 * │ Output: NUMBER IS ODD                                                │
 * │                                                                      │
 * │ Step-by-Step Processing:                                             │
 * │  • Modulo Operation: 5 % 2                                           │
 * │                      5 = (2 * 2) + 1  ──> Remainder = 1              │
 * │                                                                      │
 * │  • Gating Evaluation: (1 == 0) ──> false                             │
 * │                                                                      │
 * │  • Branch Transition: Bypasses the true branch, shifting control      │
 * │                      directly down to the fallback `else` block to  │
 * │                      print: "NUMBER IS ODD"                          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Input Allocation:  Initialize a local primitive integer variable  │
 * │                       representing the parity test target.           │
 * │ 2. Remainder Routing: Construct a conditional block utilizing the    │
 * │                       binary modulo (`%`) and relational equality   │
 * │                       (`==`) operators.                              │
 * │ 3. Print Dispatch:    Route the distinct evaluation streams into     │
 * │                       isolated standard console print logs.          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Mathematical Parity Analysis & Selection Control Flow        │
 * │ Limit:  Handles positive, negative, and zero boundaries cleanly.     │
 * │                                                                      │
 * │ Time:   O(1) → Modulo checks resolve directly on hardware ALU components│
 * │                within invariant, constant clock frequencies.          │
 * │                                                                      │
 * │ Space:  O(1) → Structural memory remains strictly contained to a static│
 * │                thread register slot with no dynamic scaling.          │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Odd_Even {
//     public static void main(String args[]){
//         int n = 5;
//         if(n % 2 == 0){
//             System.out.println("NUMBER IS EVENN");
//         }else{
//             System.out.println("NUMBER IS ODD");
//         }
//     }
// }
