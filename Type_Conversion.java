/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [02/06/26] → #2  [03/06/26] → #3  [04/06/26]                    │
 * │  #4  [05/06/26] → #5  [06/06/26] → #6  [07/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘ 
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 10: Type Conversion (Int to Long)                            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate implicit type conversion (widening conversion) in Java,  │
 * │ showing how a smaller primitive integer data type is automatically   │
 * │ promoted to a larger primitive long data type by the compiler.       │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input:  Predefined int a = 68                                        │
 * │ Output: Value of b: 68                                               │
 * │                                                                      │
 * │ Explanation: The 32-bit int value is assigned directly to a 64-bit   │
 * │              long variable without requiring an explicit cast block. │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Instantiation: Allocate a 32-bit integer variable (`int a`).      │
 * │ 2. Promotion:     Assign the value of `a` directly to a 64-bit long  │
 * │                   variable (`long b`). Java automatically widens it. │
 * │ 3. Output:        Print the promoted value to the standard console.  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Implicit Primitive Casting / Widening Promotion             │
 * │ Limit:  Safe operation: No numeric overflow or data precision loss.  │
 * │                                                                      │
 * │ Time:   O(1) → Bitwise widening and basic assignments execute in a   │
 * │                single, constant clock cycle operation.               │
 * │                                                                      │
 * │ Space:  O(1) → Utilizes a strict, fixed memory footprint bound entirely│
 * │                to two active primitive stack frames.                  │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Type_Conversion {
    public static void main(String[] args) {
        
    }
}

/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 10: Type Conversion (Int to Long)                            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate implicit type conversion (widening conversion) in Java,  │
 * │ showing how a smaller primitive integer data type is automatically   │
 * │ promoted to a larger primitive long data type by the compiler.       │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input:  Predefined int a = 68                                        │
 * │ Output: Value of b: 68                                               │
 * │                                                                      │
 * │ Explanation: The 32-bit int value is assigned directly to a 64-bit   │
 * │              long variable without requiring an explicit cast block. │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Instantiation: Allocate a 32-bit integer variable (`int a`).      │
 * │ 2. Promotion:     Assign the value of `a` directly to a 64-bit long  │
 * │                   variable (`long b`). Java automatically widens it. │
 * │ 3. Output:        Print the promoted value to the standard console.  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Implicit Primitive Casting / Widening Promotion             │
 * │ Limit:  Safe operation: No numeric overflow or data precision loss.  │
 * │                                                                      │
 * │ Time:   O(1) → Bitwise widening and basic assignments execute in a   │
 * │                single, constant clock cycle operation.               │
 * │                                                                      │
 * │ Space:  O(1) → Utilizes a strict, fixed memory footprint bound entirely│
 * │                to two active primitive stack frames.                  │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Type_Conversion {
//     public static void main(String[] args) {
//         // Declare an integer variable
//         int a = 68;
        
//         // Implicit type casting (widening) from int to long
//         long b = a;
        
//         // Print the value of 'b'
//         System.out.println("Value of b: " + b);
//     }
// }
