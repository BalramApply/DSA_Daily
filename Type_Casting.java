/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [03/06/26] → #2  [04/06/26] → #3  [05/06/26]                    │
 * │  #4  [06/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 11: Explicit Type Casting                                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate explicit narrowing and type conversions in Java:         │
 * │ 1. Converting a floating-point value down into a truncated integer.  │
 * │ 2. Extracting the foundational numerical ASCII/Unicode value of a    │
 * │    given character code literal.                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Float Input:  99.99f  →  Output Int: 99                              │
 * │ Char Input:   'a'     →  Output Int: 97                              │
 * │                                                                      │
 * │ Explanation:                                                         │
 * │   • Float conversion forcefully truncates all fractional decimals.   │
 * │   • Character evaluation maps the character to its exact ASCII value.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Narrowing Cast: Instatiate a float variable and truncate it to a  │
 * │                    32-bit integer via explicit `(int)` assignment.   │
 * │ 2. Text Mapping:   Declare a standard char token and read its storage │
 * │                    index via a numeric cast block expression.        │
 * │ 3. Output Stream:  Forward both evaluated instances directly to the  │
 * │                    system console display line interface.            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Explicit Casting / Data Truncation                           │
 * │ Limit:  Narrowing float conversions permanently drop trailing scale. │
 * │                                                                      │
 * │ Time:   O(1) → Direct machine-level bitwise masking and casting runs │
 * │                in constant execution intervals.                      │
 * │                                                                      │
 * │ Space:  O(1) → Memory properties remain entirely bound to a small    │
 * │                handful of localized primitive type frames.            │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Type_Casting {
    public static void main(String[] args) {
        
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 11: Explicit Type Casting                                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate explicit narrowing and type conversions in Java:         │
 * │ 1. Converting a floating-point value down into a truncated integer.  │
 * │ 2. Extracting the foundational numerical ASCII/Unicode value of a    │
 * │    given character code literal.                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Float Input:  99.99f  →  Output Int: 99                              │
 * │ Char Input:   'a'     →  Output Int: 97                              │
 * │                                                                      │
 * │ Explanation:                                                         │
 * │   • Float conversion forcefully truncates all fractional decimals.   │
 * │   • Character evaluation maps the character to its exact ASCII value.│
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Narrowing Cast: Instatiate a float variable and truncate it to a  │
 * │                    32-bit integer via explicit `(int)` assignment.   │
 * │ 2. Text Mapping:   Declare a standard char token and read its storage │
 * │                    index via a numeric cast block expression.        │
 * │ 3. Output Stream:  Forward both evaluated instances directly to the  │
 * │                    system console display line interface.            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Explicit Casting / Data Truncation                           │
 * │ Limit:  Narrowing float conversions permanently drop trailing scale. │
 * │                                                                      │
 * │ Time:   O(1) → Direct machine-level bitwise masking and casting runs │
 * │                in constant execution intervals.                      │
 * │                                                                      │
 * │ Space:  O(1) → Memory properties remain entirely bound to a small    │
 * │                handful of localized primitive type frames.            │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Type_Casting {
//     public static void main(String[] args) {
//         // Declaring a floating-point variable
//         float marks = 99.99f;
        
//         // Typecasting float to int (removes decimal part)
//         int mark = (int) marks;
        
//         // Printing the integer value
//         System.out.println("Integer value of marks: " + mark);

//         // Declaring a character variable
//         char ch = 'a';
        
//         // Typecasting char to int (ASCII value of 'a')
//         int num = (int) ch;

//         // Printing the ASCII value of character 'a'
//         System.out.println("ASCII value of 'a': " + num);
//     }
// }
