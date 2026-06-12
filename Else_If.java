/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [07/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 31: Mutually Exclusive Multi-Branch Selection                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ──────────────────────────────────────────────  ──┐
 * │ Segment an integer age input into exactly one of three mutually       │
 * │ exclusive developmental milestones ("adult", "teenager", or "child")  │
 * │ utilizing an optimized linear cascading `if-else-if` ladder.          │
 * └───────────────────────────────────────────────────────────────────── ─┘
 *
 * ┌── MULTI-BRANCH CASCADING RULES ─────────────────────────────────────┐
 * │ • Mutual Exclusion: In a connected `if–else-if–else` hierarchy, terms│
 * │   are evaluated sequentially down a single branch path. The very     │
 * │   first condition to resolve as true fires its localized logic block.│
 * │                                                                      │
 * │ • Short-Circuit Branching: As soon as a valid branch fires, all      │
 * │   subsequent evaluations down the remaining ladder are completely    │
 * │   bypassed, preventing redundant condition overhead and execution.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input: age = 22                                                      │
 * │ Output: adult                                                        │
 * │                                                                      │
 * │ Ladder Step Evaluation:                                              │
 * │  • Tier 1 Check:  (age >= 18) -> (22 >= 18)                          │
 * │                   => true  ["adult" prints immediately]              │
 * │                                                                      │
 * │  • Tier 2 Bypass: (13 <= age && age < 18)                            │
 * │                   => Bypassed entirely without parsing execution.    │
 * │                                                                      │
 * │  • Tier 3 Bypass: catch-all fallback else [child]                    │
 * │                   => Bypassed entirely due to Tier 1 early escape.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ────────────────────────────────────────────────────────  ─┐
 * │ 1. Boundary Setup: Initialize a local primitive integer variable      │
 * │                    representing the chronological target frame.       │
 * │ 2. Ladder Design:  Arrange conditional boundaries from highest constraint│
 * │                    down to general fallback intervals using `else if`.│
 * │ 3. Output Route:   Map matching operational slots to terminal string  │
 * │                    logging commands for immediate visualization.      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Linear Multi-Branch Range Evaluation / Decision Tree         │
 * │ Limit:  Operates predictably over standard non-negative integer realms│
 * │                                                                      │
 * │ Time:   O(1) → Cascaded jumping choices evaluate inside minimal CPU │
 * │                cycles, scaling at an immediate constant frequency.   │
 * │                                                                      │
 * │ Space:  O(1) → Execution runs entirely in-place inside local thread │
 * │                frame registers with zero dynamic expansion.          │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Else_If {
    public static void main(String[] args) {
        
    }
}

/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [07/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 15: Mutually Exclusive Multi-Branch Selection                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Segment an integer age input into exactly one of three mutually      │
 * │ exclusive developmental milestones ("adult", "teenager", or "child")  │
 * │ utilizing an optimized linear cascading `if-else-if` ladder.          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── MULTI-BRANCH CASCADING RULES ─────────────────────────────────────┐
 * │ • Mutual Exclusion: In a connected `if–else-if–else` hierarchy, terms│
 * │   are evaluated sequentially down a single branch path. The very     │
 * │   first condition to resolve as true fires its localized logic block. │
 * │                                                                      │
 * │ • Short-Circuit Branching: As soon as a valid branch fires, all      │
 * │   subsequent evaluations down the remaining ladder are completely    │
 * │   bypassed, preventing redundant condition overhead and execution.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input: age = 22                                                      │
 * │ Output: adult                                                        │
 * │                                                                      │
 * │ Ladder Step Evaluation:                                              │
 * │  • Tier 1 Check:  (age >= 18) -> (22 >= 18)                           │
 * │                   => true  ["adult" prints immediately]              │
 * │                                                                      │
 * │  • Tier 2 Bypass: (13 <= age && age < 18)                            │
 * │                   => Bypassed entirely without parsing execution.    │
 * │                                                                      │
 * │  • Tier 3 Bypass: catch-all fallback else [child]                    │
 * │                   => Bypassed entirely due to Tier 1 early escape.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Boundary Setup: Initialize a local primitive integer variable     │
 * │                    representing the chronological target frame.       │
 * │ 2. Ladder Design:  Arrange conditional boundaries from highest constraint│
 * │                    down to general fallback intervals using `else if`.│
 * │ 3. Output Route:   Map matching operational slots to terminal string │
 * │                    logging commands for immediate visualization.      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Linear Multi-Branch Range Evaluation / Decision Tree         │
 * │ Limit:  Operates predictably over standard non-negative integer realms│
 * │                                                                      │
 * │ Time:   O(1) → Cascaded jumping choices evaluate inside minimal CPU │
 * │                cycles, scaling at an immediate constant frequency.   │
 * │                                                                      │
 * │ Space:  O(1) → Execution runs entirely in-place inside local thread │
 * │                frame registers with zero dynamic expansion.          │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Else_If {
//     public static void main(String[] args) {
//         int age = 22;
//         if(age >= 18){
//             System.out.println("adult");
//         }
//         else if(age >= 13 && age < 18){
//             System.out.println("teenager");
//         }
//         else{
//             System.out.println("child");
//         }
//     }
// }
