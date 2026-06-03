/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [03/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 12: Type Promotion Rules                                     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ─────────────────────────────────────────────────┐
 * │ Demonstrate Java's automatic type promotion behaviors during         │
 * │ arithmetic expressions:                                              │
 * │   - `byte`, `short`, and `char` operands are automatically promoted  │
 * │     to `int` before an operator is evaluated.                        │
 * │   - Storing an expression's result back into a smaller data type     │
 * │     requires manual, explicit narrowing casting.                     │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLES ──────────────────────────────────────────────────────────┐
 * │ • Character Promotion : 'a' (97) - 'b' (98) = -1  → Result is an int │
 * │ • Compound Promotion  : short + byte + char       → Evaluated as int │
 * │ • Re-assignment Block : byte m = 5; (byte)(m * 2) → Explicitly cast  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Character Math: Subtracted text literals showcase the underlying  │
 * │                    ASCII integers being treated as standard ints.    │
 * │ 2. Dynamic Mixed:  Combine multiple narrow types to observe compiler│
 * │                    up-casting behaviors across expressions.           │
 * │ 3. Narrowing Cast: Enforce safety boundaries via explicit outer casts│
 * │                    to prevent assignment compilation errors.          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Compiler Optimization / Expression Type Promotion            │
 * │ Limit:  Watch for unexpected high-order bit overflow when casting     │
 * │         promoted `int` values back down into a 1-byte container.     │
 * │                                                                      │
 * │ Time:   O(1) → Execution runs entirely inside standard compiler registers│
 * │                and localized CPU execution pathways.                 │
 * │                                                                      │
 * │ Space:  O(1) → Utilizes standard, low-overhead primitive variables    │
 * │                scoped completely to the immediate method frame.      │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Type_Promotion {
    public static void main(String[] args) {
        // Declaring two character variables
        char a = 'a'; // ASCII value of 'a' is 97
        char b = 'b'; // ASCII value of 'b' is 98



        // Declaring different primitive data types
        short x = 5;
        byte y = 25;
        char z = 'c'; // ASCII value of 'c' is 99

        // Multiplication and explicit typecasting
        byte m = 5;

    }
}

/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 12: Type Promotion Rules                                     ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate Java's automatic type promotion behaviors during         │
 * │ arithmetic expressions:                                               │
 * │   - `byte`, `short`, and `char` operands are automatically promoted  │
 * │     to `int` before an operator is evaluated.                        │
 * │   - Storing an expression's result back into a smaller data type     │
 * │     requires manual, explicit narrowing casting.                     │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLES ──────────────────────────────────────────────────────────┐
 * │ • Character Promotion : 'a' (97) - 'b' (98) = -1  → Result is an int │
 * │ • Compound Promotion  : short + byte + char       → Evaluated as int │
 * │ • Re-assignment Block : byte m = 5; (byte)(m * 2) → Explicitly cast  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Character Math: Subtracted text literals showcase the underlying  │
 * │                    ASCII integers being treated as standard ints.    │
 * │ 2. Dynamic Mixed:  Combine multiple narrow types to observe compiler│
 * │                    up-casting behaviors across expressions.           │
 * │ 3. Narrowing Cast: Enforce safety boundaries via explicit outer casts│
 * │                    to prevent assignment compilation errors.          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Compiler Optimization / Expression Type Promotion            │
 * │ Limit:  Watch for unexpected high-order bit overflow when casting     │
 * │         promoted `int` values back down into a 1-byte container.     │
 * │                                                                      │
 * │ Time:   O(1) → Execution runs entirely inside standard compiler registers│
 * │                and localized CPU execution pathways.                 │
 * │                                                                      │
 * │ Space:  O(1) → Utilizes standard, low-overhead primitive variables    │
 * │                scoped completely to the immediate method frame.      │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Type_Promotion {
//     public static void main(String[] args) {
//         // Declaring two character variables
//         char a = 'a'; // ASCII value of 'a' is 97
//         char b = 'b'; // ASCII value of 'b' is 98

//         // Subtracting ASCII values of 'a' and 'b'
//         int c = a - b; // 97 - 98 = -1
//         System.out.println("Result of a - b: " + c); // Output: -1

//         // Declaring different primitive data types
//         short x = 5;
//         byte y = 25;
//         char z = 'c'; // ASCII value of 'c' is 99

//         // Performing addition of characters and integer values
//         byte bty = (byte) (x + y + z); // (97 + 98 - 1) = 194, cast to byte (-62 due to overflow)
//         System.out.println("Result of byte casting: " + bty); // Output: -62

//         // Multiplication and explicit typecasting
//         byte m = 5;
//         byte n = (byte) (m * 2); // 5 * 2 = 10, explicitly cast to byte
//         System.out.println("Result of byte multiplication: " + n); // Output: 10
//     }
// }