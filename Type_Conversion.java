/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [02/06/26] → #2  [03/06/26] → #3  [04/06/26]                    │
 * │  #4  [05/06/26] → #5  [06/06/26] → #6  [07/06/26]                    │
 * │  #7  [08/06/26] → #8  [09/06/26] → #9  [10/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 10: Type Conversion (Int to Long)                            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate implicit type conversion (widening conversion) in Java. │
 * │ Assign an int value to a long variable and display the result.      │
 * │ Java automatically converts the smaller data type into a larger     │
 * │ compatible data type without requiring explicit casting.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : int a = 68                                                 │
 * │ Output : Value of b: 68                                             │
 * │                                                                     │
 * │ Explanation : The int value is automatically promoted to long       │
 * │ during assignment.                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Source value must be within the valid range of the int data type.   │
 * │ Widening conversion must be between compatible primitive types.     │
 * │ No explicit type casting is required.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare and initialize an int variable.                    │
 * │ Step 2 : Declare a long variable.                                   │
 * │ Step 3 : Assign the int value to the long variable.                 │
 * │ Step 4 : Java performs automatic widening conversion.               │
 * │ Step 5 : Print the value stored in the long variable.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Type Conversion / Widening Casting                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Type_Conversion {
    public static void main(String[] args) {
        
    }
}

/* ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 10: Type Conversion (Int to Long)                            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate implicit type conversion (widening conversion) in Java. │
 * │ Assign an int value to a long variable and display the result.      │
 * │ Java automatically converts the smaller data type into a larger     │
 * │ compatible data type without requiring explicit casting.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : int a = 68                                                 │
 * │ Output : Value of b: 68                                             │
 * │                                                                     │
 * │ Explanation : The int value is automatically promoted to long       │
 * │ during assignment.                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Source value must be within the valid range of the int data type.   │
 * │ Widening conversion must be between compatible primitive types.     │
 * │ No explicit type casting is required.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare and initialize an int variable.                    │
 * │ Step 2 : Declare a long variable.                                   │
 * │ Step 3 : Assign the int value to the long variable.                 │
 * │ Step 4 : Java performs automatic widening conversion.               │
 * │ Step 5 : Print the value stored in the long variable.               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Type Conversion / Widening Casting                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Type_Conversion {                                       ║
* ║     public static void main(String[] args) {                         ║
* ║         // Declare an integer variable                               ║
* ║         int a = 68;                                                  ║
* ║                                                                      ║
* ║         // Implicit type casting (widening) from int to long         ║
* ║         long b = a;                                                  ║
* ║                                                                      ║
* ║         // Print the value of 'b'                                    ║
* ║         System.out.println("Value of b: " + b);                      ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
