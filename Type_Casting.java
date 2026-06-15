/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [03/06/26] → #2  [04/06/26] → #3  [05/06/26]                    │
 * │  #4  [06/06/26] → #5  [07/06/26] → #6  [08/06/26]                    │
 * │  #7  [09/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 11: Explicit Type Casting                                    ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate explicit type casting (narrowing conversion) in Java.   │
 * │ Convert a float value into an int and a char value into its         │
 * │ corresponding ASCII/Unicode integer representation.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : float marks = 99.99f                                       │
 * │ Output : Integer value of marks: 99                                 │
 * │                                                                     │
 * │ Input  : char ch = 'a'                                              │
 * │ Output : ASCII value of 'a': 97                                     │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ 99.99f becomes 99 after explicit casting to int.                    │
 * │ Character 'a' is represented by integer value 97.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Explicit casting is required when converting float to int.          │
 * │ Fractional digits are truncated during narrowing conversion.        │
 * │ Character values can be converted to their numeric code values.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare and initialize a float variable.                   │
 * │ Step 2 : Cast the float value to int using (int).                   │
 * │ Step 3 : Print the converted integer value.                         │
 * │ Step 4 : Declare and initialize a char variable.                    │
 * │ Step 5 : Cast the char value to int using (int).                    │
 * │ Step 6 : Print the ASCII/Unicode value of the character.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Type Conversion / Explicit Casting (Narrowing)                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Type_Casting {
    public static void main(String[] args) {
        
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM : Explicit Type Casting                                      ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate explicit type casting (narrowing conversion) in Java.   │
 * │ Convert a float value into an int and a char value into its         │
 * │ corresponding ASCII/Unicode integer representation.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : float marks = 99.99f                                       │
 * │ Output : Integer value of marks: 99                                 │
 * │                                                                     │
 * │ Input  : char ch = 'a'                                              │
 * │ Output : ASCII value of 'a': 97                                     │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ 99.99f becomes 99 after explicit casting to int.                    │
 * │ Character 'a' is represented by integer value 97.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Explicit casting is required when converting float to int.          │
 * │ Fractional digits are truncated during narrowing conversion.        │
 * │ Character values can be converted to their numeric code values.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare and initialize a float variable.                   │
 * │ Step 2 : Cast the float value to int using (int).                   │
 * │ Step 3 : Print the converted integer value.                         │
 * │ Step 4 : Declare and initialize a char variable.                    │
 * │ Step 5 : Cast the char value to int using (int).                    │
 * │ Step 6 : Print the ASCII/Unicode value of the character.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Type Conversion / Explicit Casting (Narrowing)                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Type_Casting {                                          ║
* ║     public static void main(String[] args) {                         ║
* ║         // Declaring a floating-point variable                       ║
* ║         float marks = 99.99f;                                        ║
* ║                                                                      ║
* ║         // Typecasting float to int (removes decimal part)           ║
* ║         int mark = (int) marks;                                      ║
* ║                                                                      ║
* ║         // Printing the integer value                                ║
* ║         System.out.println("Integer value of marks: " + mark);       ║
* ║                                                                      ║
* ║         // Declaring a character variable                            ║
* ║         char ch = 'a';                                               ║
* ║                                                                      ║
* ║         // Typecasting char to int (ASCII value of 'a')              ║
* ║         int num = (int) ch;                                          ║
* ║                                                                      ║
* ║         // Printing the ASCII value of character 'a'                 ║
* ║         System.out.println("ASCII value of 'a': " + num);            ║
* ║     }                                                                ║
* ║ }                                                                    ║
*/╚══════════════════════════════════════════════════════════════════════╝
