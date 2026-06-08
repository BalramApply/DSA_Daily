/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [05/06/26] → #2  [06/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 23: Independent Conditionals & Compound Logic                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Analyze, evaluate, and trace the control flow of multiple independent │
 * │ conditional blocks evaluating compound boolean expressions across   │
 * │ three distinct primitive integer variables.                          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EVALUATION MECHANICS ─────────────────────────────────────────────┐
 * │ • Independent Branches: Unlike an if-else chain, consecutive, flat  │
 * │   if-statements are completely decoupled. Every single condition is  │
 * │   evaluated sequentially regardless of previous matches.             │
 * │                                                                      │
 * │ • Logical Operator Precedence: Relational and arithmetic operators   │
 * │   (+, <, <=) take precedence over short-circuit logical AND (&&).     │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input: x = 200, y = 500, z = 200                                     │
 * │ Output:                                                              │
 * │   JAVA                                                               │
 * │                                                                      │
 * │ Step-by-Step Gating Evaluation:                                      │
 * │  • Block 1: (x > y && y > z)                                         │
 * │             -> (200 > 500 && 500 > 200)                               │
 * │             -> false && true  => false [Saves execution; "HELLO" skip]│
 * │                                                                      │
 * │  • Block 2: (z < y && z <= x)                                         │
 * │             -> (200 < 500 && 200 <= 200)                             │
 * │             -> true && true   => true  ["JAVA" is printed]            │
 * │                                                                      │
 * │  • Block 3: ((y + 200) < x && (y + 150) < z)                         │
 * │             -> (700 < 200 && 650 < 200)                               │
 * │             -> false && false => false ["HELLO JAVA" skip]            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Allocation State: Initialize primitive integer boundaries for     │
 * │                      variables x, y, and z.                          │
 * │ 2. Parallel Parsing: Execute independent conditional checks without  │
 * │                      early exit control mechanisms.                  │
 * │ 3. Output Trigger:   Route matching blocks directly to standard      │
 * │                      system console logs.                            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Independent Control Flow & Conditional Logic Analysis       │
 * │ Limit:  Operands must be valid numeric primitive types                │
 * │                                                                      │
 * │ Time:   O(1) → Static logical comparison chains resolve within fixed │
 * │                clock cycles on the standard execution thread.       │
 * │                                                                      │
 * │ Space:  O(1) → Storage footprint remains entirely stable within structural│
 * │                thread register limits with zero allocations.          │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Analyse_Output_Operators {
    public static void main(String arga[]){
        int x = 200, y = 500, z = 200;

        if(x > y && y > z){
            System.out.println("HELLO");    // ans = ?
        }

         if(z < y && z <= x){
            System.out.println("JAVA"); // ans = ?
        }

         if((y + 200) < x && (y + 150) < z){
            System.out.println("HELLO JAVA");   // ans = ?
        }
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 07: Independent Conditionals & Compound Logic                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Analyze, evaluate, and trace the control flow of multiple independent │
 * │ conditional blocks evaluating compound boolean expressions across   │
 * │ three distinct primitive integer variables.                          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EVALUATION MECHANICS ─────────────────────────────────────────────┐
 * │ • Independent Branches: Unlike an if-else chain, consecutive, flat  │
 * │   if-statements are completely decoupled. Every single condition is  │
 * │   evaluated sequentially regardless of previous matches.             │
 * │                                                                      │
 * │ • Logical Operator Precedence: Relational and arithmetic operators   │
 * │   (+, <, <=) take precedence over short-circuit logical AND (&&).     │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input: x = 200, y = 500, z = 200                                     │
 * │ Output:                                                              │
 * │   JAVA                                                               │
 * │                                                                      │
 * │ Step-by-Step Gating Evaluation:                                      │
 * │  • Block 1: (x > y && y > z)                                         │
 * │             -> (200 > 500 && 500 > 200)                               │
 * │             -> false && true  => false [Saves execution; "HELLO" skip]│
 * │                                                                      │
 * │  • Block 2: (z < y && z <= x)                                         │
 * │             -> (200 < 500 && 200 <= 200)                             │
 * │             -> true && true   => true  ["JAVA" is printed]            │
 * │                                                                      │
 * │  • Block 3: ((y + 200) < x && (y + 150) < z)                         │
 * │             -> (700 < 200 && 650 < 200)                               │
 * │             -> false && false => false ["HELLO JAVA" skip]            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Allocation State: Initialize primitive integer boundaries for     │
 * │                      variables x, y, and z.                          │
 * │ 2. Parallel Parsing: Execute independent conditional checks without  │
 * │                      early exit control mechanisms.                  │
 * │ 3. Output Trigger:   Route matching blocks directly to standard      │
 * │                      system console logs.                            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Independent Control Flow & Conditional Logic Analysis       │
 * │ Limit:  Operands must be valid numeric primitive types                │
 * │                                                                      │
 * │ Time:   O(1) → Static logical comparison chains resolve within fixed │
 * │                clock cycles on the standard execution thread.       │
 * │                                                                      │
 * │ Space:  O(1) → Storage footprint remains entirely stable within structural│
 * │                thread register limits with zero allocations.          │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Analyse_Output_Operators {
//     public static void main(String arga[]){
//         int x = 200, y = 500, z = 200;

//         if(x > y && y > z){
//             System.out.println("HELLO");    // ans = ?
//         }

//          if(z < y && z <= x){
//             System.out.println("JAVA"); // ans = ?
//         }

//          if((y + 200) < x && (y + 150) < z){
//             System.out.println("HELLO JAVA");   // ans = ?
//         }
//     }
// }
