/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [03/06/26] → #2  [04/06/26] → #3  [05/06/26]                    │
 * │  #4  [06/06/26] → #5  [07/06/26] → #6  [08/06/26]                    │
 * │  #7  [09/06/26] → #8  [10/06/26] → #9  [11/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 12: Type Promotion in Java                                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate Java's automatic type promotion during arithmetic       │
 * │ operations. Show how byte, short, and char values are promoted      │
 * │ to int during expression evaluation and how explicit casting is     │
 * │ required when storing results back into smaller data types.         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : char a = 'a', char b = 'b'                                 │
 * │ Output : Result of a - b: -1                                        │
 * │                                                                     │
 * │ Input  : short x = 5, byte y = 25, char z = 'c'                     │
 * │ Output : Result of byte casting: -127                               │
 * │                                                                     │
 * │ Input  : byte m = 5                                                 │
 * │ Output : Result of byte multiplication: 10                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Arithmetic operations on byte, short, and char are promoted to int. │
 * │ Explicit casting is required when assigning int results to byte.    │
 * │ Overflow may occur when narrowing larger values to smaller types.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare char variables and perform subtraction.            │
 * │ Step 2 : Observe automatic promotion of char values to int.         │
 * │ Step 3 : Declare short, byte, and char variables.                   │
 * │ Step 4 : Add them together and explicitly cast the result to byte.  │
 * │ Step 5 : Demonstrate byte multiplication with explicit casting.     │
 * │ Step 6 : Print all resulting values.                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Type Promotion / Type Casting / Arithmetic Operations               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Type_Promotion {
    public static void main(String[] args) {
        
    }
}

/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 12: Type Promotion in Java                                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate Java's automatic type promotion during arithmetic       │
 * │ operations. Show how byte, short, and char values are promoted      │
 * │ to int during expression evaluation and how explicit casting is     │
 * │ required when storing results back into smaller data types.         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : char a = 'a', char b = 'b'                                 │
 * │ Output : Result of a - b: -1                                        │
 * │                                                                     │
 * │ Input  : short x = 5, byte y = 25, char z = 'c'                     │
 * │ Output : Result of byte casting: -127                               │
 * │                                                                     │
 * │ Input  : byte m = 5                                                 │
 * │ Output : Result of byte multiplication: 10                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Arithmetic operations on byte, short, and char are promoted to int. │
 * │ Explicit casting is required when assigning int results to byte.    │
 * │ Overflow may occur when narrowing larger values to smaller types.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare char variables and perform subtraction.            │
 * │ Step 2 : Observe automatic promotion of char values to int.         │
 * │ Step 3 : Declare short, byte, and char variables.                   │
 * │ Step 4 : Add them together and explicitly cast the result to byte.  │
 * │ Step 5 : Demonstrate byte multiplication with explicit casting.     │
 * │ Step 6 : Print all resulting values.                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Type Promotion / Type Casting / Arithmetic Operations               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Type_Promotion {                                        ║
* ║     public static void main(String[] args) {                         ║
* ║         // Declaring two character variables                         ║
* ║         char a = 'a'; // ASCII value of 'a' is 97                    ║
* ║         char b = 'b'; // ASCII value of 'b' is 98                    ║
* ║                                                                      ║
* ║         // Subtracting ASCII values of 'a' and 'b'                   ║
* ║         int c = a - b; // 97 - 98 = -1                               ║
* ║         System.out.println("Result of a - b: " + c); // Output: -1   ║
* ║                                                                      ║
* ║         // Declaring different primitive data types                  ║
* ║         short x = 5;                                                 ║
* ║         byte y = 25;                                                 ║
* ║         char z = 'c'; // ASCII value of 'c' is 99                    ║
* ║                                                                      ║
* ║         // Performing addition of characters and integer values      ║
* ║         byte bty = (byte) (x + y + z); // cast to byte due to overflw║
* ║         System.out.println("Result of byte casting: " + bty);        ║
* ║                                                                      ║
* ║         // Multiplication and explicit typecasting                   ║
* ║         byte m = 5;                                                  ║
* ║         byte n = (byte) (m * 2); // 5 * 2 = 10                       ║
* ║         System.out.println("Result of byte multiplication: " + n);   ║
* ║     }                                                                ║
* ║ }                                                                    ║
*╚══════════════════════════════════════════════════════════════════════╝
*/