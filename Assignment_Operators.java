/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [05/06/26] → #2  [06/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 21: Compound Assignment Operators & Variable Mutation        ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate, evaluate, and trace the step-by-step state changes      │
 * │ of a single primitive variable undergoing successive transformations   │
 * │ using compound assignment operators (+=, -=, *=, /=, %=) in Java.    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── COMPOUND BEHAVIOR & implicit CASTING ──────────────────────────────┐
 * │ • Structural Equivalence: E1 op= E2 is evaluated as E1 = (type)(E1 op E2)│
 * │ • Hidden Benefit: Compound assignment operators automatically inject  │
 * │   an implicit narrowing cast to the destination type, preventing     │
 * │   compile-time type mismatch errors.                                 │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE SEQUENTIAL TRACE ─────────────────────────────────────────┐
 * │ Initial State: a = 50                                                │
 * │                                                                      │
 * │  • Operation: a += 2  │ Evaluation: 50 + 2  │ Resultant State: a = 52│
 * │  • Operation: a -= 3  │ Evaluation: 52 - 3  │ Resultant State: a = 49│
 * │  • Operation: a *= 2  │ Evaluation: 49 * 2  │ Resultant State: a = 98│
 * │  • Operation: a /= 5  │ Evaluation: 98 / 5  │ Resultant State: a = 19│
 * │  • Operation: a %= 2  │ Evaluation: 19 % 2  │ Resultant State: a = 1 │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Seed Value:      Instantiate a single tracking primitive integer   │
 * │                     initialized to its baseline value.                │
 * │ 2. Inline Mutation: Chain compound updates down a linear sequential   │
 * │                     execution track to continuously alter memory.     │
 * │ 3. Step Logging:    Print out the immediate localized variable value │
 * │                     after each individual transformation step.        │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Sequential Compound Mutation Analysis                        │
 * │ Limit:  Target container must be an initialized modifiable variable  │
 * │                                                                      │
 * │ Time:   O(1) → Local lookup, math evaluation, and re-assignment      │
 * │                execute as atomic steps in constant processing cycles.│
 * │                                                                      │
 * │ Space:  O(1) → Mutation occurs purely in-place, restricting space     │
 * │                overhead to a solitary persistent stack allocation.    │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Assignment_Operators {
    public static void main(String args[]){
        
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 05: Compound Assignment Operators & Variable Mutation        ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate, evaluate, and trace the step-by-step state changes      │
 * │ of a single primitive variable undergoing successive transformations   │
 * │ using compound assignment operators (+=, -=, *=, /=, %=) in Java.    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── COMPOUND BEHAVIOR & implicit CASTING ──────────────────────────────┐
 * │ • Structural Equivalence: E1 op= E2 is evaluated as E1 = (type)(E1 op E2)│
 * │ • Hidden Benefit: Compound assignment operators automatically inject  │
 * │   an implicit narrowing cast to the destination type, preventing     │
 * │   compile-time type mismatch errors.                                 │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE SEQUENTIAL TRACE ─────────────────────────────────────────┐
 * │ Initial State: a = 50                                                │
 * │                                                                      │
 * │  • Operation: a += 2  │ Evaluation: 50 + 2  │ Resultant State: a = 52│
 * │  • Operation: a -= 3  │ Evaluation: 52 - 3  │ Resultant State: a = 49│
 * │  • Operation: a *= 2  │ Evaluation: 49 * 2  │ Resultant State: a = 98│
 * │  • Operation: a /= 5  │ Evaluation: 98 / 5  │ Resultant State: a = 19│
 * │  • Operation: a %= 2  │ Evaluation: 19 % 2  │ Resultant State: a = 1 │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Seed Value:      Instantiate a single tracking primitive integer   │
 * │                     initialized to its baseline value.                │
 * │ 2. Inline Mutation: Chain compound updates down a linear sequential   │
 * │                     execution track to continuously alter memory.     │
 * │ 3. Step Logging:    Print out the immediate localized variable value │
 * │                     after each individual transformation step.        │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Sequential Compound Mutation Analysis                        │
 * │ Limit:  Target container must be an initialized modifiable variable  │
 * │                                                                      │
 * │ Time:   O(1) → Local lookup, math evaluation, and re-assignment      │
 * │                execute as atomic steps in constant processing cycles.│
 * │                                                                      │
 * │ Space:  O(1) → Mutation occurs purely in-place, restricting space     │
 * │                overhead to a solitary persistent stack allocation.    │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Assignment_Operators {
//     public static void main(String args[]){
//         int a = 50;
//         a += 2;
//         System.out.println("ADDITION ASSIGNMENT : "+a);

//         a -= 3;
//         System.out.println("SUBTRACTION ASSIGNMENT : "+a);

//         a *= 2;
//         System.out.println("MULTIPLICATION ASSIGNMENT : "+a);

//         a /= 5;
//         System.out.println("DIVISION ASSIGNMENT : "+a);

//         a %= 2;
//         System.out.println("MODULAS ASSIGNMENT : "+a);
//     }
// }
