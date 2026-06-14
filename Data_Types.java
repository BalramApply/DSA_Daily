/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [01/06/26] → #2  [02/06/26] → #3  [03/06/26]                    │
 * │  #4  [04/06/26] → #5  [05/06/26] → #6  [06/06/26]                    │
 * │  #7  [07/06/26] → #8  [08/06/26] → #9  [09/00/00]                    │
 * │  #10 [00/00/00]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM : Java Data Types Declaration and Printing                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Declare and initialize various primitive and reference data types   │
 * │ in Java. Print their values to understand how different types       │
 * │ store and represent data.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ─────────────────────────────────────────────────────────┐
 * │ Output :                                                           │
 * │ Byte value: 8                                                      │
 * │ Character value: a                                                 │
 * │ Boolean value: false                                               │
 * │ Float value: 34.0                                                  │
 * │ Integer value: 108                                                 │
 * │ Short value: 240                                                   │
 * │ String value: Balram                                               │
 * │ Long value: 222255555                                              │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ No input is required.                                               │
 * │ Values must be assigned according to their respective data types.   │
 * │ Float literals should use 'f' and long literals should use 'L'.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare a byte variable and assign a small integer value.  │
 * │ Step 2 : Declare char and boolean variables with valid values.      │
 * │ Step 3 : Declare float, int, short, and long variables.             │
 * │ Step 4 : Declare a String variable to store text data.              │
 * │ Step 5 : Print all variable values using println().                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Data Types / Variables / Basic Output                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Data_Types {
    public static void main(String[] args) {
        
    }
}

 /*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM : Java Data Types Declaration and Printing                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Declare and initialize various primitive and reference data types   │
 * │ in Java. Print their values to understand how different types       │
 * │ store and represent data.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ─────────────────────────────────────────────────────────┐
 * │ Output :                                                           │
 * │ Byte value: 8                                                      │
 * │ Character value: a                                                 │
 * │ Boolean value: false                                               │
 * │ Float value: 34.0                                                  │
 * │ Integer value: 108                                                 │
 * │ Short value: 240                                                   │
 * │ String value: Balram                                               │
 * │ Long value: 222255555                                              │
 * └────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ No input is required.                                               │
 * │ Values must be assigned according to their respective data types.   │
 * │ Float literals should use 'f' and long literals should use 'L'.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare a byte variable and assign a small integer value.  │
 * │ Step 2 : Declare char and boolean variables with valid values.      │
 * │ Step 3 : Declare float, int, short, and long variables.             │
 * │ Step 4 : Declare a String variable to store text data.              │
 * │ Step 5 : Print all variable values using println().                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Data Types / Variables / Basic Output                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

// public class four {
//     public static void main(String[] args) {
//         // Declaring and initializing different data types

//         byte smallNumber = 8; // Stores small integer values (-128 to 127)
//         System.out.println("Byte value: " + smallNumber);

//         char character = 'a'; // Stores a single character
//         System.out.println("Character value: " + character);

//         boolean isFalse = false; // Stores true/false values
//         System.out.println("Boolean value: " + isFalse);

//         float floatValue = 34.0f; // Stores decimal numbers (Use 'f' for float literals)
//         System.out.println("Float value: " + floatValue);

//         int integerNumber = 108; // Stores integer values
//         System.out.println("Integer value: " + integerNumber);

//         short shortNumber = 240; // Stores short integer values (-32,768 to 32,767)
//         System.out.println("Short value: " + shortNumber);

//         String userName = "Balram"; // Stores a sequence of characters (String)
//         System.out.println("String value: " + userName);

//         long bigNumber = 222255555L; // Stores large integer values (Use 'L' for long literals)
//         System.out.println("Long value: " + bigNumber);
//     }
// }
