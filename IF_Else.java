/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [06/06/26] → #2  [07/06/26] → #3  [08/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 28: AGE CALCULATION IF ELSE                                  ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Categorize an integer age variable into a targeted sociological      │
 * │ classification ("adult", "teenager", or "not adult") utilizing a     │
 * │ mixture of independent and nested conditional branching statements.  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── BRANCHING BEHAVIOR & SCOPING RULES ───────────────────────────────┐
 * │ • First Branch (Independent): The `age >= 18` block is entirely         │
 * │   decoupled. If true, it executes, but the program continues directly   │
 * │   to evaluate subsequent branches regardless.                           │
 * │                                                                         │
 * │ • Second Branch (Tethered Pair): The `else` statement is tightly        │
 * │   bound *only* to the immediate secondary `if` statement. If the        │
 * │   teenager expression resolves to true, the fallback `else` is bypassed.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input: age = 16                                                      │
 * │ Output:                                                              │
 * │   teenager                                                           │
 * │                                                                      │
 * │ Branch Evaluation Path:                                              │
 * │  • Check 1: (age >= 18) -> (16 >= 18)                                │
 * │             => false [Bypasses block; no print outcome]              │
 * │                                                                      │
 * │  • Check 2: (age > 13 && age < 18) -> (16 > 13 && 16 < 18)           │
 * │             => true && true -> true ["teenager" prints successfully] │
 * │                                                                      │
 * │  • Check 3: else (Belongs exclusively to Check 2)                    │
 * │             => Bypassed entirely because Check 2 evaluated to true.  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Parameter Sourcing: Instantiate a local primitive integer to      │
 * │                        capture chronological age metrics.            │
 * │ 2. Boundary Filtering: Construct a standalone check for maturity bounds,│
 * │                        followed by an integrated logical AND tethered│
 * │                        to a catch-all trailing fallback block.       │
 * │ 3. Print Resolution:   Dispatch the matched categoric string output  │
 * │                        directly to the main terminal thread.         │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Conditional Range Partitioning & Branch Flow Control         │
 * │ Limit:  Assumes valid logical integer inputs matching real-world age │
 * │                                                                      │
 * │ Time:   O(1) → Relational gating pathways resolve instantly without   │
 * │                looping or depth scaling.                             │
 * │                                                                      │
 * │ Space:  O(1) → Static allocation footprint holding zero variable     │
 * │                expansion overhead.                                    │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class IF_Else {
    public static void main(String args[]){
        
    }
}

/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 12: Multi-Branch Conditional Categorization                  ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Categorize an integer age variable into a targeted sociological      │
 * │ classification ("adult", "teenager", or "not adult") utilizing a     │
 * │ mixture of independent and nested conditional branching statements.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── BRANCHING BEHAVIOR & SCOPING RULES ───────────────────────────────┐
 * │ • First Branch (Independent): The `age >= 18` block is entirely      │
 * │   decoupled. If true, it executes, but the program continues directly │
 * │   to evaluate subsequent branches regardless.                         │
 * │                                                                      │
 * │ • Second Branch (Tethered Pair): The `else` statement is tightly     │
 * │   bound *only* to the immediate secondary `if` statement. If the      │
 * │   teenager expression resolves to true, the fallback `else` is bypassed.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input: age = 16                                                      │
 * │ Output:                                                              │
 * │   teenager                                                           │
 * │                                                                      │
 * │ Branch Evaluation Path:                                              │
 * │  • Check 1: (age >= 18) -> (16 >= 18)                                │
 * │             => false [Bypasses block; no print outcome]               │
 * │                                                                      │
 * │  • Check 2: (age > 13 && age < 18) -> (16 > 13 && 16 < 18)           │
 * │             => true && true -> true ["teenager" prints successfully]   │
 * │                                                                      │
 * │  • Check 3: else (Belongs exclusively to Check 2)                    │
 * │             => Bypassed entirely because Check 2 evaluated to true.  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Parameter Sourcing: Instantiate a local primitive integer to      │
 * │                        capture chronological age metrics.            │
 * │ 2. Boundary Filtering: Construct a standalone check for maturity bounds,│
 * │                        followed by an integrated logical AND tethered│
 * │                        to a catch-all trailing fallback block.       │
 * │ 3. Print Resolution:   Dispatch the matched categoric string output  │
 * │                        directly to the main terminal thread.         │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Conditional Range Partitioning & Branch Flow Control         │
 * │ Limit:  Assumes valid logical integer inputs matching real-world age │
 * │                                                                      │
 * │ Time:   O(1) → Relational gating pathways resolve instantly without   │
 * │                looping or depth scaling.                             │
 * │                                                                      │
 * │ Space:  O(1) → Static allocation footprint holding zero variable     │
 * │                expansion overhead.                                    │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class IF_Else {
//     public static void main(String args[]){
//         int age = 16;
//         if(age >= 18){
//             System.out.println("ADULT : DRIVE, VOTE");
//         }
//         if(age > 13 && age < 18){
//             System.out.println("TEENAGER");
//         }
//         else{
//              System.out.println("not ADULT");
//         }
//     }
// }
