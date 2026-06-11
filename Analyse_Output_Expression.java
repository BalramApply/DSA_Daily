/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [05/06/26] → #2  [06/06/26] → #3  [07/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 25: Complex Multi-Term Expression Parsing                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Parse, decompose, and evaluate a complex, multi-term arithmetic      │
 * │ expression containing nested brackets, multiplicative precedence, and│
 * │ severe integer division truncation constraints.                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EVALUATION ORDER & RULES ─────────────────────────────────────────┐
 * │ • Bracket Dominance: Deepest parenthetical inner expressions resolve │
 * │   first before spreading to outer multiplicative layers.              │
 * │                                                                      │
 * │ • Tie-Breaking Precedence: Operators '*' and '/' carry identical     │
 * │   precedence weights and resolve strictly from left-to-right.        │
 * │                                                                      │
 * │ • Truncation Accumulation: Integer truncation applies to each        │
 * │   isolated sub-division term, compounding across structural sums.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Inputs: x = 9, y = 12, a = 2, b = 4, c = 6                           │
 * │ Output: VALUE IS : 278                                               │
 * │                                                                      │
 * │ Step-by-Step Expression Decomposition:                               │
 * │  • Part 1: 4 / 3 * (x + 34)                                          │
 * │           -> (4 / 3) * (9 + 34)                                       │
 * │           -> 1 * 43                                 => Term 1 = 43   │
 * │                                                                      │
 * │  • Part 2: 9 * (a + b * c)                                           │
 * │           -> 9 * (2 + (4 * 6))                                       │
 * │           -> 9 * (2 + 24) -> 9 * 26                 => Term 2 = 234  │
 * │                                                                      │
 * │  • Part 3: (3 + y * (2 + a)) / (a + b * y)                           │
 * │           -> Numerator: (3 + 12 * (2 + 2)) -> (3 + 48)  => 51        │
 * │           -> Denominator: (2 + 4 * 12) -> (2 + 48)      => 50        │
 * │           -> Division: 51 / 50 (Truncated integer)  => Term 3 = 1    │
 * │                                                                      │
 * │  • Resolution (Term 1 + Term 2 + Term 3):                            │
 * │           -> 43 + 234 + 1                           => 278           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Allocation Boundary: Provision primitive integers x, y, a, b, c   │
 * │                         within localized stack registry targets.     │
 * │ 2. Hierarchical Parse:  Inject the full compound formula statement   │
 * │                         allowing standard compiler rules to execute.  │
 * │ 3. Output Resolution:   Route the finalized structural evaluation    │
 * │                         directly into the standard log buffer.       │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Complex Arithmetic Expression Hierarchy & Precedence         │
 * │ Limit:  Denominators must never approach or evaluate to zero values   │
 * │                                                                      │
 * │ Time:   O(1) → Complete structural calculations parse dynamically     │
 * │                within a uniform constant timeline.                   │
 * │                                                                      │
 * │ Space:  O(1) → Variable state maps exclusively onto static space     │
 * │                profiles without scaling footprints.                   │
 * └──────────────────────────────────────────────────────────────────────┘
 */
public class Analyse_Output_Expression {
    public static void main(String args[]){
        int x = 9, y = 12;
        int a =2, b = 4, c = 6;

        int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
        System.out.println("VALUE IS :"+exp);   // Ans = 
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 09: Complex Multi-Term Expression Parsing                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Parse, decompose, and evaluate a complex, multi-term arithmetic      │
 * │ expression containing nested brackets, multiplicative precedence, and│
 * │ severe integer division truncation constraints.                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EVALUATION ORDER & RULES ─────────────────────────────────────────┐
 * │ • Bracket Dominance: Deepest parenthetical inner expressions resolve │
 * │   first before spreading to outer multiplicative layers.              │
 * │                                                                      │
 * │ • Tie-Breaking Precedence: Operators '*' and '/' carry identical     │
 * │   precedence weights and resolve strictly from left-to-right.        │
 * │                                                                      │
 * │ • Truncation Accumulation: Integer truncation applies to each        │
 * │   isolated sub-division term, compounding across structural sums.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Inputs: x = 9, y = 12, a = 2, b = 4, c = 6                           │
 * │ Output: VALUE IS : 278                                               │
 * │                                                                      │
 * │ Step-by-Step Expression Decomposition:                               │
 * │  • Part 1: 4 / 3 * (x + 34)                                          │
 * │           -> (4 / 3) * (9 + 34)                                       │
 * │           -> 1 * 43                                 => Term 1 = 43   │
 * │                                                                      │
 * │  • Part 2: 9 * (a + b * c)                                           │
 * │           -> 9 * (2 + (4 * 6))                                       │
 * │           -> 9 * (2 + 24) -> 9 * 26                 => Term 2 = 234  │
 * │                                                                      │
 * │  • Part 3: (3 + y * (2 + a)) / (a + b * y)                           │
 * │           -> Numerator: (3 + 12 * (2 + 2)) -> (3 + 48)  => 51        │
 * │           -> Denominator: (2 + 4 * 12) -> (2 + 48)      => 50        │
 * │           -> Division: 51 / 50 (Truncated integer)  => Term 3 = 1    │
 * │                                                                      │
 * │  • Resolution (Term 1 + Term 2 + Term 3):                            │
 * │           -> 43 + 234 + 1                           => 278           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Allocation Boundary: Provision primitive integers x, y, a, b, c   │
 * │                         within localized stack registry targets.     │
 * │ 2. Hierarchical Parse:  Inject the full compound formula statement   │
 * │                         allowing standard compiler rules to execute.  │
 * │ 3. Output Resolution:   Route the finalized structural evaluation    │
 * │                         directly into the standard log buffer.       │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Complex Arithmetic Expression Hierarchy & Precedence         │
 * │ Limit:  Denominators must never approach or evaluate to zero values   │
 * │                                                                      │
 * │ Time:   O(1) → Complete structural calculations parse dynamically     │
 * │                within a uniform constant timeline.                   │
 * │                                                                      │
 * │ Space:  O(1) → Variable state maps exclusively onto static space     │
 * │                profiles without scaling footprints.                   │
 * └──────────────────────────────────────────────────────────────────────┘
 */
// public class Analyse_Output_Expression {
//     public static void main(String args[]){
//         int x = 9, y = 12;
//         int a =2, b = 4, c = 6;

//         int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
//         System.out.println("VALUE IS :"+exp);   // Ans = 
//     }
// }