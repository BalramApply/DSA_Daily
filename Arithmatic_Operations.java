/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [04/06/26] → #2  [05/06/26] → #3  [06/06/26]                    │
 * │  #4  [07/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 17: Arithmetic Operators & Basic Operations                  ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate and execute the basic binary arithmetic operations       │
 * │ (+, -, *, /, %) on two given integer variables to observe fundamental│
 * │ mathematical computations.                                           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE CASE ─────────────────────────────────────────────────────┐
 * │ Input:  A = 10, B = 5                                                │
 * │ Output:                                                              │
 * │   ADDITION: 15                                                       │
 * │   SUBTRACTION: 5                                                     │
 * │   MULTIPLICATION: 50                                                 │
 * │   DIVISION: 2                                                        │
 * │   MODULUS (REMAINDER): 0                                             │
 * │                                                                      │
 * │ Explanation:                                                         │
 * │  • Addition:       10 + 5 = 15                                       │
 * │  • Subtraction:    10 - 5 = 5                                        │
 * │  • Multiplication: 10 * 5 = 50                                       │
 * │  • Division:       10 / 5 = 2                                        │
 * │  • Modulus:        10 % 5 = 0                                        │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Initialize Operands: Declare and store two primitive integer      │
 * │                         variables, A and B.                          │
 * │ 2. Apply Operators:     Utilize standard binary arithmetic operators │
 * │                         to calculate sums, differences, products,    │
 * │                         quotients, and remainders.                   │
 * │ 3. Output Generation:   Display each evaluation dynamically via      │
 * │                         standard console printing methods.           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Direct Arithmetic Evaluation & Manipulation                  │
 * │ Limit:  Operands must be valid integers; B != 0 for / and %        │
 * │                                                                      │
 * │ Time:   O(1) → Every basic arithmetic calculation evaluates within   │
 * │                constant, fixed execution clock cycles.               │
 * │                                                                      │
 * │ Space:  O(1) → Memory consumption is fixed to a static set of        │
 * │                primitive local variables within the stack.           │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Arithmatic_Operations{
    public static void main(String[] args) {
        System.out.println(3+5);
        System.out.println(3-5);
        System.out.println(3*5);
        System.out.println(3/5);
        System.out.println(3%5);
    }
}

/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 01: Arithmetic Operators & Basic Operations                  ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate and execute the basic binary arithmetic operations       │
 * │ (+, -, *, /, %) on two given integer variables to observe fundamental│
 * │ mathematical computations.                                           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE CASE ─────────────────────────────────────────────────────┐
 * │ Input:  A = 10, B = 5                                                │
 * │ Output:                                                              │
 * │   ADDITION: 15                                                       │
 * │   SUBTRACTION: 5                                                     │
 * │   MULTIPLICATION: 50                                                 │
 * │   DIVISION: 2                                                        │
 * │   MODULUS (REMAINDER): 0                                             │
 * │                                                                      │
 * │ Explanation:                                                         │
 * │  • Addition:       10 + 5 = 15                                       │
 * │  • Subtraction:    10 - 5 = 5                                        │
 * │  • Multiplication: 10 * 5 = 50                                       │
 * │  • Division:       10 / 5 = 2                                        │
 * │  • Modulus:        10 % 5 = 0                                        │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Initialize Operands: Declare and store two primitive integer       │
 * │                         variables, A and B.                          │
 * │ 2. Apply Operators:     Utilize standard binary arithmetic operators │
 * │                         to calculate sums, differences, products,    │
 * │                         quotients, and remainders.                   │
 * │ 3. Output Generation:   Display each evaluation dynamically via      │
 * │                         standard console printing methods.           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Direct Arithmetic Evaluation & Manipulation                  │
 * │ Limit:  Operands must be valid integers; B != 0 for / and %        │
 * │                                                                      │
 * │ Time:   O(1) → Every basic arithmetic calculation evaluates within   │
 * │                constant, fixed execution clock cycles.               │
 * │                                                                      │
 * │ Space:  O(1) → Memory consumption is fixed to a static set of        │
 * │                primitive local variables within the stack.           │
 * └──────────────────────────────────────────────────────────────────────┘
 */
// public class Arithmatic_Operations{
//     public static void main(String[] args) {
//         // Declare two integer variables
//         int A = 10;
//         int B = 5;

//         // Perform and display arithmetic operations
//         System.out.println("ADDITION: " + (A + B));
//         System.out.println("SUBTRACTION: " + (A - B));
//         System.out.println("MULTIPLICATION: " + (A * B));
//         System.out.println("DIVISION: " + (A / B));
//         System.out.println("MODULUS (REMAINDER): " + (A % B));
//     }
// }